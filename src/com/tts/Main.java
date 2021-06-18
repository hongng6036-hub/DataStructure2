package com.tts;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //This adds up all the numbers in the array.
        int[] arrayNumbers = {1,2,3,4};
        int sum = Arrays.stream(arrayNumbers).sum();
        System.out.println(sum);
        //Sum is 10, which is correct.
    }
}
