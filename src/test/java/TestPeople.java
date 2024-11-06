import lab.People;
import lab.Person;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPeople {
    @Test
    public void testAdd() {
        // Given an empty People object
        People people = new People();

        // When two people are added to the list
        Person person1 = new Person(1, "Alice");
        Person person2 = new Person(2, "Bob");
        people.add(person1);
        people.add(person2);

        // Then the list should contain both people
        assertEquals(2, people.count());
        assertTrue(people.contains(person1));
        assertTrue(people.contains(person2));
    }

    @Test
    public void testRemove() {
        // Given a People object with two people
        People people = new People();
        Person person1 = new Person(1, "Alice");
        Person person2 = new Person(2, "Bob");
        people.add(person1);
        people.add(person2);

        // When one person is removed by object reference and another by ID
        people.remove(person1);
        people.remove(2);

        // Then the list should be empty
        assertEquals(0, people.count());
    }

    @Test
    public void testFindById() {
        // Given a People object with two people
        People people = new People();
        Person person1 = new Person(1, "Alice");
        Person person2 = new Person(2, "Bob");
        people.add(person1);
        people.add(person2);

        // When we search for people by ID
        assertEquals(person1, people.findById(1));
        assertEquals(person2, people.findById(2));
        assertNull(people.findById(3));
    }
}
