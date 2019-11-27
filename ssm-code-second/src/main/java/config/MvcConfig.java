package config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.interceptor.MyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.SimpleFormatter;

@Configuration
@EnableWebMvc //等价于 mvc:annotation-driven
@ComponentScan({"com.controller","com.interceptor"})
public class MvcConfig implements WebMvcConfigurer {
//    //视图资源解析器
//    @Bean
//    public InternalResourceViewResolver internalResourceViewResolver(){
//        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
//        internalResourceViewResolver.setPrefix("/WEB-INF/views/");
//        internalResourceViewResolver.setSuffix(".jsp");
//        return internalResourceViewResolver;
//    }
    //效果和上面的一样
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        //默认值为 prefix:/WEB-INF/   suffix: .jsp
        registry.jsp("/WEB-INF/views/",".jsp");
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        //日期转换
        registry.addFormatter(new DateFormatter("yyyy-MM-dd"));
    }
    //消息转换器
    //消息转换器是用在生成响应体（ResponseBody）以及读取请求体（RequestBody）的时候的数据转换
    /**
     *这里添加的转换器会导致不会添加默认转换器
     * 如果想保留默认转换器的情况下添加消息转换器，可以重写extendMessageConverters方法
     * @param converters
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        SimpleDateFormat simpleFormatter = new SimpleDateFormat("yyyy-MM-dd");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setDateFormat(simpleFormatter);
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter(objectMapper);
        converters.add(converter);
    }

    //静态资源
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        ResourceHandlerRegistration resourceHandlerRegistration = registry.addResourceHandler("/static/**");
        resourceHandlerRegistration.addResourceLocations("classpath:/static/");
    }
    //拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration interceptorRegistration = registry.addInterceptor(new MyInterceptor());
        interceptorRegistration.addPathPatterns("/**");
    }
}
