package com.example.library_asdm;

public class Function_ASDM implements Implement_ASDM{
    int c;
    @Override
    public int add(int a, int b) {
        c=a+b;
        return c;
    }

    @Override
    public int subtract(int a, int b) {
        c=a-b;
        return c;

    }

    @Override
    public int multiply(int a, int b) {
        c=a*b;
        return c;

    }

    @Override
    public int divide(int a, int b) {
        c=a/b;
        return c;
    }
}
