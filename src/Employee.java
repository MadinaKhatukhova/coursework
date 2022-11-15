import java.util.Objects;

public class Employee {
    String firstName;

    String middleName;
    String lastName;
    String fullName;
    int department;
    float salary;
    static int counter;
    int id;

    public Employee(String lastName, String firstName, String middleName, int department, float salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.fullName = lastName + " " + firstName + " " + middleName;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getDepartment() == employee.getDepartment() && Float.compare(employee.getSalary(), getSalary()) == 0 && getId() == employee.getId() && Objects.equals(getFirstName(), employee.getFirstName()) && Objects.equals(middleName, employee.middleName) && Objects.equals(lastName, employee.lastName) && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), middleName, lastName, fullName, getDepartment(), getSalary(), getId());
    }

    @Override
    public String toString() {


        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                '}';


    }

    public String getFirstName() {
        return firstName;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
