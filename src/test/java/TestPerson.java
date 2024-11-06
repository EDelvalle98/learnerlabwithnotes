import lab.Person;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPerson {

    @Test
    public void testConstructor() {
        // Given a person with id 123 and name "Alice"
        Person person = new Person(123, "Alice");

        // When the person object is created
        // Then the id and name should be correctly set
        assertEquals(123, person.getId());
        assertEquals("Alice", person.getName());
    }

    @Test
    public void testSetName() {
        // Given a person with id 456 and name "Bob"
        Person person = new Person(456, "Bob");

        // When the name is set to "Charlie"
        person.setName("Charlie");

        // Then the name should be updated to "Charlie"
        assertEquals("Charlie", person.getName());
    }
}
