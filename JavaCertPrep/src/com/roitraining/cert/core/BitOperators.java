package com.roitraining.cert.core;

public class BitOperators {
    public static void main(String[] args) {
        int bit1 = 0b00000000_00000000_00000000_00000010;
        int bit2 = 0b10000000_00000000_00000000_00000010;
        System.out.println(bit1); //2
        System.out.println(Integer.toBinaryString(bit2)); //0
        //~ bitwise compliment, flips each bit to it's opposite
        //Integer.toBinaryString only prints bits when value negative
       // System.out.println(Integer.toBinaryString(~bit1)); //11111111111111111111111111111111
    }
}
