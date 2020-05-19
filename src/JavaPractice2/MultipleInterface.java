package JavaPractice2;
// Create a multiple interface
 interface MultipleInterface {
    public void myFirstMethod();
}
 interface SecondInterface{
    public void mySecondMethod();

}
//To implement multiple interfaces, separate them with a comma
class DemoClass implements MultipleInterface, SecondInterface{
     public void myFirstMethod(){
         System.out.println("My First Method");
     }
     public void mySecondMethod(){
         System.out.println("My Second Method");
     }
}
class ThirdMainClass{
    public static void main(String[] args) {
        DemoClass myObj = new DemoClass();
        myObj.myFirstMethod();
        myObj.mySecondMethod();
    }
}