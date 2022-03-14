package com.sravan.functionalInterface;

public class funcinterface {
    public static void main(String[] args) {
        String h="Hello";
        Foo foo = (x)->x+" Sravan";
        System.out.println(foo.method(h));
    }
}
