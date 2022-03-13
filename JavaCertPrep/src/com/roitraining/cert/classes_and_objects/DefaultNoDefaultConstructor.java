package com.roitraining.cert.classes_and_objects;
//In file DefaultNoDefaultConstructor.java
class HasDefault{
    //get a default constructor if none defined
}
class HasNoDefault{
    int luckyNumber;
    public HasNoDefault(int aNumber){luckyNumber = aNumber;}
}
//class ChildOfHasNo extends HasNoDefault{ //compile error
//    public ChildOfHas(){//compile error
//        //Parent has no default, so must have super(someInt)
//    }
//}
class ChildOfHas extends HasDefault{
    public ChildOfHas(){
        //works fine
    }
}
