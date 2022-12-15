package com.lang.thread;

import java.util.function.IntConsumer;

/**
 * @author WuJi
 **/
public class FizzBuzz {
    public static void main(String[] args) throws InterruptedException {
        FizzBuzzCyclicBarrier fizzBuzzCyclicBarrier = new FizzBuzzCyclicBarrier(15);
        IntConsumer intConsumer = System.out::println;
        Runnable printFizz = () -> System.out.println("fizz");
        Runnable printBuzz = () -> System.out.println("buzz");
        Runnable printFizzBuzz = () -> System.out.println("fizzbuzz");
        new Thread(() -> {
            try {
                fizzBuzzCyclicBarrier.fizz(printFizz);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
        new Thread(() -> {
            try {
                fizzBuzzCyclicBarrier.buzz(printBuzz);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
        new Thread(() -> {
            try {
                fizzBuzzCyclicBarrier.fizzbuzz(printFizzBuzz);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
        new Thread(() -> {
            try {
                fizzBuzzCyclicBarrier.number(intConsumer);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }
}
