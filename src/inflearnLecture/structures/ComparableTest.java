package inflearnLecture.structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Person implements Comparable<Person>{
    int height;
    int weight;
    String name;

    Person(int height,int weight,String name){
        this.height=height;
        this.weight=weight;
        this.name = name;
    }
    @Override
    public int compareTo(Person person) {
        if(this.weight> person.weight){
            return -1;
        }else{
            return 1;
        }
    }
}

public class ComparableTest {
    public static void main(String[] args) {
        Person ersu = new Person(183,75,"ersu");
        Person heechan = new Person(165,90,"heechan");

        Person[] personList = new Person[2];
        personList[0]=ersu;
        personList[1]=heechan;

        for (Person person : personList) {
            System.out.println("name = " + person.name + "  "+ "weight = " + person.weight);
        }

        Arrays.sort(personList);

        System.out.println(" ===== ");

        for (Person person : personList) {
            System.out.println("name = " + person.name + " " + "weight = " + person.weight);
        }

        System.out.println(" === arrayList === ");

        List<Person> personArrayList = new ArrayList<>();


        for (Person person : personArrayList) {
            System.out.println("name = " + person.name + " " + "weight = " + person.weight);
        }

        Comparator<Person> comp = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.weight-o1.weight;
            }
        };

        System.out.println(" === arrayList After sorting === ");

        personArrayList.sort(comp);

        for (Person person : personArrayList) {
            System.out.println("name = " + person.name + " " + "weight = " + person.weight);
        }
    }
}
