package com.roitraining.cert.classes_and_objects;

import java.util.Arrays;

public class MethodOverloads {
    public void process(String s){prt("String", s);}

    public void process(int i){prt("int", i);}//unboxed before boxed
    public void process(Integer n){prt("Integer", n);} //prefer exact type match
    public void process(Number n){prt("Number", n);} //prefer exact type match
    public void process(int... nums){prt("int...", nums);}//var args processed last
    public void process(Integer... nums){prt("Integer...", nums);}//arrays always boxed, so these two ambiguous


    public static void main(String[] args) {
        MethodOverloads mo = new MethodOverloads();
        String name = "hello";
        mo.process(name);//String version, arg=hello
        int i = 13;
        mo.process(i);//int version, arg=13
        Integer iInt = i;
        mo.process(iInt);//Integer version, arg=13
        //mo.process(i, i);//won't compile, since once boxed it can't tell int[] from Integer[]
        //mo.process(i, iInt); //won't compile, since once boxed it can't tell int[] from Integer[]
        Number n = i;//Number version, arg=13
        mo.process(n);
    }
    void prt(String version, Object arg){
        if(arg.getClass().isArray())
            arg = Arrays.toString((int[])arg);
        System.out.printf("%s version, arg=%s%n", version, arg);
    }
}
