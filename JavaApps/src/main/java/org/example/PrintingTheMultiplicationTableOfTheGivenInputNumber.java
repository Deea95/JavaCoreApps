package org.example;

import java.util.Scanner;

public class PrintingTheMultiplicationTableOfTheGivenInputNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu un numar: ");
        int n = scanner.nextInt();
        for(int i = 0; i <=10;i++){
            System.out.println(n + "x" + i + "=" + (n*i));

        }
        scanner.close();
    }
}
