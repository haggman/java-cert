package com.roitraining.cert.classes_and_objects;

public class PetNameTooLongException extends RuntimeException {
    private int attemptedLength;
    public PetNameTooLongException(String message,int attemptedLength ){
        super(message);
        this.attemptedLength = attemptedLength;
    }

    public int getAttemptedLength() {
        return attemptedLength;
    }
}

class ExceptionRunner{
    private static final int maxName = 9;
    public static void main(String[] args) {
        ExceptionRunner er = new ExceptionRunner();
        er.printName("Pat");
        er.printName("Lakshmanan");
    }
    public void printName(String name) throws PetNameTooLongException{
        if(name.length()>maxName)
            throw new PetNameTooLongException(name + " too long", name.length());
        System.out.println("Good name: " + name);
    }
}
