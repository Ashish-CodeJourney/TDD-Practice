package leap.year;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    void testYearDivisibleBy400(){
        LeapYear year = new LeapYear();
        assertEquals("This is a Leap Year", year.isLeapYear(2000));
    }

    @Test
    void testYearDivisibleBy100Not400(){
        LeapYear year = new LeapYear();
        assertEquals("This is Not a Leap Year", year.isLeapYear(1700));
        assertEquals("This is Not a Leap Year", year.isLeapYear(1800));
        assertEquals("This is Not a Leap Year", year.isLeapYear(1900));
        assertEquals("This is Not a Leap Year", year.isLeapYear(2100));
    }

    @Test
    void testLeapYearDivisibleBy4Not100(){
        LeapYear year = new LeapYear();
        assertEquals("This is a Leap Year", year.isLeapYear(2008));
        assertEquals("This is a Leap Year", year.isLeapYear(2012));
        assertEquals("This is a Leap Year", year.isLeapYear(2016));
    }

    @Test
    void testYearNotDivisibleBy4(){
        LeapYear year = new LeapYear();
        assertEquals("This is Not a Leap Year", year.isLeapYear(2017));
        assertEquals("This is Not a Leap Year", year.isLeapYear(2018));
        assertEquals("This is Not a Leap Year", year.isLeapYear(2019));
    }
}
