package examples;

import java.util.Scanner;

//Programme to check prime number
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter start number: ");
        int startNum = new Scanner(System.in).nextInt();
        System.out.println("Enter end number: ");
        int endNum = new Scanner(System.in).nextInt();

        for (int i = startNum; i < endNum; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + ",");
            }

        }

    }

    public static boolean isPrimeNumber(int number) {
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        int sqrt = (int) (Math.sqrt(number) + 1);
        for (int i = 3; i < sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }


        return true;
    }

}
