package com.roitraining.cert.streams;

import com.roitraining.cert.shared.OwnerArrayList;
import com.roitraining.cert.shared.OwnerBuilder;
import com.roitraining.cert.shared.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicStreams {
    public static void main(String[] args) {
        OwnerArrayList owner = OwnerBuilder.buildOwnerArrayList();
        List<Pet> pets = owner.getPetList();
        Random rand = new Random();
        //Create some basic streams
        Stream<Pet> boring = Stream.empty(); //finite
        Stream<Integer> sInts = Stream.of(1,2,3,4,5);//finite
        Stream<Pet> sPets = pets.stream();//finite
        //for small streams you won't want to use the parallel
        //versions, but for large streams they are much faster
        //concurrent, multithreaded
        Stream<Pet> badHere = pets.parallelStream();//finite
//        Streaming random numbers 1-100 until 13 comes up, then quit
        Stream<Integer> lotsOfNumbers = Stream.iterate(1, n -> n!=13, n->  rand.nextInt(100));//finite or infinite
        //Remember though, lazy execution. Until I provide a terminal operation it doesn't start
//        lotsOfNumbers.forEach(System.out::println);//print the random numbers out
        //Note, you can't use a stream with a classic for each loop
//        System.out.println(lotsOfNumbers.count());//stream, count, reduce, report: 200
//        System.out.println(lotsOfNumbers.count());//Exception! Can't reuse the stream.
//        Optional<Integer> minOp = lotsOfNumbers.min((n1,n2)->n1-n2); //get the optional holding min, perhaps
//        if(minOp.isPresent()) //make sure it has a value
//            System.out.println(minOp.get()); //Likely 1
//        System.out.println(lotsOfNumbers.reduce(1,(n1,n2)->n1+n2));//11668, this time
//        StringBuilder resultAsText = lotsOfNumbers.collect( //Know this syntax for the exam
//                StringBuilder::new, //create the collector object
//                StringBuilder::append, //append the next string into the builder
//                StringBuilder::append);//if multiple collectors, how do the get combined
//        System.out.println(resultAsText);

        //In real life, there are tons of collectors, like:
        List<Integer> resultList = lotsOfNumbers.collect(Collectors.toCollection(ArrayList::new));
        System.out.println(resultList);
    }
}
