package OPP.inheritance;

public class Main {

    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee("Alice", 30, "Software Engineer", 75000.0);

        // Using the introduce method from the Person class
        emp.introduce();
        // Using the work method from the Employee class
        emp.work();
        // Displaying the employee details
        System.out.println(emp);

        // Modifying the employee's position, salary and age
        emp.setPosition("Senior Software Engineer");
        emp.setSalary(85000.0);
        emp.setAge(32);
        emp.setName("Mark Smith");

        // Displaying the updated employee details
          System.out.println(emp);
    }
}
