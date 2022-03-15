package com.roitraining.cert.streams;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.IntStream;

public class StreamStats {
    public static void main(String[] args) {
        Random rand = new Random();
        IntStream randomNums = rand.ints(1, 100);
        IntSummaryStatistics stats =
                randomNums.limit(10).peek(System.out::println).summaryStatistics();

        System.out.println(stats);
        //IntSummaryStatistics{count=10, sum=624, min=19, average=62.400000, max=99}
    }
}
