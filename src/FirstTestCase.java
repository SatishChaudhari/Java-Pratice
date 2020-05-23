/*
1.SetUp --> Open the browser and application.
2.login
3.close
 */


import org.testng.annotations.Test;

public class FirstTestCase {
@Test
   public void setup(){
        System.out.println("Opening Browser");
    }
@Test
    public void login(){
    System.out.println("This is a login test");
}
@Test
    public void teardown(){
    System.out.println("Closing a browser");
}

}
