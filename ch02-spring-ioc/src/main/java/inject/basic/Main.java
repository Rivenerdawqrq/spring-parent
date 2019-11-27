package inject.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext_basic.xml");
        DbConfig first = context.getBean("first", DbConfig.class);
        System.out.println(first);
    }
}
