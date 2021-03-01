package examples;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        int num = new Scanner(System.in).nextInt();
        System.out.println("Fibonacci Series upto " +num + " number: ");

        for(int i=0; i<=num; i++){
            System.out.println(fibonacci2(i));
        }
    }
    public static int fibonacci2(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        int fib1=1, fib2=1, fibonacci=1;
        for(int i=3; i<=number; i++){
            //Fibonacci number is sum of previous two fibonacci number
            fibonacci = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibonacci;
        }
        return fibonacci;
    }
}
