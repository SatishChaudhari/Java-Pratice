package JavaPractice1.IfElse;
/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LoanQualifier {

    public static void main(String[] args) {
        //Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //Get what we don't know. (User Input)
        System.out.println("Enter your Salary: ");
        Scanner scanner = new Scanner(System.in);
        float salary = scanner.nextFloat();
        System.out.println("How many years you worked: ");
        float years = scanner.nextFloat();
        scanner.close();

    //Make decision
        if (salary >= requiredSalary) {
            if (years >= requiredYearsEmployed) {
                System.out.println("Congratulation! You are eligible for the loan");
            } else {
                System.out.println("Sorry! You must employed at least  " + requiredYearsEmployed
                        + "years for qualify the loan");
            }
        }
        else{
                System.out.println("Sorry! You must earn at least  £" + requiredSalary
                        + " for qualify the loan");
            }


    }

}
