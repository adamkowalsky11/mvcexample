package View;

public class PersonView {
    public void showData(String personId, String name, String surname, int age) {
        System.out.println("Person id: " + personId);
        System.out.println("Name and surname: " + name + " " + surname);
        System.out.println("Age: " + age);
    }
}
