public class Professor extends Employee {
    private String field;

    // fully parameterized constructor
    public Professor(String name, int hours, String field) {
        super(name, hours);
        this.field = field;
    }

    // returns salary of professor
    @Override
    public double calculateSalary() {
        return getHours() * 30;
    }
}
