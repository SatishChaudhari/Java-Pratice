package JavaPractice2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingDatenTime {
    public static void main(String[] args) {
        LocalDateTime myDate = LocalDateTime.now();
        System.out.println("Before formatting: " + myDate);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");
    //The ofPattern() method accepts all sorts of values,
        // if you want to display the date and time in a different format.

        String formattedDate = myDate.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}
