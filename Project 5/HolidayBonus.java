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


public class HolidayBonus extends TwoDimRaggedArrayUtility {
    static final int highestBonus = 5000;
    static final int normalBonus = 2000;
    static final int lowestBonus = 1000;

    public static double[] calculateHolidayBonus(double[][] stores){

        double[] bonus = new double[stores.length];

        for(int i = 0; i < stores.length; i++){
            for(int j = 0; j < stores[i].length; j++) {
                if(stores[i].length >= j) {
                    if (stores[i][j] == getHighestInColumn(stores, j)) {
                        bonus[i] += highestBonus;
                    }else if(stores[i][j] == getLowestInColumn(stores, j)) {
                        bonus[i] += lowestBonus;
                    }else{
                        bonus[i] += normalBonus;
                    }
                }
            }
        }

        return bonus;

    }

    public static double calculateTotalHolidayBonus(double[][] stores){
        double totalBonus = 0;
        double[] bonus = calculateHolidayBonus(stores);
        for(int i = 0; i < stores.length; i++){
            totalBonus += bonus[i];
        }

        return totalBonus;
    }



}
