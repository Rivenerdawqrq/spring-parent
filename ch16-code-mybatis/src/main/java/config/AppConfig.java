package config;

import com.alibaba.druid.pool.DruidDataSource;
import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@PropertySource("classpath:db.properties")//读取外部文件
@MapperScan("com.dao") //mybatis-spring提供的扫描mapper接口用来创建实现类
@ComponentScan({"com.service","com.aspect"}) //扫描业务类
@EnableTransactionManagement//开启事务功能
@EnableAspectJAutoProxy
public class AppConfig {
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.password}")
    private String pwd;
    @Value("${jdbc.username}")
    private String username;
    @Bean
    public DataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(pwd);
        druidDataSource.setUrl(url);
        return druidDataSource;
    }
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception{
        SqlSessionFactoryBean sqlSessionFactoryBean =  new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());

        //这个类支持路径模式,比如classpath*以及ant格式
        PathMatchingResourcePatternResolver patternResolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = patternResolver.getResources("classpath*:com/dao/**/*.xml");
        sqlSessionFactoryBean.setMapperLocations(resources);

        //日志
        sqlSessionFactoryBean.setConfiguration(configuration());

        //配置插件
        sqlSessionFactoryBean.setPlugins(pageInterceptor());
        return sqlSessionFactoryBean.getObject();
    }

    //事务
    @Bean
    public DataSourceTransactionManager txManager(){
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource());
        return transactionManager;
    }

    //不需要加bean注解,因为它不需要注册到spring中.

    public org.apache.ibatis.session.Configuration configuration(){
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setLogImpl(StdOutImpl.class);
        //这个配置是把下划线(underScore)转换为驼峰命名,表user_name ->userName
        configuration.setMapUnderscoreToCamelCase(true);
        return configuration;
    }

    public PageInterceptor pageInterceptor(){
        PageInterceptor pageInterceptor = new PageInterceptor();
        Properties properties = new Properties();
        properties.put("supportMethodsArguments","true");
        properties.put("reasonable","true");
        pageInterceptor.setProperties(properties);
        return pageInterceptor;
    }



}
