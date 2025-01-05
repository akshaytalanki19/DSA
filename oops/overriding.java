package oops;

public class overriding {
    public static void main(String[] args) {
        Animal d=new Animal();
        d.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("eating");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("dog eats dog food");
    }
}