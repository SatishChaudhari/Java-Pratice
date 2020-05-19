package JavaPractice1.IfElse;

import java.util.Scanner;

/*
 * SWITCH
 * Have a user enter their letter grade, and using a switch statement,
 * print out a message letting them know how they did.
 */
public class GradeMessage {
    public static void main(String[] args){

        System.out.println("Enter your letter Grade: ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;
        switch (grade){
            case "A":
                message = "Excellent Job";
                break;
            case "B":
                message = "Great Job";
                break;
            case "C":
                message = "Good Job";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "Uh Oh!";
                break;
            default:
                message = "Error! Invalid input";
        }
        System.out.println(message);
    }
}
