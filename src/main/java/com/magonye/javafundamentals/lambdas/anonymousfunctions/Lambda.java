package com.magonye.javafundamentals.lambdas.anonymousfunctions;

public class Lambda {

    public static void main(String[] args) {

        //No lambda form
        new Thread(
                new Runnable() {
                    public void run() {
                        System.out.println("Hello world!");
                    }
                }
        ).start();

        //Lambda form
        new Thread(
                () -> System.out.println("Hello, I'm using a lambda")
        ).start();
    }
}
