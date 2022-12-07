package org.example;

import java.util.Scanner;

public class YearIsALeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu anul: ");
        int year = scanner.nextInt();
        scanner.close();
        boolean isLeapYear = false;
        if(year %4==0){
            if(year%100 == 0){
                if(year %400 == 0){
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = true;
            }
        }else {
            isLeapYear = false;
        }
        if(isLeapYear) {
            System.out.println("Anul introdus: " + year + " este un An Bisect!");
        }else {
            System.out.println("Anul introdus " + year + " nu este un An Bisect!");
        }
    }
}
