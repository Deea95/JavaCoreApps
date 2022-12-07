package org.example;

import java.util.Scanner;

public class CheckGivenCharacterIsAVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character:");
        char c = scanner.next().charAt(0);
        boolean isVowel = false;
        switch(c) {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' : isVowel = true;
        }
        if(isVowel ==true) {
            System.out.println(c+" is a vowel");
        } else {
            System.out.println(c+" is not a vowel");
        }
        scanner.close();
    }
}
