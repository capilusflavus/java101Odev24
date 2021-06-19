package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz : ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int c = n - 1; 0 < c; c--) {
            for (int a = 1; a <= n - c; a++) {
                System.out.print(" ");
            }
            for (int e = 1; e <= (2 * c) - 1; e++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}