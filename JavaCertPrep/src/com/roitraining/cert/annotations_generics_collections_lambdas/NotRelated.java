package com.roitraining.cert.annotations_generics_collections_lambdas;

import java.util.*;

//This is an easy trap to fall into
public class NotRelated {
    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<>();
        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
        //We may know the elements are related, illustrated by:
        numberList.add(integerList.get(0)); //works like a charm
        //But the collections themselves are not parent/child, so
        //numberList = integerList;// compile error
        //They are both lists! You are essentially, List<Number> = List<Integer>
        //Now, this will work:
        Collection<Integer> integerCollection =integerList; //works
    }
}




