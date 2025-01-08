public class Staff {
    private int role;

    // fully parameterized constructor
    public Staff(String name, int hours, int role) {
        super(name, hours);
        this.role = role;
    }
}
