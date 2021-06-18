package com.tts;
import java.util.*;

public class toPower {
//    static class toPower (int size, int power) {
//        return Math.pow(size, power);
//    }

    public static void main(String[] args) {
        int size = 4;
        int power = 2;

        ArrayList resultOutput = new ArrayList();
        int i;
        for (i = 0; i < size; i++) {
            double result = Math.pow(i, power);
            resultOutput.add(result);
            System.out.println("Output:" + resultOutput);
        }

    }
}
