import java.util.*;

class Employee implements Comparable<Employee> {
    String empName;
    int empID;

    public Employee(String empName, int empID) {
        this.empName = empName;
        this.empID = empID;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empID == employee.empID;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(empID);
    }

    @Override
    public String toString() {
        return "Employee Name: " + empName + ", Employee ID: " + empID+"\n";
    }


    //comparable used to compare the values of the objects(here we are comparing empID)
//    @Override
//    public int compareTo(Employee that) {
//        return this.empID - that.empID;
//    }

    //comparable used to compare the values of the objects(here we are comparing empName)
    @Override
    public int compareTo(Employee that) {
        return this.empName.compareTo(that.empName);

    }
}

public class SortCustomClass {

    static void main() {
        List<Employee> employee = new ArrayList();
        employee.add(new Employee("Alamgir", 102));
        employee.add(new Employee("Mohammed", 101));
        employee.add(new Employee("Muwahhid", 103));
        employee.add(new Employee("Wathiq", 105));
        employee.add(new Employee("Mutawakkil", 104));

        System.out.println("Original List: ");
        System.out.print(employee + " ");


//        System.out.println("Let's sort them in order of their empID using comparable");
//        Collections.sort(employee);


        // Let us compare the objects using comparator:

        Collections.sort(employee, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee, Employee t1) {
                return 0;
            }
        });
        System.out.println("\nComparator implementation on Sorted List(names arranged in alphabetic order): ");
        System.out.println(employee);
        System.out.println();
        System.out.println("In Sorted ID: " + employee);
        System.out.println("____________________________________________________________________________________________");


        //creating 2 employees to compare using comparable
        Employee employee1 = new Employee("Mutasim", 106);
        Employee employee2 = new Employee("Haroon", 107);

        System.out.println("Comparable");
        System.out.println(employee1.compareTo(employee2));


    }
}
