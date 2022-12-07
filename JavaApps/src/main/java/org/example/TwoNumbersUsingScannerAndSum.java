package org.example;

import java.util.Scanner;

public class TwoNumbersUsingScannerAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu primul numar: ");
        int a = scanner.nextInt();
        System.out.println("Introdu al doilea numar: ");
        int b = scanner.nextInt();

        System.out.println("Suma celor doua numere introduse este: " + (a+b));
        scanner.close();
    }
}
