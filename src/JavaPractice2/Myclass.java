package JavaPractice2;

public class Myclass {

    public void addition(int a, int b){
        int c = a + b;
        System.out.println("Total is: " + c);
    }
    public void sub(int a, int b){
        int c = a - b;
        System.out.println("Answer is: " + c);
    }

    public static void main(String[] args) {


        Myclass obj1 = new Myclass();
        obj1.addition(15,30);
        Myclass obj2 = new Myclass();
        obj2.sub(50, 30);

    }
}
