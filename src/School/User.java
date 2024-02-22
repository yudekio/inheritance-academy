package School;

public class User {
    String name;
    Integer age;
    User(String _name,Integer _age) {
        name = _name;
        age = _age;
        System.out.println(
                "Base Class Constructor Called ");
    }

    public void displayData() {
        System.out.println(name);
    }

    public void displayYearOfBirth() {
        System.out.println(age);
    }



}
