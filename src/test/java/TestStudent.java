import lab.Learner;
import lab.Person;
import lab.Student;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestStudent {

    @Test
    public void testImplementation() {
        // Given a Student object
        Student student = new Student(123, "Alice");

        // When the Student object is created
        // Then it should be an instance of Learner
        assertInstanceOf(Learner.class, student);
    }
    @Test
    public void testInheritance() {
        // Given a Student object
        Student student = new Student(123, "Alice");

        // When the Student object is created
        // Then it should be an instance of Person
        assertInstanceOf(Person.class, student);
    }
    @Test
    public void testLearn() {
        // Given a Student object with initial study time 0
        Student student = new Student(123, "Alice");
        assertEquals(0.0, student.getTotalStudyTime());

        // When the student learns for 5 hours
        student.learn(5.0);

        // Then the total study time should be 5
        assertEquals(5.0, student.getTotalStudyTime());
    }
}
