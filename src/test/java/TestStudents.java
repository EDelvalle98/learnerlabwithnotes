import lab.Student;
import lab.Students;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestStudents {
    @Test
    public void testStudents() {
        // Given a Students singleton instance
        Students students = Students.getInstance();

        // When we check for specific students
        // Then the singleton should contain those students
        assertTrue(students.contains(new Student(1, "Alexandria")));
        assertTrue(students.contains(new Student(2, "Ethan")));
        assertTrue(students.contains(new Student(3, "Dayquon")));
        assertTrue(students.contains(new Student(4, "Mahogany")));
        assertTrue(students.contains(new Student(5, "Treasure")));
        assertTrue(students.contains(new Student(6, "Chaela")));
        assertTrue(students.contains(new Student(7, "Collins")));
        assertTrue(students.contains(new Student(8, "Daryna")));
        assertTrue(students.contains(new Student(9, "Ryan")));
    }
}
