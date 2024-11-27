package com.example.demo;

/*
 * Class: CMSC203
 * Instructor: Pro. Eivaz
 * Description: Calculates bonuses
 * Due: 11/26/2024
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
 *  I have not copied the code from a student or any source.
 *  I have not given my code to any student.
 *  Print your Name here: Christopher Andrews
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class TwoDimRaggedArrayUtility {



    public static double[][] readFile(File fileName) throws FileNotFoundException {
        ArrayList<double[]> list = new ArrayList<>();

        try (Scanner scanner = new Scanner(fileName)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] numbers = line.trim().split("\\s+");
                double[] row = new double[numbers.length];

                for (int i = 0; i < numbers.length; i++) {
                    row[i] = Double.parseDouble(numbers[i]);
                }
                list.add(row);
            }
        }

        double[][] array = new double[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        return array; 
    }

    public static void writeToFile(double[][] array, File fileName) throws IOException {
        try(FileWriter writer = new FileWriter(fileName)) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    writer.write(array[i][j] + " ");
                }
                writer.write("\n");
            }
            writer.close();
        }

    }

    public static double getTotal(double[][] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    public static double getAverage(double[][] array){
        double sum = 0;
        double elements = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                elements++;
            }
        }

        return sum/elements;
    }

    public static double getColumnTotal(double[][] array, int column) {
        double sum = 0;
        for (int i = 0; i < array[i].length-1; i++) {
            if (array[i].length-1 >= (column)) {
                sum += array[i][column];
            }
        }
        return sum;
    }

    public static double getRowTotal(double[][] array, int row) {
        double sum = 0;
        for (int i = 0; i < array[row].length-1; i++) {
            sum += array[row][i];
        }
        return sum;
    }

    public static double getHighestInRow(double[][] array, int row) {
        double highest = array[row][0];
        for (int i = 0; i < array[row].length; i++) {
            if (array[row][i] > highest){
                highest = array[row][i];
            }
        }
        return highest;
    }

    public static double getHighestInRowIndex(double[][] array, int row) {
        double index = 0;
        double highest = array[row][0];
        for (int i = 0; i < array[row].length; i++) {
            if (array[row][i] > highest){
                index = i;
            }
        }
        return index;
    }

    public static double getLowestInRow(double[][] array, int row) {
        double lowest = array[row][0];
        for (int i = 0; i < array[row].length; i++) {
            if (array[row][i] < lowest){
                lowest = array[row][i];
            }
        }
        return lowest;
    }

    public static double getLowestInRowIndex(double[][] array, int row){
        double index = 0;
        double lowest = array[row][0];
        for (int i = 0; i < array[row].length; i++) {
            if (array[row][i] < lowest){
                index = i;
            }
        }
        return index;
    }

    public static double getHighestInColumn(double[][] array, int column) {
        double highest = 0;
        for(int i = 0; i < array.length-1; i++){
            if(array[i].length-1 >= (column)){
                highest = array[i][column];
                break;
            }
        }

        for (int i = 0; i < array.length-1; i++) {
            if(array[i].length-1 >= (column)){
                if(array[i][column] > highest){
                    highest = array[i][column];
                }
            }
        }
        return highest;
    }

    public static double getHighestInColumnIndex(double[][] array, int column){
        double highest = 0;
        double index = 0;
        for (int i = 0; i < array[0].length; i++) {
            if(array[i].length >= (column)){
                if(array[i][column] > highest){
                    index = i;
                }
            }
        }
        return index;
    }

    public static double getLowestInColumn(double[][] array, int column) {
        double lowest = 0;

        for(int i = 0; i < array.length-1; i++){
            if(array[i].length-1 >= (column)){
                lowest = array[i][column];
                break;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i].length-1 >= (column)){
                if(array[i][column] < lowest){
                    lowest = array[i][column];
                }
            }
        }
        return lowest;
    }

    public static double getLowestInColumnIndex(double[][] array, int column){
        double lowest = 0;
        double index = 0;
        for (int i = 0; i < array[0].length; i++) {
            if(array[i].length >= (column)){
                if(array[i][column] < lowest){
                    index = i;
                }
            }
        }
        return index;
    }

    public static double getHighestInArray(double[][] array){
        double highest = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] > highest){
                    highest = array[i][j];
                }
            }
        }
        return highest;
    }

    public static double getLowestInArrayIndex(double[][] array){
        double lowest = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] > lowest){
                    lowest = array[i][j];
                }
            }
        }
        return lowest;
    }



}
