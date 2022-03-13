package com.roitraining.cert.classes_and_objects;
//Might be useful when limiting object count to one (Singleton)
//or to prevent instantiation, like for all static utility method class
public class SingltonExample {
    private static SingltonExample instance;
    static{
        instance = new SingltonExample();
    }
    private SingltonExample(){ //Inaccessible from outside world
    }
    public static SingltonExample instance(){
        return instance;
    }
    public void getConnection(){
        System.out.println("Let me get you a connection...");
    }
}
class SingletonRunner{
    public static void main(String[] args) {
        //SingltonExample se = new SingltonExample();//Compile error
        SingltonExample se = SingltonExample.instance();
        se.getConnection(); //Prints: Let me get you a connection...
    }
}
