package java;

import java.util.List;

public class Searcher{

    public void printPersons(List<Person> roster, PersonChecker tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

}
