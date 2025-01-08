public class Worker {
    private String name;
    private double hourlyWage;

    // fully parameterized constructor
    public Worker(String name, double hourlyWage) {
        this.name = name;
        this.hourlyWage = hourlyWage;
    }

    // returns name
    public String getName() {
        return name;
    }
}
