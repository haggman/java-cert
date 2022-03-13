package com.roitraining.cert.classes_and_objects;
//In ExposingFields.java
class NotSoExposedFields {
    private String name;
    protected String getName() {return name;}
    protected void setName(String name) {this.name = name;}
}

class ExposingFields extends NotSoExposedFields{
    @Override
    public String getName() {
        //Do something unique, or just expose the field
        return super.getName();
    }
//    @Override
//    private void setName(String name) { //compile error
//        super.setName(name);
//    }
    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
