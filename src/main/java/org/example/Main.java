package org.example;



public class Main {
    public static void main(String[] args) {

        //Task 2
        FizzBuzz fizzBuzz = new FizzBuzz(15);

        try {
            fizzBuzz.printResult();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Task 1
        OutputToLog outputToLog = new OutputToLog();
        outputToLog.runEveryFiveSecondsTask();

    }
}