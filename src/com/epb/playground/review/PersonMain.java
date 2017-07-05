package com.epb.playground.review;
 
public class PersonMain{
    public static void main(String [] args) {
        Person person = new Person("Gregory", 52);
        Person person2 = new Person("Andrew", 5);

        System.out.println(person.getAge());

        Person person3 = person.requestNewId(person);

        System.out.println(person3.getAge());


        
    }
}