package examples;

import java.util.Scanner;

public class Pattern_3 {
    public static void main(String[] args) {
        System.out.println("Enter any number: ");
        int n = new Scanner(System.in).nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i-1; j++){
                System.out.print("  ");
            }
            for (int k=1; k<= n-i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
