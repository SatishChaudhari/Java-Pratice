package JavaPractice2;
//Abstract class
abstract class AbstractClassTest {
    public String firstName = "John";
    public  int age = 24;
    public abstract void study(); // create an abstract method

}
//Sub class inherit from AbstractClassTest
class  Student extends AbstractClassTest{
    public int graduationYear = 2018;
    public void study(){ // implement abstract method here
        System.out.println("Studying all day long");
    }
}
class MyClass{
    public static void main(String[] args) {
        // create an object of the student class.(which inherit variables and method from AbstractClassTest)
        Student myObj = new Student();
        System.out.println("Name: " + myObj.firstName);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study(); // call abstract method.
    }
}