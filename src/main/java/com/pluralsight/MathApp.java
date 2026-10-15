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


        // Blank line for output readability
        System.out.println();


        // Question 5: Distance Between Two Points
        // find and display the distance between the points (5, 10) and (85, 50)
        // Declare and initialize the component variables
        byte pointOneX = 5;
        byte pointOneY = 10;
        byte pointTwoX = 85;
        byte pointTwoY = 50;

        // Declare and initialize distance variables
        int distanceX = pointTwoX - pointOneX;
        int distanceY = pointTwoY - pointOneY;

        // Display results
        System.out.println("Question 5: Find Distance Between Two Points");
        System.out.println("The distance between the two points is (" + distanceX + ", " + distanceY + ")");


        // Blank line for output readability
        System.out.println();


        // Question 6: Find Absolute Value of a Variable
        // find and display the absolute value of a variable set to -3.8
        // Declare and initialize value
        double needAbsoluteValue = -3.8;

        // Declare and initialize absolute value
        double absoluteValue = Math.abs(needAbsoluteValue);

        // Display results
        System.out.println("Question 6: Find the Absolute Value");
        System.out.println("The absolute value of " + needAbsoluteValue + " is " + absoluteValue);


        // Blank line for output readability
        System.out.println();


        // Question 7: Find a Random Number Between 0 and 1
        // find and display a random number between 0 and 1
        // Display Results
        System.out.println("Question 7: Display a Random Number Between 0 and 1");
        System.out.println("The number is: " + Math.random());


        // Blank line for output readability
        System.out.println();


        // Question 8: Calculate Number of Minutes
        // calculate how many minutes are in 24 days
        // bonus: how many milliseconds
        // Declare and initialize variables
        int numberOfMilliseconds = 60000;  // Number of milliseconds in a MINUTE, skip calculation for milli to sec to min
        int numberOfMinutes = 60;  // Number of minutes in an hour
        int numberOfHours = 24;   // Number of hours in a day
        int numberOfDays = 24;   // Number of days
        int totalMinutes = 0;
        int totalMilliseconds = 0;

        // Calculations
        totalMinutes = ((numberOfMinutes * numberOfHours) * numberOfDays);
        totalMilliseconds = (((numberOfMilliseconds * numberOfMinutes) * numberOfHours) * numberOfDays);

        // Display results
        System.out.println("Question 8: Calculate Minutes and Milliseconds");
        System.out.println("The number of minutes in " + numberOfDays + " is " + totalMinutes + " minutes.");
        System.out.println("The number of milliseconds in " + numberOfDays + " is " + totalMilliseconds + " milliseconds.");




    }
}
