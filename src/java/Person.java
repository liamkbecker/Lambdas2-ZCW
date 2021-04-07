package java;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    int age;
    Sex gender;
    String emailAddress;

    public int getAge() {
        return this.age;
    }

    public void printPerson() {
        System.out.println(this.name + ": " + this.age + ", " + this.gender + ", " + this.emailAddress);
    }
}