package structures.stream;

public class Person {
    private final String name;
    private final int age;
    private final Gender gender;

    public Person(String name,int age,Gender gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
