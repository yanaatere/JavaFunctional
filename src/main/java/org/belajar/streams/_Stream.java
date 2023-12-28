package org.belajar.streams;
import java.util.List;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        List<Person> peoples = List.of(
                new Person("John",Gender.MALE),
                new Person("Anton", Gender.MALE),
                new Person("Klarisa",Gender.FEMALE),
                new Person("Klarisa",Gender.PREFER_NOT_TO_SAY),
                new Person("Andini",Gender.FEMALE)
        );

        peoples.stream().map(person -> person.gender).collect(Collectors.toSet()).forEach(System.out::println);
    }

    enum Gender {
        MALE, FEMALE, PREFER_NOT_TO_SAY
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
