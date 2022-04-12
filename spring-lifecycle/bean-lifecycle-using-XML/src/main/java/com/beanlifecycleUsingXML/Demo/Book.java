package com.beanlifecycleUsingXML.Demo;

public class Book {
    public double price;

    public Book() {
        super();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting price.");
        this.price = price;
    }


    public String toString() {
        return "Book{" +
                "price=" + price +
                '}';
    }

    public void init(){
        System.out.println("inside init");
    }
    public void destroy(){
        System.out.println("Destroy method.");
    }
}
