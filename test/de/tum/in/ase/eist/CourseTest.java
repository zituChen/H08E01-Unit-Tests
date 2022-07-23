package de.tum.in.ase.eist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CourseTest {

    // TODO 1: Test getCourseTitle()

    // TODO 2: Test getNumberOfAttendees()

    @Test
    void testGetCourseTitle() {
        Course course = new Course("EIST for Pros");
        assertEquals("EIST for Pros", course.getTitle());
    }

    @Test
    void testNoAttendees() {
        Course course = new Course("EIST for Pros");
        assertEquals(0, course.getNumberOfAttendees());
    }

    @Test
    void testThreeAttendees() {
        Course course = new Course("EIST for Pros");
        Student student1 = new Student("Donald", "Trump", "14.06.1946", "politics", "math");
        Student student2 = new Student("Marc", "Davis", "25.09.2000", "information system", "math");
        Student student3 = new Student("Luffy", "Monkey.D", "05.10.2001", "software engineering", "math");
        course.getAttendees().add(student1);
        course.getAttendees().add(student2);
        course.getAttendees().add(student3);
        assertEquals(3, course.getNumberOfAttendees());
    }

}
