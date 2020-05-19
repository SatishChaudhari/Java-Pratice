package JavaPractice1.IfElse;

import java.util.Scanner;

/*
IF Statement.
        All salespeople get a payment of $1000 a week.
        Salespeople who exceed 10 sales get an additional bonus of $250.
        */
public class SalaryAndBonusCal {
    public static void main(String[] args){

        int salary = 1000;
        int bonus = 250;

        System.out.println("How many sales you made in a week? ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if (sales > 10)
            salary = salary + bonus;

            System.out.println("This week salary is: £" + salary);


    }
}
