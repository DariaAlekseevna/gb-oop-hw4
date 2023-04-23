package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        List<Double> listD = new ArrayList<>();
        List<Integer> listI = new ArrayList<>();
        List<Double> listD2 = new ArrayList<>();
        List<Integer> listI2 = new ArrayList<>();
        List<Double> listD3 = new ArrayList<>();
        List<Integer> listI3 = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            listD.add((double) i);
            listI.add(i);
        }
        for (int i = 1; i < 6; i++) {
            listD2.add((double) i);
            listI2.add(i);
        }

        for (int i = 6; i > 1; i -= 2) {
            listD3.add((double) i);
            listI3.add(i);
        }
        System.out.println("Sum of elements in the (Double) list: " + calc.sum(listD));
        System.out.println("Sum of elements in the (Integer) list: " + calc.sum(listI));

        System.out.println("Product of elements in the second (Integer) list: " + calc.multiply(listI2));
        System.out.println("Product of elements in the second (Double) list: " + calc.multiply(listD2));
        System.out.println("Product of elements in the (Double) list: " + calc.multiply(listD));

        System.out.println("Division of elements in third (Double) list : " + calc.division(listD3));
        System.out.println("Division of elements in third (Integer) list: " + calc.division(listI3));
        System.out.println("Division of elements in the (Integer) list: " + calc.division(listI));

    }
}
