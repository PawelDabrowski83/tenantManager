package pl.edu.pjwstk.tenantManager.model;

import pl.edu.pjwstk.tenantManager.exeptions.DeveloperNotExistException;
import pl.edu.pjwstk.tenantManager.exeptions.PersonNotExistException;

import java.util.HashSet;
import java.util.Set;

public class Universe {
    private Set<IdentifiableItem> items;

    public Universe() {
        this.items = new HashSet<>();
    }

    public Set<IdentifiableItem> getItems() {
        return items;
    }

    public void add(IdentifiableItem item) {
        items.add(item);
    }

    public Set<Person> getPersons() {
        Set<Person> persons = new HashSet<>();
        for (IdentifiableItem item : items) {
            if (item instanceof Person) {
                persons.add((Person) item);
            }
        }
        return persons;
    }

    public Set<Developer> getDevelopers() {
        Set<Developer> developers = new HashSet<>();
        for (IdentifiableItem item : items) {
            if (item instanceof Developer) {
                developers.add((Developer) item);
            }
        }
        return developers;
    }

    public Person findPerson(int id) {
        return getPersons().stream().filter(n -> n.getId() == id).findFirst().orElseThrow(PersonNotExistException::new);
    }

    public Developer findDeveloper(int id) {
        return getDevelopers().stream().filter(n -> n.getId() == id).findFirst().orElseThrow(DeveloperNotExistException::new);
    }
}
