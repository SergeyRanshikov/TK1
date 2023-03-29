
public class Employee {
    private final String firstName;
    private final String secondName;
    private final String lastName;

    String group;

    private final int id;
    private static int counter = 1;
    private int salary;



    public Employee( String group,String lastName, String firstName, String secondName, int salary){

        this.group = group;
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.salary = salary;
        this.id = counter;
        counter++;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id сотрудника " + id +
                ", '" + lastName + '\'' +
                " '" + firstName + '\'' +
                " '" + secondName + '\'' +
                ", отдел'" + group + '\'' +
                ", зарплата " + salary +
                '}';
    }
}
