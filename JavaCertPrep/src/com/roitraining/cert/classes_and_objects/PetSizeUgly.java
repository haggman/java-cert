package com.roitraining.cert.classes_and_objects;

public enum PetSizeUgly { //so think of this as like an "abstract" type
    SMALL { //and each of these is like a subclass, implementing the method
        public String getSizeRange(){
            return "0-1 stone";
        }
    },
    MEDIUM {
        public String getSizeRange(){
            return "1-2 stone";
        }
    },
    LARGE {
        public String getSizeRange(){
            return "2-5 stone";
        }
    },
    XLARGE {
        public String getSizeRange(){
            return "5-* stone";
        }
    }; //again, don't miss ;
    public abstract String getSizeRange(); //abstract method easy "instance" must implement
}
