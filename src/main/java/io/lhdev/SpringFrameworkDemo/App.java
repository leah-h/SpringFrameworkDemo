package io.lhdev.SpringFrameworkDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // Dependency Injection
        // Advantage of spring framework, no need to recomplie, we're not changing
        // the Java code here...
//        Vehicle obj = (Vehicle)context.getBean("vehicle");
//        obj.drive();
//
//        Vehicle obj = (Vehicle)context.getBean("bike");
//        obj.drive();

        Tire t = (Tire) context.getBean("tire");
        System.out.println(t);
    }
}
