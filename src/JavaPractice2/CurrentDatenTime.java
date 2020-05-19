package JavaPractice2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CurrentDatenTime {
    public static void main(String[] args) {
        //Current date
        LocalDate date = LocalDate.now(); // create a date object
        System.out.println("Date is: " + date); // print the value
        //Current time
        LocalTime myTime = LocalTime.now(); // create a time object
        System.out.println("Time is: " + myTime);

        //Current date and time
        LocalDateTime dateTime = LocalDateTime.now(); // create a date and time object
        System.out.println("Current Date and Time is: " + dateTime);

    }
}
