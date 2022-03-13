package com.roitraining.cert.core;

public class GoodSwitch {
    public static void main(String[] args) {
        int code = 3;
        switch (code) {
            case 1: //1 and 2 are classic format
                System.out.println("Classic format here");
                break;
            case 2:
                System.out.println("Though these don't print");
                break;
            default: //Weird here, but ok
                System.out.println("");
                //Watch this fallthrough!
            case 3: //This is a fallthrough, watch it
                System.out.println("I print");
            case (4*1): //() around value ok
                System.out.println("I print too");
                break;
            case 5:
                System.out.println("Not me...");
        }
    }
}
