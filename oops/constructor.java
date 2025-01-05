package oops;

public class constructor{
    public static void main(String[] args) {
        Student s1 = new Student("akshay");
        System.out.println(s1.name);
        Student s2 = new Student();
        Student s3 = new Student(5);
        System.out.println(s2);
        System.out.println(s3.roll);
    }
}

class Student {
    String name;
    int roll;
    Student(String name) {
       this.name=name;
    }
    Student(){
        System.out.println("non-parametrized");
    }
    Student(int roll){
        this.roll=roll;
    }
}