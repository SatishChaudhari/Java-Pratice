package examples;

import java.util.Scanner;

public class Ratings {

    public static void main(String[] args) {
        System.out.println("Enter your rating between 1 to 5");
        /*
        rating 1 & 2= bad review
        rating 3 = average review
        rating 4 = Good Review
        rating 5 = Excellent review
         */
        int rating = new Scanner(System.in).nextInt();

        switch (rating){
            case 1:
            case 2:
                System.out.println("Bad Review");
                break;
            case 3:
                System.out.println("Average Review");
                break;
            case 4:
                System.out.println("Good Review");
                break;
            case 5:
                System.out.println("Excellent Review");
                break;
            default:
                System.out.println("Please enter your rating between 1 to 5....");
                break;
        }
    }
}
