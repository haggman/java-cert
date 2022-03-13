package com.roitraining.cert.core;

public class OrderOfOpps {
    public static void main(String[] args) {
        int i = 1, j = 2, k = 3, l = 4, m = 5, answer;
        //Remember, items at sale precedence eval left to right
        answer = i + j - k * l % m / 2; //3-3*4%5/2 = 3-12%5/2 = 3-2/2 = 2
        System.out.println("i+j-k*l%m=" + answer); //2
    }
}
