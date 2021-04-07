package java;

import java.util.ArrayList;
import java.util.List;

public class People {

    List<Person> people;

    public People(){
        this.people = new ArrayList<Person>();
    }

    public List<Person> getPeople(){
        return this.people;
    }

}
