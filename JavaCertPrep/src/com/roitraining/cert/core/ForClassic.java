package com.roitraining.cert.core;

public class ForClassic {
    public static void main(String[] args) {
        String s = "Hello World";
        int x = 0;
        //Below would be cleaner with the { }
        for(int i = 0; i<s.length(); i++)
            System.out.println(s.charAt(i));
//            System.out.println("Not in loop! " + i);
            //Why is the above line a compile error?
        for(int i = s.length(); --i>=0;) { //ugly, but works
            System.out.println(s.charAt(i));
        }
        for(;x<10; x++){ //see what I did there?
            System.out.println("x="+x);
        }
        System.out.println("late x="+x); //what's x?
        for(int i = 0; i<100; i++);
            System.out.println("Why do I print just once?");
//        for(int x = 0; x<100; x++)
//            System.out.println("Why don't I compile?");
        for(int i=0, j=0; i<5&&j<6; i++,j++){
            System.out.println("In init, all same type");
        }
    }
}
