package com.pluralsight;

public class MathApp {

    public static void main(String[] args) {

        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);

        // REPEAT FOR NEXT EXERCISE

        // Question 1: Highest Salary
        // Declare and initialize variables for salaries
        int bobSalary = 72000;
        int garySalary = 90000;

        // Declare and initialize highest salary variable
        int highestSalary = Math.max(bobSalary, garySalary);

        // Print the result
        System.out.println("Question 1: Highest Salary");
        System.out.println("The higher salary is: $" + highestSalary);

        // Print empty line for output readability
        System.out.println();

        // Question 2: Smallest Price
        // find and display the smallest of two variables

        // Declare and initialize carPrice and truckPrice
        int carPrice = 25000;
        int truckPrice = 65000;

        // Declare and initialize lowestPrice
        int lowestPrice = Math.min(carPrice, truckPrice);

        // Display the result
        System.out.println("Question 2: Lowest Price");
        System.out.println("The lowest price is: $" + lowestPrice);




    }
}
