package com.roitraining.cert.classes_and_objects;

public class HidingFieldsParent {
    protected int luckyNumber = 13; //Child, and package, have direct access. Bad design.
    public int getLuckyNumber() {return luckyNumber;}
    public void setLuckyNumber(int luckyNumber) {this.luckyNumber = luckyNumber;}
    public void doSomething(){
        System.out.println("HidingFieldsParent doSomething");
    }
}

class HidingFieldsChild extends HidingFieldsParent{
    private int luckyNumber = 7; //ok, hiding the parents field, or making public
    //protected int getLuckyNumber() {return luckyNumber;}//compile error, can't reduce visibility of method
    public int getLuckyNumber(){return luckyNumber;} //now hiding parents get/set with new functionality
    public void setLuckyNumber(int luckyNumber) {this.luckyNumber = luckyNumber;}
}

class HidingRunner{
    public static void main(String[] args) {
        HidingFieldsParent hfp = new HidingFieldsChild();
        hfp.doSomething();//Prints: HidingFieldsParent doSomething
        System.out.println(hfp.getLuckyNumber());//Prints 7
    }
}
