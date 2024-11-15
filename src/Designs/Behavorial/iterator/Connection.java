package src.Designs.Behavorial.iterator;

import java.util.ArrayList;
import java.util.List;

public class Connection implements Network{
    private List<People> peoples;

    public Connection(List<People> peoples) {
        this.peoples = (peoples != null) ? peoples : new ArrayList<>();
    }

    public People requestProfileFromPeople(String email){
        simulateLatency();
        return peoples.stream()
                .filter(p -> p.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }

    private void simulateLatency() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public PeopleIterator peopleIterator() {
        return new PeopleIterator(peoples);
    }
}

