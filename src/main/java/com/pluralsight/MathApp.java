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

        // Print empty line for output readability
        System.out.println();


        // Question 3: Find Area of a Circle
        // find and display the area of a circle with a radius of 7.25


        // Declare and initialize radius and radius squared variables
        double radiusOfCircle = 7.25;

        // Declare and initialize area variable
        // Note: Area of a circle is pi * r ^ 2
        double areaOfCircle = Math.PI * Math.pow(radiusOfCircle, 2.0);

        // Display results
        System.out.println("Question 3: Find Area of a Circle");
        System.out.println("The area of a circle with a radius of 7.25 is " + areaOfCircle);
        System.out.println("Rounded to the nearest whole number place: " + Math.round(areaOfCircle));

        // Blank line for output readability
        System.out.println();


        // Question 4: Find the Square Root
        // find and display the square root of a variable set to 5.0
        // Declare and initialize variable
        double needSquareRoot = 5.0;

        // Declare and initialize square root variable
        double squareRoot = Math.sqrt(needSquareRoot);

        // Display results
        System.out.println("Question 4: Find the Square Root");
        System.out.println("The square root of " + needSquareRoot + " is " + squareRoot);
        System.out.println("Rounded to the nearest whole number: " + Math.round(squareRoot));
    }
}
