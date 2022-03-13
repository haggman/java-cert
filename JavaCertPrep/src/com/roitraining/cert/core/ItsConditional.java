package com.roitraining.cert.core;

public class ItsConditional {
    public static void main(String[] args) {
        int i = 0;
        //if(i) System.out.println("Won't Compile");
        if(i!=0) System.out.println("Works");
        if (i==0 || ++i==1); //i still 0????
        else System.out.println("Legal but???");
        if(i==0)
            System.out.println("Works too");
        if(i==0){
            System.out.println("Works fine");
        } else if(i!=0) //No elseif, wrong language
            System.out.println("Should be in {}");
        else {
            System.out.println("Like this");
        }
        if (i==0 | ++i==1) //i now 1!
            System.out.println(i); //prints
        if(i==0 & ++i==1)//i now 2!!
            System.out.println(i);//doesn't print
        String word = "Hello", word2 = " there";
    }
}
