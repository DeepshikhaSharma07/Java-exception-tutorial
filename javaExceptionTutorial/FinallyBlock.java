package com.tts.day5.javaExceptionTutorial;


public class FinallyBlock {
    public static void main(String args[]) {
        int a[] = new int[2];
        try {
            System.out.println("Access element three :" + a[1]);
        } catch (Exception e) {
            System.out.println("Exception thrown  :" + e);
        } finally {
            a[0] = 6;
            System.out.println("First element value: " + a[0]);
            System.out.println("The finally statement is executed");
        }

        System.out.println("Out of the block");
    }


}
