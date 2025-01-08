public class Dog {
    private String breed;
    private String name;
    private List<Paw> paws; // max size is 4

    // no-argument constructor
    public Dog() {
        breed = "N/A";
        name = "N/A";
        paws = new ArrayList<>();
    }
}
