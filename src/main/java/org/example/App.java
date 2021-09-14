/*
 *  UCF COP3330 Fall 2021 Assignment 20 Solution
 *  Copyright 2021 Maria Quiros
 */

/*Declaring package*/
package org.example;

/*Importing scanner class*/
import java.util.Scanner;

/*Specifying class*/
public class App {

    public static void main(String[] args) {

        /*Creating a scanner object*/
        Scanner scan = new Scanner(System.in);

        /*Initializing variables*/
        double orderAmount;
        String county = "";
        double tax;
        double total;

        /*Prompting for the order amount*/
        System.out.println("What is the order amount?");
        orderAmount = scan.nextDouble();

        scan.nextLine();

        /*Prompting for state*/
        System.out.println("What state do you live in?");
        String state = scan.nextLine();

        /*Creating a nested statement based on whether the input is Wisconsin*/
        if (state.equals("Wisconsin")) {{
                System.out.println("What county do you live in?");
                county = scan.nextLine();
            }
            if (county.equals("Eau Claire")) {
                tax = ((0.05 * orderAmount) + 0.005);
                total = (orderAmount + tax);
                System.out.printf("The tax is $%.2f.\nThe total is $%.2f.", +tax, +total);
            } else {
                tax = ((0.05 * orderAmount) + 0.004);
                total = (orderAmount + tax);
                System.out.printf("The tax is $%.2f.\nThe total is $%.2f.", +tax, +total);
            }
        }

        /*Creating if statement based on whether Illinois is chosen*/
        if (state.equals("Illinois")) {
            tax = (orderAmount * 0.08);
            total = (orderAmount + (orderAmount * 0.08));
            System.out.printf("The tax is $%.2f.\nThe total is $%.2f.", +tax, +total);
        }

        /*Creating if statement based on whether any other state is chosen*/
        if ((!("Wisconsin".equals(state))) && (!("Illinois".equals(state)))){
            total = orderAmount;
            System.out.printf("The total is $%.2f.", +total);
        }
    }
}
