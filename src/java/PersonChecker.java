package java;

import java.util.function.BiFunction;

public class PersonChecker<T>{

    BiFunction<Person, Integer, Boolean> testAge =
            (p, i) -> i == p.getAge();

    BiFunction<Person, String, Boolean> testName =
            (p, s) -> s.equals(p.getName());

    BiFunction<Person, Person.Sex, Boolean> testGender =
            (p, g) -> g.equals(p.getGender());

    BiFunction<Person, String, Boolean> testEmail =
            (p, s) -> s.equals(p.getEmail());

    public boolean test(Person p, T t){
        if(t instanceof Integer) {
            return testAge.apply(p, (Integer) t);
        }
        else if(t instanceof Person.Sex){
            return testGender.apply(p, (Person.Sex) t);
        }
        else{
            if(testName.apply(p, (String) t)){
                return true;
            }else{
                return testEmail.apply(p, (String) t);
            }
        }
    }

}
