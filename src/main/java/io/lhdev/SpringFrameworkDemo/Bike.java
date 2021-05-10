package io.lhdev.SpringFrameworkDemo;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

    public void drive() {
        System.out.println("Riding my bike...");
    }
}
