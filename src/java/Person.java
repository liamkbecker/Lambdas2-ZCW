package java;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    int age;
    Sex gender;
    String emailAddress;

    public Person(){
        this.name = "Ron";
        this.age = 10;
        this.gender = Sex.MALE;
        this.emailAddress = "ronathan@gmail.com";
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Sex getGender() {
        return this.gender;
    }

    public String getEmail() {
        return this.emailAddress;
    }

    public void printPerson() {
        System.out.println(this.name + ": " + this.age + ", " + this.gender + ", " + this.emailAddress);
    }

}