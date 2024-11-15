package src.Designs.Behavorial.iterator;

import java.util.ArrayList;
import java.util.List;

public class PeopleIterator implements Iterator{
    private List<People> peopleList;
    private int position = 0;


    public PeopleIterator(List<People> peopleList) {
        this.peopleList = peopleList;
    }

    @Override
    public People getNext() {
        return peopleList.get(position++);
    }

    @Override
    public boolean hashNext() {
        return position < peopleList.size();
    }
}
