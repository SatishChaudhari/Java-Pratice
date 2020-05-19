package JavaPractice1;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args){

        //Get the number of hours worked.
        System.out.println("Enter how many hours worked: ");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        // Get the hourly pay rate
        System.out.println("Enter the employe's hourly Pay rate: ");
        double rate = scanner.nextInt();
        scanner.close();

        //Find Gross Pay

        double grossPay = hours*rate;

        //Display the result.
        System.out.println("The Gross Pay is: £" + grossPay);
    }
}
