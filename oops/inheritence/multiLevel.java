package oops.inheritence;

public class multiLevel {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.breed="jimmy";
        d.legs=4;
        System.out.println(d.breed+" "+d.legs);
        d.eat();
        d.breathe();
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    String breed;
}