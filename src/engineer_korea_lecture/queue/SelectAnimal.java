package engineer_korea_lecture.queue;

import java.util.LinkedList;

enum AnimalType{
    DOG,CAT
}

abstract class Animal{
    AnimalType type;
    String name;
    int order;
    Animal(AnimalType type, String name){
        this.type=type;
        this.name=name;
    }
    void setOrder(int order){
        this.order=order;
    }
    int getOrder(){
        return order;
    }
    void info(){
        System.out.println("type = " + type);
        System.out.println("name = " + name);
    }
}

class Dog extends Animal{
    Dog(String name) {
        super(AnimalType.DOG, name);
    }
}
class Cat extends Animal{
    Cat(String name) {
        super(AnimalType.CAT, name);
    }
}

class AnimalShelter{
    LinkedList<Dog> dogs = new LinkedList<>();
    LinkedList<Cat> cats = new LinkedList<>();
    int order;
    AnimalShelter(){
        order=1;
    }
    void enqueue(Animal animal){
        animal.setOrder(order);
        order++;
    }
}

public class SelectAnimal {
    public static void main(String[] args) {

    }
}
