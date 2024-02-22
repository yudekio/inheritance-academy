package School;

public class ServeStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Sam", 20, 11222, "Science", 4.43);
        Student student2 = new Student("John", 21, 11223, "Science", 4.1);
        student1.displayData();
        student1.hasScholarship();
        student2.displayData();
        student2.hasScholarship();
    }
}
