package src.Designs.Behavorial.iterator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class People {
    private String name;
    private String email;
    private Map<String, List<String>> population = new HashMap<>();

    public People(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Email: %s", name, email);
    }
}
