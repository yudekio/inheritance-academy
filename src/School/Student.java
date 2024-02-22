package School;

public class Student extends User{
    Integer IDNumber;
    String Major;
    double MeanOfGrades;

    Student(String _name, Integer _age, Integer _IDNumber, String _Major, double _MeanOfGrades) {
        super(_name, _age);
        IDNumber = _IDNumber;
        Major = _Major;
        MeanOfGrades = _MeanOfGrades;
    }

    public void hasScholarship() {
        if (MeanOfGrades >= 4.2) {
            System.out.println("Student does have a scholarship");
        } else {
            System.out.println("Student does not have a scholarship");
        }
    }
}
