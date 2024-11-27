package com.example.demo;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class TwoDimRaggedArrayUtilityTestStudent {

    @Test
    public void testReadFile() throws IOException {
        File testFile = new File("testFile.txt");
        try (FileWriter writer = new FileWriter(testFile)) {
            writer.write("1.0 2.0\n3.0 4.0 5.0\n");
        }
        double[][] result = TwoDimRaggedArrayUtility.readFile(testFile);
        assertArrayEquals(new double[][]{{1.0, 2.0}, {3.0, 4.0, 5.0}}, result);
        testFile.delete();
    }

    @Test
    public void testWriteToFile() throws IOException {
        double[][] array = {{1.0, 2.0}, {3.0, 4.0, 5.0}};
        File testFile = new File("testOutput.txt");
        TwoDimRaggedArrayUtility.writeToFile(array, testFile);

        double[][] result = TwoDimRaggedArrayUtility.readFile(testFile);
        assertArrayEquals(array, result);
        testFile.delete();
    }

    @Test
    public void testGetTotal() {
        double[][] array = {{1.0, 2.0}, {3.0, 4.0, 5.0}};
        assertEquals(15.0, TwoDimRaggedArrayUtility.getTotal(array));
    }

    @Test
    public void testGetAverage() {
        double[][] array = {{1.0, 2.0}, {3.0, 4.0, 5.0}};
        assertEquals(3.0, TwoDimRaggedArrayUtility.getAverage(array));
    }

    @Test
    public void testGetColumnTotal() {
        double[][] array = {{1.0, 2.0}, {3.0, 4.0, 5.0}};
        assertEquals(4.0, TwoDimRaggedArrayUtility.getColumnTotal(array, 0));
    }

    @Test
    public void testGetRowTotal() {
        double[][] array = {{1.0, 2.0}, {3.0, 4.0, 5.0}};
        assertEquals(12.0, TwoDimRaggedArrayUtility.getRowTotal(array, 1));
    }

    @Test
    public void testGetHighestInRow() {
        double[][] array = {{1.0, 2.0}, {3.0, 4.0, 5.0}};
        assertEquals(5.0, TwoDimRaggedArrayUtility.getHighestInRow(array, 1));
    }

    @Test
    public void testGetHighestInRowIndex() {
        double[][] array = {{1.0, 2.0}, {3.0, 4.0, 5.0}};
        assertEquals(2, TwoDimRaggedArrayUtility.getHighestInRowIndex(array, 1));
    }

    @Test
    public void testGetLowestInRow() {
        double[][] array = {{1.0, 2.0}, {3.0, 4.0, 5.0}};
        assertEquals(3.0, TwoDimRaggedArrayUtility.getLowestInRow(array, 1));
    }

    @Test
    public void testGetLowestInRowIndex() {
        double[][] array = {{1.0, 2.0}, {3.0, 4.0, 5.0}};
        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInRowIndex(array, 1));
    }

    @Test
    public void testGetHighestInColumn() {
        double[][] array = {{1.0, 2.0}, {3.0, 4.0, 5.0}};
        assertEquals(3.0, TwoDimRaggedArrayUtility.getHighestInColumn(array, 0));
    }

    @Test
    public void testGetHighestInColumnIndex() {
        double[][] array = {{1.0, 2.0}, {3.0, 4.0, 5.0}};
        assertEquals(1, TwoDimRaggedArrayUtility.getHighestInColumnIndex(array, 0));
    }

    @Test
    public void testGetLowestInColumn() {
        double[][] array = {{1.0, 2.0}, {3.0, 4.0, 5.0}};
        assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInColumn(array, 0));
    }

    @Test
    public void testGetLowestInColumnIndex() {
        double[][] array = {{1.0, 2.0}, {3.0, 4.0, 5.0}};
        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInColumnIndex(array, 0));
    }

    @Test
    public void testGetHighestInArray() {
        double[][] array = {{1.0, 2.0}, {3.0, 4.0, 5.0}};
        assertEquals(5.0, TwoDimRaggedArrayUtility.getHighestInArray(array));
    }

    @Test
    public void testGetLowestInArrayIndex() {
        double[][] array = {{1.0, 2.0}, {3.0, 4.0, 5.0}};
        assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInArrayIndex(array));
    }
}
