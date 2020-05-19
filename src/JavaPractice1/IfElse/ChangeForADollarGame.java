package JavaPractice1.IfElse;

import java.util.Scanner;

public class ChangeForADollarGame {

    public static void main(String[] args){

        double penny = 0.01;
        double nickel = 0.05;
        double dime = 0.10;
        double quarter = 0.25;
        int dollar = 1;
        System.out.println("Welcome to Change for A Dollar Game! "
                + "Your goal is to enter enough change to make exactly $1.00");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number of pennies: ");
        int numofPennies = scanner.nextInt();

        System.out.println("Enter your number of nickels: ");
        int numofNickels = scanner.nextInt();

        System.out.println("Enter your number of dimes: ");
        int numofDimes = scanner.nextInt();

        System.out.println("Enter your number of quarters: ");
        int numofQuarters = scanner.nextInt();

        scanner.close();

        double total = penny*numofPennies + nickel*numofNickels + dime*numofDimes + quarter*numofQuarters;

        if (total < dollar) {
            double amountShort = total - dollar;
            System.out.println("Sorry! You lose, You ware short " + String.format("%2f",amountShort)+ " cents.");
        }else if (total > dollar){
            double amountOver = total - dollar;
            System.out.println("Sorry! You lose,  You ware over " + String.format("%2f", amountOver)+ " cents.");
        }
        else {
            System.out.println("Yay! That's exactly $1.00! You WIN");
        }

    }
}
