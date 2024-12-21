// Base class
class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

// Derived classes
class Developer extends Employee {
    @Override
    void work() {
        System.out.println("Developer is coding");
    }
}

class Manager extends Employee {
    @Override
    void work() {
        System.out.println("Manager is planning");
    }
}

public class Main {
    static void performWork(Employee employee) {
        employee.work();
    }

    public static void main(String[] args) {
        Employee dev = new Developer();
        Employee mgr = new Manager();
        performWork(dev);  // Output: Developer is coding
        performWork(mgr);  // Output: Manager is planning
    }
}
