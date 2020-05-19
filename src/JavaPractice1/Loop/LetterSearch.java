package JavaPractice1.Loop;

import java.util.Scanner;

public class LetterSearch {

    public static void main(String[] args){

        System.out.println("Enter some text: ");
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.next();
        boolean letterFound = false;
        for(int i=0; i<letter.length(); i++){
            char currentLetter = letter.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a'){
                 letterFound = true;
                 break;
            }

            }
        if(letterFound){
            System.out.println("This text contain the letter 'A'");
        }else{
            System.out.println("This text dose not contain the letter 'A'");
        }
    }
}
