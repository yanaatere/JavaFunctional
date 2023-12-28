package org.belajar.imperative;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> peoples = List.of(
                new Person("John", Gender.MALE),
                new Person("Anton", Gender.MALE),
                new Person("Klarisa", Gender.FEMALE),
                new Person("Andini", Gender.FEMALE)
        );

        System.out.println("// Imperative Approach");
        //Imperative Approach
        List<Person> females = new ArrayList<>();
        for (Person person : peoples) {
            if (Gender.FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person person : females) {
            System.out.println("person = " + person);
        }

        //Declarative Approaches
        System.out.println("// Declarative Approach");
        peoples.stream()
                .filter(person -> Gender.FEMALE.equals(person.gender))
                .forEach(System.out::println);
    }

    enum Gender {
        MALE, FEMALE
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
}