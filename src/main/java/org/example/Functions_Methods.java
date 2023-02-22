package org.example;

import java.util.Scanner;

public class Functions_Methods {
    //take input of two numbers and print the sum
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, Sum; //Alternative method of declaring type variables at once
        System.out.print("Type in first number: ");
        x = input.nextInt();
        System.out.print("Type in second number: ");
        y = input.nextInt();
        Sum = x + y;
        System.out.println("Sum is " + Sum);
    }

}
