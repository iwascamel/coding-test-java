package structures.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> peoples = getPeople();

        // imperative approach ❌
        List<Person> females = new ArrayList<>();
        for(Person p : peoples){
            if(p.getGender().equals(Gender.FEMALE)){
                females.add(p);
            }
        }
        females.forEach(System.out::println);

        // Declarative approach ⭕

        // filter
        System.out.println(" == filter == ");
        List<Person> collect = peoples.stream().filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());
        collect.forEach(System.out::println);

        // sorted
        System.out.println(" == sorted ==");
        List<Person> collect1 = peoples.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
        collect1.forEach(System.out::println);

        System.out.println(" == reverse sorted == ");
        List<Person> collect2 = peoples.stream().sorted(Comparator.comparing(Person::getAge).reversed().thenComparing(Person::getGender).reversed()).collect(Collectors.toList());
        collect2.forEach(System.out::println);

        // all match
        System.out.println(" == all match ==");
        boolean b = peoples.stream().allMatch(person -> person.getAge() > 25);
        System.out.println(b);

        // any match
        System.out.println(" == any match ==");
        boolean b1 = peoples.stream().anyMatch(p -> p.getAge() > 25);
        System.out.println(b1);

        // non match
        System.out.println(" == non match ==");
        boolean b2 = peoples.stream().noneMatch(person -> person.getName().equals("얼쑤!"));
        System.out.println(b2);


    }
    private static List<Person> getPeople() {
        return List.of(
                new Person("얼쑤", 24, Gender.MALE),
                new Person("희찬", 25, Gender.MALE),
                new Person("철수", 29, Gender.MALE),
                new Person("영희", 27, Gender.FEMALE),
                new Person("수잔", 28, Gender.FEMALE),
                new Person("잔다르크", 29, Gender.FEMALE)
                );
    }
}
