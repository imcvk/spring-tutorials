package com.spring;

public class PrintableFactory {

    public Printable getPrintable() {
        return new A();
    }
}
