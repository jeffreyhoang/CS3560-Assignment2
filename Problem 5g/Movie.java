public class Movie {
    private String name;
    private String genre;
    private Person person;
    private Watch watch;

    // fully parameterized constructor
    public Movie(String name, String genre, Person person, Watch watch) {
        this.name = name;
        this.genre = genre;
        this.person = person;
        this.watch = watch;
    }
}
