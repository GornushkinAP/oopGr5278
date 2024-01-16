package controllers;

import domain.classes.Person;

public class AccountController {

    public <T extends Person, V> void paySalary(T person, V salary){

        System.out.println(person.getName() + "give salary" + salary);;
    }
    
}
