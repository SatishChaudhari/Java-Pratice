package examples;

import java.util.Scanner;
//Create a pattern of nxn
public class Pattern_1 {
    public static void main(String[] args) {
        System.out.println("Enter any number: ");
        int n = new Scanner(System.in).nextInt();
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
