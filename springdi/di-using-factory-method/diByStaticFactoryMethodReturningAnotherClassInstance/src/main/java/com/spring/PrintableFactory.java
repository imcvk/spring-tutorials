package com.spring;

public class PrintableFactory {
    public static Printable getPrintable() {
        return new A();
    }
}
