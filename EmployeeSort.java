package Day8;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

class Employee {

    String name;
    String department;
    int salary;

    Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return name + "-" + department + "-" + salary;
    }
}

public class EmployeeSort {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Ravi", "IT", 600000),
                new Employee("anad", "HR", 500000),
                new Employee("amit", "IT", 400000),
                new Employee("Rahul", "HR", 700000),
                new Employee("gowda", "MD", 800000)
        );

        employees.sort(
                Comparator.comparing((Employee e) -> e.department)
                        .thenComparing((Employee e) -> e.salary,
                                Comparator.reverseOrder())
                        .thenComparing(e -> e.name)
        );

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}