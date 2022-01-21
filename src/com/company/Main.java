package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Person> personList = List.of(

                new Person("Arne", "Male", 25000),
                new Person("Lasse", "Male", 35000),
                new Person("Berit", "Female", 30000),
                new Person("Agda", "Female", 40000),
                new Person("Elvis", "Male", 100000),
                new Person("Nicolai", "Male", 500000),
                new Person("Eva", "Female", 10000),
                new Person("Fimpen", "Male", 500),
                new Person("Lena", "Female", 15000),
                new Person("Annika", "Female", 20000)

        );

        personList.forEach(System.out::println);

        System.out.printf("Snittlönen för män' %.2f%n",
                personList.stream().filter(person -> person.getGender().equals("Male"))
                        .mapToDouble(Person::getSalary)
                        .average().orElseThrow(IllegalStateException::new));

        System.out.printf("Snittlönen för kvinnor' %.2f%n",
                personList.stream().filter(person -> person.getGender().equals("Female"))
                        .mapToDouble(Person::getSalary)
                        .average().orElseThrow(IllegalStateException::new));

        var highestSalary = personList.stream()
                .mapToDouble(Person::getSalary)
                .max().orElseThrow(IllegalStateException::new);

        personList.stream().filter(person -> person.getSalary() == highestSalary).toList().forEach(System.out::println);


        var lowestSalary = personList.stream()
                .mapToDouble(Person::getSalary)
                .min().orElseThrow(IllegalStateException::new);

        personList.stream().filter(person -> person.getSalary() == lowestSalary).toList().forEach(System.out::println);


        List<String> words = List.of("Fridge", "Chair", "Oven", "Tree", "Glass", "Animal", "Coffee", "Phone", "Mouse", "Dragon");
            words.forEach(System.out::println);

       //   Använd reguljära uttryck för plocka ut endast de ord som
        //innehåller 2 eller fler engelska vokaler (a, e, i, o, u, y)


    }
}