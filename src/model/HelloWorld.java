package model;

import model.Dog;
import model.Person;

import java.time.LocalDate;

public class HelloWorld{

    public static void main(String[] args) {
        System.out.println("Hello World!, nice to meet you");

        //Create a Person/Objects (Variable), Classes (A Blueprint on how to make something)
        Person tom = new Person(firstName: "Tom", lastName:"Smith", LocalDate.of(year: 1984, month:6, dayOfMonth:15))
        Person janet = new Person(firstName: "Janet", lastName: "Jackson", LocalDate.of(year:1985, month:12, dayOfMonth:3))

        tom.setSpouse(janet);

        Dog fido = new Dog(firstName: "Fido", LocalDate.of(year:2018, month:1, dayOfMonth:1))
        tom.setPet(fido);
        System.out.println(tom)
    }
}
