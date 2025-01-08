public class Person {
    private String name;
    private List<Watch> watchList;

    // fully parameterized constructor
    public Person(String name, List<Watch> watchList) {
        this.name = name;
        this.watchList = new ArrayList<>(watchList);
    }
}
