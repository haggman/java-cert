package com.roitraining.cert.streams;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProblemStreams {
    public static void main(String[] args) {
        //can you spot the issues
        IntStream.generate(()->13).filter(x->x<5).
                limit(3).sorted().forEach(System.out::println);

        Stream.generate(()->"Hello World").
                filter(s -> s.startsWith("h")).limit(2).forEach(System.out::println);

        OptionalDouble oResult= DoubleStream.iterate(1, i->i+1).min();
        System.out.println(oResult.orElse(Double.NaN));
    }
}
