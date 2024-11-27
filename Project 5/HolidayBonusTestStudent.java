package com.example.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HolidayBonusTestStudent {

    @Test
    public void testCalculateHolidayBonus() {
        double[][] stores = {{1.0, 2.0, 3.0}, {4.0, 5.0}, {6.0, 7.0, 8.0, 9.0}};
        double[] expectedBonuses = {7000.0, 4000.0, 16000.0};
        double[] bonuses = HolidayBonus.calculateHolidayBonus(stores);
        assertArrayEquals(expectedBonuses, bonuses);
    }

    @Test
    public void testCalculateTotalHolidayBonus() {
        double[][] stores = {{1.0, 2.0, 3.0}, {4.0, 5.0}, {6.0, 7.0, 8.0, 9.0}};
        double expectedTotalBonus = 27000.0;
        double totalBonus = HolidayBonus.calculateTotalHolidayBonus(stores);
        assertEquals(expectedTotalBonus, totalBonus);
    }
}
