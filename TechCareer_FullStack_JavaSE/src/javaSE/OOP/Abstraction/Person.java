package javaSE.OOP.Abstraction;

import java.io.Serializable;

abstract public class Person implements Serializable {

    public static final Long serialVersionUID = 1L;

    // FIELD
    private Long id;
    private String name;

    private String surname;

    // CONSTRUCTOR
    public Person() {
        this.id = 0L;
        name = "You have not entered your name!";
        surname = "You have not entered your surname!";
    }

    public Person(Long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    // tostring
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name=" + name +
                ", surname=" + surname +
                '}';
    }

    // Method
    public void getData() {
        System.out.println("ID:" + id + " NAME:" + name + " SURNAME" + this.surname);
    }

    abstract public void methodWithoutParameters();

    // GETTER AND SETTER
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
