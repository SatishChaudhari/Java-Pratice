package JavaPractice1.Loop;

/*
 * FOR LOOP:
 * Write a cashier program that will scan a given number of items and tally the cost.
 */

import java.util.Scanner;

public class CashierForLoop {

    public static void main(String[] args){

        //Get number of item to scan.
        System.out.println("Enter the number of items to scan");
        Scanner scanner = new Scanner(System.in);

        int quantity = scanner.nextInt();

        double total = 0;
        //Create loop to iterate through all of the items and accumulate the costs

        for(int i=0; i<quantity; i++){
            System.out.println("Enter the cost of the item: " + (i+1));
            double price = scanner.nextDouble();

            total = total + price;
        }
        scanner.close();
        System.out.println("Your Total is: £" + total);
    }
}
