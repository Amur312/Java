import java.util.UUID;

public class Employee {
    private String name;
    private UUID id;

    public Employee(String name) {
        this.name = name;
        this.id = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return id.equals(employee.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("John");
        Employee emp2 = new Employee("Alice");

        System.out.println(emp1.equals(emp2)); // false

        Employee emp3 = new Employee("John");
        System.out.println(emp1.equals(emp3)); // false

        Employee emp4 = emp1;
        System.out.println(emp1.equals(emp4)); // true
    }
}
