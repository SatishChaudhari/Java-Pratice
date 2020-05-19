package JavaPractice1;

import java.util.Scanner;

public class FindLeapYear {

    public static void main(String [] args){


        Scanner year1 = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year = year1.nextInt();
        boolean leap;

        if(year % 4 == 0){
            if(year % 100 == 0){
                leap = year % 400 == 0;
            }else {
                leap = true;
            }
        }else {
            leap = false;
        }
        if (leap){
            System.out.println(year + " is a leap year");
        }else {
            System.out.println(year + " is not a leap year");
        }

    }

}
