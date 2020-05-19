package JavaPractice1;



public class SwapNumbers {

    public static void main(String [] args){
        int a=10;
        int b=20;

        System.out.println("Before Swap");
        System.out.println("The value of A = "+ a);
        System.out.println("The value of B = "+ b);


        System.out.println("After Swap");

        int c = a;
        a = b;
        b = c;

        System.out.println("The value of A = "+ a);
        System.out.println("The value of B = "+ b);

    }




}
