package Controller;

import Model.Person;
import View.PersonView;

public class PersonController {
    private Person personModel;
    private PersonView personView;

    public PersonController(Person model, PersonView view) {
        this.personModel = model;
        this.personView = view;
    }

    public String getPersonId() {
        return personModel.getPersonId();
    }

    public void setPerson(String personId) {
        personModel.setPersonId(personId);
    }

    public String getName() {
        return personModel.getName();
    }

    public void setName(String name) {
        personModel.setName(name);
    }

    public String getSurname() {
        return personModel.getSurname();
    }

    public void setSurname(String surnname) {
        personModel.setSurname(surnname);
    }

    public int getAge() {
        return personModel.getAge();
    }

    public void setAge(int age) {
        personModel.setAge(age);
    }

    public void show() {
        personView.showData(personModel.getPersonId(), personModel.getName(), personModel.getSurname(), personModel.getAge());
    }
}
