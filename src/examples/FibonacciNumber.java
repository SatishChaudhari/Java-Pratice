package examples;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        int n = new Scanner(System.in).nextInt();
        fibNumber(n);
    }
    public static void fibNumber(int number){
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 0; i < number - 2; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

}
