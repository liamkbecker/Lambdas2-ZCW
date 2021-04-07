package java;

public class Main {

    public static void main(String[] args){
        Searcher searcher = new Searcher();
        PersonChecker personChecker = new PersonChecker();
        People people = new People();
        searcher.printPersons(people.getPeople(), personChecker);
    }

}
