package java;

import java.util.List;

public class Searcher<T>{

    public void printPersons(List<Person> roster, PersonChecker tester, T t) {
        for (Person p : roster) {
            if (tester.test(p, t)) {
                p.printPerson();
            }
        }
    }

}
