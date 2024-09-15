/*
* Class: CMSC203
* Instructor: Prof. Eivazi
* Description: CMSC203
* Due: 9/15/24
* Platform/compiler: ItelliJ IDEA, Windows 11
* I pledge that I have completed the programming assignment
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
* Print your Name here: Christopher Andrews
*/

import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.io.PrintWriter;

public class ESPGame {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        //Prints colors to file
        PrintWriter outputFile = new PrintWriter("colors.txt");
        outputFile.println("black");
        outputFile.println("white");
        outputFile.println("gray");
        outputFile.println("silver");
        outputFile.println("maroon");
        outputFile.println("red");
        outputFile.println("purple");
        outputFile.println("fuchsia");
        outputFile.println("green");
        outputFile.println("lime");
        outputFile.println("olive");
        outputFile.println("yellow");
        outputFile.println("navy");
        outputFile.println("blue");
        outputFile.println("teal");
        outputFile.println("aqua");
        outputFile.close();

        //Introduction
        System.out.println("CMSC203 Assignment1: Test your ESP skills!");
        System.out.println("Enter the filename: ");
        //User input for filename
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();

        //Checks that user entered proper filename
        if (filename.compareTo("colors.txt") == 0) {

            System.out.println("There are sixteen colors from a file: ");

            File colors = new File("colors.txt");
            Scanner input = new Scanner(colors);

            //Prints colors from file
            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
        } else {
            //Ends game if invalid filename is entered
            System.out.println("That file does not exist. Ending game.");
            System.exit(0);
        }

        //Starts game
        int round = 1;
        int points = 0;
        do {
            System.out.println("\n" + "Round " + round + "\n");
            System.out.println("I am thinking of a color.");

            //Picks random number and goes through file to get corresponding color
            Random rand = new Random();
            int colorNum = rand.nextInt(16) + 1;
            RandomAccessFile raf = new RandomAccessFile("colors.txt", "rw");
            raf.seek(0);
            String curColor = null;
            for (int i = 0; i < colorNum; i++) {
                curColor = raf.readLine();
            }

            System.out.println("It is a color from the list above");
            System.out.println("Enter your guess: ");

            boolean correctGUESS = true;
            do {
                String guess = sc.nextLine();

                //Checks if guess is the same as the color determined by random
                switch (guess) {
                    case "black":
                        if (curColor.compareTo(guess) == 0) {
                            points++;
                        }
                        correctGUESS = true;
                        break;
                    case "white":
                        if (curColor.compareTo(guess) == 0) {
                            points++;
                        }
                        correctGUESS = true;
                        break;
                    case "gray":
                        if (curColor.compareTo(guess) == 0) {
                            points++;
                        }
                        correctGUESS = true;
                        break;
                    case "silver":
                        if (curColor.compareTo(guess) == 0) {
                            points++;
                        }
                        correctGUESS = true;
                        break;
                    case "maroon":
                        if (curColor.compareTo(guess) == 0) {
                            points++;
                        }
                        correctGUESS = true;
                        break;
                    case "red":
                        if (curColor.compareTo(guess) == 0) {
                            points++;
                        }
                        correctGUESS = true;
                        break;
                    case "purple":
                        if (curColor.compareTo(guess) == 0) {
                            points++;
                        }
                        correctGUESS = true;
                        break;
                    case "fuchsia":
                        if (curColor.compareTo(guess) == 0) {
                            points++;
                        }
                        correctGUESS = true;
                        break;
                    case "green":
                        if (curColor.compareTo(guess) == 0) {
                            points++;
                        }
                        correctGUESS = true;
                        break;
                    case "lime":
                        if (curColor.compareTo(guess) == 0) {
                            points++;
                        }
                        correctGUESS = true;
                        break;
                    case "olive":
                        if (curColor.compareTo(guess) == 0) {
                            points++;
                        }
                        correctGUESS = true;
                        break;
                    case "yellow":
                        if (curColor.compareTo(guess) == 0) {
                            points++;
                        }
                        correctGUESS = true;
                        break;
                    case "navy":
                        if (curColor.compareTo(guess) == 0) {
                            points++;
                        }
                        correctGUESS = true;
                        break;
                    case "blue":
                        if (curColor.compareTo(guess) == 0) {
                            points++;
                        }
                        correctGUESS = true;
                        break;
                    case "teal":
                        if (curColor.compareTo(guess) == 0) {
                            points++;
                        }
                        correctGUESS = true;
                        break;
                    case "aqua":
                        if (curColor.compareTo(guess) == 0) {
                            points++;
                        }
                        correctGUESS = true;
                        break;
                    default:
                        correctGUESS = false;
                        System.out.println("That is not a valid guess. Enter a new guess: ");
                }
            } while (correctGUESS == false);

            System.out.println("I was thinking of " + curColor);

            round++;


        } while (round < 4);

        System.out.println("\nGame Over");
        System.out.println("You guessed " + points + " out of 3 colors correctly.");

        //Ask for user info
        System.out.println("Enter your name: ");
        Scanner user = new Scanner(System.in);
        String name = user.nextLine();
        System.out.println("Describe yourself: ");
        String Desc = user.nextLine();
        System.out.println("Due Date: ");
        String Due = user.nextLine();
        System.out.println("User name: " + name);
        System.out.println("Description: " + Desc);
        System.out.println("Date: " + Due);
        System.out.println("\nProgrammer: Christopher Andrews");
    }
}
