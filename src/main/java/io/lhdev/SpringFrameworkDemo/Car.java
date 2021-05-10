package io.lhdev.SpringFrameworkDemo;

import org.springframework.stereotype.Component;

// Annotation based configuration
@Component
public class Car implements Vehicle {

    public void drive() {
        System.out.println("Drive working...");
    }
}
