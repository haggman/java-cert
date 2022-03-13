package com.roitraining.cert.classes_and_objects;

import java.time.LocalDate;

public class DemoWithAssertions {
    public static void main(String[] args) { //make sure to add -ea to your java VM Options
        LocalDate dateInPast = LocalDate.of(1968,2,8);
        int low = 3, high = 13;
        //When assertions are disabled, these are all skipped
        assert LocalDate.now().isAfter(dateInPast);
        assert (low<high); //() optional
        assert (low!=high): "low shouldn't = high"; //don't forget ;, statement like others
        assert low>high: "Low still should be lower than high"; //throws AssertionError with this message
        System.out.println("Never get here!");
        //assert "Anything not boolean";//compile error
        //assert 13;                    //still not boolean
        //assert.equals(..);            //compile error, assert isn't a method
    }
}
