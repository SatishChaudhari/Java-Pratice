package OPP.inheritance;

public class Employee extends Person {

    private String position;
    private double salary;

    /**
     * Constructs an Employee with the specified name, age, position, and salary.
     *
     * @param name the name of the employee
     * @param age the age of the employee
     * @param position the position of the employee
     * @param salary the salary of the employee
     */
    public Employee(String name, int age, String position, double salary) {
        super(name, age);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be non-negative.");
        }
    }
    /**
     * Returns a string representation of the Employee object, including name, age, position, and salary.
     *
     * @return a string describing the employee
     */
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void work() {
        System.out.println("I'm working as a " + position + ".");
    }
}
