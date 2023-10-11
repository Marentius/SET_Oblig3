package no.hiof.vetlemn.oblig2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestLeapYear {
    @Test
    void test_leap_year_when_divisible_by_4_but_not_100() {
        assertTrue(LeapYear.isLeapYear(2024));
    }

    @Test
    void test_leap_year_when_divisible_by_400() {
        assertTrue(LeapYear.isLeapYear(2000));
        assertFalse(LeapYear.isLeapYear(2100));
    }

    @Test
    void test_not_leap_year_when_not_divisible_by_4() {
        assertFalse(LeapYear.isLeapYear(2023));
        assertTrue(LeapYear.isLeapYear(2024));
    }

    @Test
    void test_not_leap_year_when_divisible_by_100_but_leap_year_when_divisible_by_400() {
        assertFalse(LeapYear.isLeapYear(1900));
    }
}
