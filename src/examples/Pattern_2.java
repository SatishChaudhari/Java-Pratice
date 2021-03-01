package examples;

import java.util.Scanner;

public class Pattern_2 {
    public static void main(String[] args) {
        System.out.println("Enter any number: ");
        int n = new Scanner(System.in).nextInt();
        patternA(n);
        patternB(n);
    }

    public static void patternA(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void patternB(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
