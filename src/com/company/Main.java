package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// sum then average

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int value = input.nextInt();
        int sum= 0;

        for (int i=1; i<= value; i++){
            sum += i;
            System.out.println("Sum: " + sum);
        }
        System.out.println("Average" + sum/10);
    }
}
