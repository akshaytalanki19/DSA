package oops.inheritence;

class singleInheritence{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.print();
                d.printMe();
            }
        }
        
        class Animal{
            public  void printMe(){
                System.out.println("Hi this is from animal class");
            }
        }
        
        class Dog extends Animal{
            static String dog="myDog";
            public void print(){
        System.out.println(dog);
    }
}