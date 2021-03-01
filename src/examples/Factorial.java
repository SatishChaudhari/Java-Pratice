package examples;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the Number to find factorial of it");
        int num = new Scanner(System.in).nextInt();
        int fact = 1;
        for (int i=num; i>=1; i--){
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is " + fact);
    }
}
