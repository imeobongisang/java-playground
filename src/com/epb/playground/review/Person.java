package com.epb.playground.review;
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private int tripleTheAge(){
        if( age < 0)
            return 30;
        
        return age * 3; 
      
    }
    private String changeName(){
        if( name.isEmpty())
            return "Bob";
        return "Bob"; 
      
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    

    public Person requestNewId(Person originalPerson) {
        originalPerson = new Person(originalPerson.changeName(),originalPerson.tripleTheAge());
            return originalPerson;

    }
    
}