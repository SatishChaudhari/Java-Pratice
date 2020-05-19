package JavaPractice2;

public class GetandSet {
    private String name; // private = restricted access.

    //Getter
    public String getName(){
        return name; // The get method returns the value of the variable name.
    }
    //Setter
   public void setName(String newName){ // The set method takes a parameter (newName) and assigns it to the name variable.
        // The this keyword is used to refer to the current object.
        this.name = newName;
   }



    public static void main(String[] args) {
        GetandSet myObj = new GetandSet();
        myObj.setName("John"); // set the value of the name variable to "John"
        System.out.println(myObj.getName());

    }
}