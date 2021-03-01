package examples;

import java.util.Scanner;

public class Power {
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter your first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter Second number: ");
        int b = scanner.nextInt();
        int result = 1;
        for (int i=0; i<b; i++){
            result *= a;
        }
        System.out.println(result);
    }
}
