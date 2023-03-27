import Controller.PersonController;
import Model.Person;
import View.PersonView;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        //data from model
        Person model = createExamplePerson();

        //view
        PersonView view = new PersonView();

        PersonController p1Controller = new PersonController(model, view);

        System.out.println("----------- INITIAL DATA -----------");
        p1Controller.show();

        //change data using controller
        p1Controller.setName("Michael");
        p1Controller.setSurname("Smith");
        p1Controller.setAge(27);
        System.out.println("----------- AFTER CHANGE -----------");
        p1Controller.show();
    }

    public static Person createExamplePerson(){
        Person p1 = new Person();
        p1.setPersonId(UUID.randomUUID().toString());
        p1.setName("John");
        p1.setSurname("Doe");
        p1.setAge(25);
        return p1;
    }
}