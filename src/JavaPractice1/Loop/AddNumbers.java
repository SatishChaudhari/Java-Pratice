package JavaPractice1.Loop;

import java.util.Scanner;

/*
 * DO WHILE LOOP:
 * Write a program that allows a user to enter two numbers,
 * and then sums up the two numbers. The user should be able to
 * repeat this action until they indicate they are done.
 */
public class AddNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean again;

        do {
            System.out.println("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter second number: ");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;

            System.out.println("Toatl is: "+ sum);

            System.out.println("Would you like to start over? Enter True or False" );
            again = scanner.nextBoolean();

        }
        while (again);
            scanner.close();

    }
}
