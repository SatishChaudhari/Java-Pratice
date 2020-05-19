package JavaPractice2;
// Java Inner class example
 class OuterClass {
    int x = 10;
    class  InnerClass{ // A class within a class, its also called nested class
        int y = 5;
    }
}
 class MainClass{
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass(); // create an object for Outer class
        OuterClass.InnerClass myInner = myOuter.new InnerClass(); // Create an object for inner class
        System.out.println(myInner.y + myOuter.x); // Print total value for both class

    }

}