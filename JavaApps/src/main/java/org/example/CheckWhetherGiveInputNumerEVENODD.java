package org.example;

import java.util.Scanner;

public class CheckWhetherGiveInputNumerEVENODD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu un numar: ");
        int a = scanner.nextInt();

        if (a%2 == 0){
            System.out.println("Numarul " + a + " este par!");
        } else {
            System.out.println("Numarul " + a + " este impar!");
        }
    }
}
