package com.company;

public class Main {

    public static void main(String[] args) {
	int[] ints = new int[]{1, 2, 3};
        for (int i = 0; i < ints.length; i++) {
            if (i != ints.length - 1) {
                System.out.print(ints[i] + ", ");
            } else {
                System.out.print(ints[i]);
            }
        }
        System.out.println();

        for (int i = ints.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(ints[i] + ", ");
            } else {
                System.out.println(ints[i]);
            }
        }
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                ints[i]++;
            }
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(ints[i]);
        }
        System.out.println();
    double[] doubles = {1.57, 7.654, 9.986};
        for (int i = 0; i < doubles.length; i++) {
            if (i != doubles.length - 1) {
                System.out.print(doubles[i] + ", ");
            } else {
                System.out.print(doubles[i]);
            }
        }
        System.out.println();
        for (int i = doubles.length - 1; i >= 0 ; i--) {
            if (i != 0) {
                System.out.print(doubles[i] + ", ");
            } else {
                System.out.println(doubles[i]);
            }
        }
    char[] chars = {'n', 'c', 't'};
        for (int i = 0; i < chars.length; i++) {
            if (i != chars.length - 1) {
                System.out.print(chars[i] + ", ");
            } else {
                System.out.print(chars[i]);
            }
        }
        System.out.println();
        for (int i = chars.length - 1; i >= 0 ; i--) {
            if (i != 0) {
                System.out.print(chars[i] + ", ");
            } else {
                System.out.println(chars[i]);
            }
        }
    }
}
