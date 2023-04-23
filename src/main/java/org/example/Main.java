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
        List<String> listS = new ArrayList<>();
        List<String> listS2 = new ArrayList<>();
        List<String> listS3 = new ArrayList<>();
        List<String> listS4 = new ArrayList<>();

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
        for (int i = 0; i < 6; i++) {
            listS.add(i + ".0");
        }
        for (int i = 0; i < 6; i++) {
            listS2.add(i + ".1");
        }
        for (int i = 0; i < 6; i++) {
            listS3.add("" + i);
        }
        for (int i = 0; i < 6; i++) {
            listS4.add("meow");
        }

        System.out.println("Sum of elements in the (Double) list: " + calc.sum(listD));
        System.out.println("Sum of elements in the (Integer) list: " + calc.sum(listI));

        System.out.println("Product of elements in the (Integer) list2: " + calc.multiply(listI2));
        System.out.println("Product of elements in the Double) list2: " + calc.multiply(listD2));
        System.out.println("Product of elements in the (Double) list: " + calc.multiply(listD));

        System.out.println("Division of elements in (Double) list3: " + calc.division(listD3));
        System.out.println("Division of elements in (Integer) list3: " + calc.division(listI3));
        System.out.println("Division of elements in the (Integer) list: " + calc.division(listI));

        System.out.println("(Integer)List conversion to binary: " + calc.conversionToBinary(listI));
        System.out.println("(Double)List conversion to binary: " + calc.conversionToBinary(listD));
        System.out.println("(String)List conversion to binary: " + calc.conversionToBinary(listS));
        System.out.println("(String)List2 conversion to binary: " + calc.conversionToBinary(listS2));
        System.out.println("(String)List3 conversion to binary: " + calc.conversionToBinary(listS3));
        System.out.println("(String)List4 conversion to binary: " + calc.conversionToBinary(listS4));

    }
}
