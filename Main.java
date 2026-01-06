class Employee {
    int salary;
    String name;

    int getSalary() {
        return salary;
    }

    String getName() {
        return name;
    }

    void setName(String n) {
        name = n;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee harry = new Employee();
        harry.setName("CodeWithHarry");
        harry.salary = 233;
        System.out.println(harry.getName());
        System.out.println(harry.getSalary());
    }
}
