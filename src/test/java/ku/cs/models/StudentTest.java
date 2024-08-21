package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s1;
    @BeforeEach
    void init(){
        s1 = new Student("01" , "Pan");
    }
    @Test
    void testAddscore(){
        assertEquals(0, s1.getScore());
        s1.addScore(10);
        assertEquals(10, s1.getScore());
        s1.addScore(40.9);
        assertEquals(50.9, s1.getScore());
    }
    @Test
    void testCalculateGrade(){
       assertEquals("F" , s1.grade());
       s1.addScore(80);
       assertEquals("A" , s1.grade());
    }
    @Test
    void testGetName(){
        s1.changeName("");
        assertEquals("Pan", s1.getName());
        s1.changeName("     test1    ");
        assertEquals("test1", s1.getName());
    }
    @Test
    void testIsId(){
        assertEquals(true , s1.isId("01"));
        assertEquals(false , s1.isId(""));
    }
    @Test
    void testGetId(){
        assertEquals("01", s1.getId());
    }
}