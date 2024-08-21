package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList l;
    @BeforeEach
    void init(){
       l = new StudentList();
    }
    @Test
    void findStudentbyIdTest(){
        l.addNewStudent("1", "Doe");
        assertNull(l.findStudentById("2"));
        assertNotNull(l.findStudentById("1"));
    }
    @Test
    void addNewStudentTest() {
       l.addNewStudent("1", "Doe");
       assertNotEquals(null , l.findStudentById("1"));
       assertEquals(null , l.findStudentById("2"));
       l.addNewStudent("2", "Doe" , 100);
       assertNotEquals(null , l.findStudentById("2"));
    }
    @Test
    void giveScoreToIdTest(){
        l.addNewStudent("1", "Doe");
        l.giveScoreToId("1" , 100);
        assertEquals(100 , l.findStudentById("1").getScore());
    }
}