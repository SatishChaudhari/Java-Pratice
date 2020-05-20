package JavaPractice2;
//Throw an exception if age is below 18 (print "Access denied"). If age is 18 or older, print "Access granted":
public class ExceptionType {
    static void checkAge(int age){
        if (age < 18){
            System.out.println("Access denied - You must be at least 18 years old");
        }else {
            System.out.println("Access Granted - You are old enough");
        }
    }

    public static void main(String[] args) {
        checkAge(15);
    }

}
