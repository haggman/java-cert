package com.roitraining.cert.classes_and_objects;

import com.roitraining.cert.shared.Dog;

public class StringConcat {
    public static void main(String[] args) {
        String s = "My Lucky";
        Dog rex = new Dog("Rex");
        System.out.println(s + " " + "Number: " + 13 );
        System.out.println("Wonder what Rex looks like as string?: " +
                rex); //calls dog's toString()
        //Wonder what Rex looks like as string?: Dog{name='Rex', owner=null}
        //Watch your ordering and typing! When does add change to concat?
        System.out.println(5+7*2+""+5*3+7+8);//191578
        System.out.println((5+7*2)+""+(5*3+7+8));//1930
    }
}
