package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a:");
        double a = sc.nextDouble();
        System.out.print("Input b:");
        double b = sc.nextDouble();
        System.out.print("Input c:");
        double c = sc.nextDouble();
        if(a != 0){
            double answer = (c-b)/a;
            System.out.printf("x = %f%d\n", answer);
        } else {
            if(b == c){
                System.out.println("The solution is all x!");
            } else {
                System.out.println("No solution");
            }
        }
        System.out.println("End!");
    }
}
