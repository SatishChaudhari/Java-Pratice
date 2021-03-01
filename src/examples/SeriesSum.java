package examples;

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int sum = 0;
//        for (int i=num; i>0; i--){
//            sum = sum + i;
//        }
        for (int i=0; i<= num; i++){
            sum = sum + i;
        }
        System.out.println(sum);


    }
}
