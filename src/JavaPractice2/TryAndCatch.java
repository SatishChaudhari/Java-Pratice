package JavaPractice2;

public class TryAndCatch {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3, 4};
            System.out.println(myNumbers[10]);
        } catch (Exception error) {
            System.out.println("Something went wrong");
        }finally {
            System.out.println("The try catch is finished");
        }
    }
}
