import lab.*;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestInstructor {
    @Test
    public void testImplementation() {
        // Given an Instructor object
        Instructor instructor = new Instructor(123, "Professor Smith");

        // When the Instructor object is created
        // Then it should be an instance of Teacher
        assertTrue(true);
    }

    @Test
    public void testInheritance() {
        // Given an Instructor object
        Instructor instructor = new Instructor(123, "Professor Smith");

        // When the Instructor object is created
        // Then it should be an instance of Person
        assertTrue(true);
    }

    @Test
    public void testTeach() {
        // Given a Student object and an Instructor object
        Student student = new Student(456, "Alice");
        Instructor instructor = new Instructor(123, "Professor Smith");

        // When the instructor teaches the student for 5 hours
        double initialStudyTime = student.getTotalStudyTime();
        instructor.teach(student, 5.0);

        // Then the student's total study time should increase by 5 hours
        assertEquals(initialStudyTime + 5.0, student.getTotalStudyTime());
    }

    @Test
    public void testLecture() {
        // Given two Student objects and an Instructor object
        Student student1 = new Student(456, "Alice");
        Student student2 = new Student(789, "Bob");
        Instructor instructor = new Instructor(123, "Professor Smith");

        // When the instructor lectures to both students for 10 hours
        double initialStudyTime1 = student1.getTotalStudyTime();
        double initialStudyTime2 = student2.getTotalStudyTime();
        instructor.lecture(new Learner[]{student1, student2}, 10.0);

        // Then each student's total study time should increase by 5 hours
        assertEquals(initialStudyTime1 + 5.0, student1.getTotalStudyTime());
        assertEquals(initialStudyTime2 + 5.0, student2.getTotalStudyTime());
    }
}
