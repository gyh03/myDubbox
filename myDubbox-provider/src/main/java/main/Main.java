package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 */
public class Main {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-demo-provider.xml","spring-mvc.xml"});
        context.start();

        System.in.read(); 
    }

}
