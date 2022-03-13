package com.roitraining.cert.annotations_generics_collections_lambdas;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD}) //can use this annotation where?
@Retention(RetentionPolicy.RUNTIME)//Kept after compie, notice use of value() and a constant
@Inherited public @interface Domesticated { //public or package-private, and this will inherit to child classes
    //public abstract by default, implemented by compiler
    //type needs to be == comparable
    int scale(); //looks like an abstract method, but works like get/set behind scenes
    int SCALE_MAX = 5; //static final constant
    boolean requiresSpecialTraining() default false;//optional, thanks to default value
    //protected int scale2();//compile error, must be public
    public abstract boolean experimental() default false; //ok, but default modifiers
    //String certification() default new String("None"); //compile error, not constant (==)
    String certification() default "None";
}

@interface Certifications{
    Certification[] value(); //notice default value member
}
@Repeatable(Certifications.class) //name of collecting annotation type
@interface Certification{
    String name();
    boolean required();
}

@Domesticated(scale = 3) //other values all defaults
//Could have other annotations here
class AnnotationTesting{
    //@Domesticated(scale = 3,requiresSpecialTraining = 1) //compile error, type
    public void doSomething(){}
    //@Domesticated scale = 3 //compile error, (required)
    public void doMore(){}
    //@Domesticated //compile error, scale has no default
    public void doMore2(){}
    @Certification(name= "transport", required = true)
    @Certification(name= "sole handling", required = true)
    public void takeHome(){}
}