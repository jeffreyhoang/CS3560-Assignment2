public class Course {
    private int code;
    private List<Book> books;

    // fully parameterized constructor
    public Course(int code, List<Book> books) {
        this.code = code;
        this.books = books;
    }
}
