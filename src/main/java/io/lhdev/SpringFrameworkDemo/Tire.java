package io.lhdev.SpringFrameworkDemo;

public class Tire {

    private String brand;

//    Constructor injection
    public Tire(String brand) {
        super();
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
