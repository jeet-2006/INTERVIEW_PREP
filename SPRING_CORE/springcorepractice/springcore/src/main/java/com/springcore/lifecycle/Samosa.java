package com.springcore.lifecycle;

public class Samosa {
    int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public void init() {
        System.out.println("Hey I am available");
    }

    public void destroy() {
        System.out.println("I am dying");
    }
}
