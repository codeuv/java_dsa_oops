package com.codeuv.AbstractClass;

public abstract class Base {
    abstract void add(int a , int b);
    int a = 100;

    private void subract(int a, int b) {
        System.out.println("Inside private subtract "+(a - b));
    }
}
