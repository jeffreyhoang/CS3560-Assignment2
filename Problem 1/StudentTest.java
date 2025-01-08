public class StudentTest {
    public static void main(String[] args) {
        // create first student using parameterized constructor
        Student student1 = new Student("John", "CS", 3.5);
            
        // create second student using no-argument constructor and updating fields
        Student student2 = new Student();
        student2.setName("Mary Ann");
        student2.setMajor("CE");
        student2.setGpa(3.3);

        // print student states using toString()
        System.out.println(student1);
        System.out.println(student2);
    }
}
