package org.example;

import java.util.Scanner;

public class InputRadiusProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius = scanner.nextDouble();
        System.out.println("Area of circle is: "+(Math.PI*radius*radius));
        scanner.close();
    }
}
