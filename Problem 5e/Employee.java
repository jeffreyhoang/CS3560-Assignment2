public abstract class Employee {
    private String name;
    private int hours;

    // fully parameterized constructor
    public Employee(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    // returns base salary of employee
    public double calculateSalary() {
        return hours * 20;
    }

    // return hours
    public int getHours() {
        return hours;
    }
}
