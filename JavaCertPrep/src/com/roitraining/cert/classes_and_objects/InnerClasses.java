package com.roitraining.cert.classes_and_objects;

public class InnerClasses {
    private int luckyNumber;
    private static String msg;

    class TypicalInner {
        public TypicalInner() {
            luckyNumber = 13;
            System.out.println("In TypicalInner, and luckyNumber = " + luckyNumber);
        }
    }

    private class HiddenInner {
        public HiddenInner() {
            luckyNumber = 7;
            System.out.println("In HiddenInner, and luckyNumber = " + luckyNumber);
        }
    }

    static class StaticInner {//static classes only allowed as inner classes

        public StaticInner() {
            // System.out.println("In TypicalInner, and luckyNumber = " + luckyNumber);//compile error
            msg = "Hello";
            System.out.println("In StaticInner, and msg = " + msg);
        }
    }
//    public static void main(String[] args) {
//        InnerClasses.StaticInner si = new InnerClasses.StaticInner(); //static method main, so this is fine
//        //Prints: In StaticInner, and msg = Hello
//        //TypicalInner ti = new TypicalInner();//compile error
//        InnerClasses ic = new InnerClasses();
//        InnerClasses.TypicalInner ti = ic.new TypicalInner();
//        //Prints: In TypicalInner, and luckyNumber = 13
//        InnerClasses.HiddenInner hi = ic.new HiddenInner();
//        //Prints: In HiddenInner, and luckyNumber = 7
//    }
}
class Runner{
    public static void main(String[] args) {
        InnerClasses.StaticInner si = new InnerClasses.StaticInner(); //static method main, so this is fine
        //Prints: In StaticInner, and msg = Hello
        //TypicalInner ti = new TypicalInner();//compile error
        InnerClasses ic = new InnerClasses();
        InnerClasses.TypicalInner ti = ic.new TypicalInner();
        //Prints: In TypicalInner, and luckyNumber = 13
        //InnerClasses.HiddenInner hi = ic.new HiddenInner(); //Compile error
    }
}
