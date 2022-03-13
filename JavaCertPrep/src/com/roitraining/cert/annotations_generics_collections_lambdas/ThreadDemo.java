package com.roitraining.cert.annotations_generics_collections_lambdas;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("Running Anonymous Thread");
            }
        });
        thread.start();
    }
}

class ThreadDemo2 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Lambda Thread"));
        thread.start();
    }
}
