package com.roitraining.cert.concurrency;

import java.util.concurrent.*;

public class CallableDogRacer {
    public static void main(String[] args) {
        ExecutorService service = null;

        try {
            service = Executors.newSingleThreadExecutor();
            //The futures will contain a value, but not until the threads finish in the...
            //notice the use of submit rather than execute.
            // There's also an invokeAll and invokeAny(List of tasks)
            Future<Integer> d1Future = service.submit(new CallableGreyhound("First Dog"));
            Future<Integer> d2Future = service.submit(new CallableGreyhound("Second Dog"));
            //When the dogs are done, let's see how many laps they each did
            //Notice the optional timeout
            System.out.printf("First Dog did %s laps.%n", d1Future.get(1, TimeUnit.MINUTES));
            System.out.printf("Second Dog did %s laps.%n", d2Future.get());
        } catch (TimeoutException | InterruptedException | ExecutionException e) {
            System.err.println("Threading blew up: " + e);
            e.printStackTrace();
        } finally {
            service.shutdown();
        }
    }
}
