package com.roitraining.cert.streams;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreamExperiment {
    public static void main(String[] args) {
        //of appears in most streams
        IntStream fiveNumbers = IntStream.of(54,34,67,32,67);
        Random rand = new Random();
        //Ahh, turns out the Random class can generate all sorts
        //of primitive streams .ints(), .doubles(), .longs()
        //[inclusive, exclusive)
        IntStream randomNums = rand.ints(1, 100);
        OptionalDouble avg = randomNums.limit(10).peek(System.out::println).average();
        if(avg.isPresent())
            System.out.println("Average = " + avg.getAsDouble());
        Stream<Integer> lotsOfNumbers = Stream.iterate(1, n->  rand.nextInt(100));
        //lotsOfNumbers.limit(10).average(); //won't compile, not a primitive stream
        avg = lotsOfNumbers.limit(10).mapToInt(x->x).average();
        if(avg.isPresent())
            System.out.println("Average = " + avg.getAsDouble());
        //or how about
        System.out.println("Average (alt version) = " + avg.orElse(Double.NaN));
    }
}
