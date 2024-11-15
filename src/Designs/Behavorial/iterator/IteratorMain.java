package src.Designs.Behavorial.iterator;

import java.util.Arrays;

public class IteratorMain {
    public static void main(String[] args) {
        People p1 = new People("Alice", "alice@example.com");
        People p2 = new People("Bob", "bob@example.com");

        Connection connection = new Connection(Arrays.asList(p1, p2));

        PeopleIterator iterator = connection.peopleIterator();
        while (iterator.hashNext()){
            People person = iterator.getNext();
            System.out.println(person.toString());
        }

        People found = connection.requestProfileFromPeople("alice@example.com");
        System.out.println("\nFound: " + found.toString());
    }
}
