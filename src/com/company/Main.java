package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // sum then average

        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int index = 1; index <= 10; index++) {
            System.out.println("Enter a number");
            int value = input.nextInt();
            sum += value;
        }
                System.out.println("Sum: " + sum);
            System.out.println("Average: " + sum / 10);
        }
    }


    //can't delete items in array but you can in array list
    //number of items in array (.length) vs arrayList(.size)

//enhanced for loops works for arrays as well
//for (int s: numbers) {
//Do very less with primitives but you have classes you can do more with your values
//primitives/basic data types = int, string, byte, char, float, short, etc...

//.contains is a method for an arrayList which lists other methods in the drop down
