package com.roitraining.cert.core;

public class AutoBoxPrimitives {
    public static void main(String[] args) {
        int i = 3;
        Integer j = i; //autoboxed the int
        i = j;     //unboxed
        int k = Integer.valueOf(4); //Legal, but ???
//        int l[] = new Integer[3];//compile error
        i = Integer.parseInt("-4");//string to int
    }
}
