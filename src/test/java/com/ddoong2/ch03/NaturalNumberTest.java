package com.ddoong2.ch03;

import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

public class NaturalNumberTest {

    @Test
    public void test_해당기준을_만족하는_1000이하의_자연수를_구하라() {
        Set<Double> doubleSet = new TreeSet<>();

        for (int a = 1; a <= 1000; a++) {
            for (int b = 1; b <= 1000; b++) {
                double result = Math.pow(a, 3) + Math.pow(b, 3);

                if (result <= 1000 && !doubleSet.contains(result)) {
                    doubleSet.add(result);

                    System.out.println(String.format("%3d = %3d^3 + %3d^d", ((int) result), a, b));
                }
            }
        }
    }
}
