/*
 * Class: CMSC203
 * Instructor: Prof. Eivazi
 * Description: Intializes attributes and prints information
 * Due: 09/29/2024
 * Platform/compiler: ItelliJ IDEA
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
   Print your Name here: Christopher Andrews
*/

import java.util.Scanner;

public class PatientDriverApp{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter patient first name: ");
        String firstName = input.nextLine();

        System.out.println("Enter patient middle name: ");
        String middleName = input.nextLine();

        System.out.println("Enter patient last name: ");
        String lastName = input.nextLine();

        System.out.println("Enter patient street address: ");
        String streetAddress = input.nextLine();

        System.out.println("Enter patient city: ");
        String city = input.nextLine();

        System.out.println("Enter patient state (eg., MD: ");
        String state = input.nextLine();

        System.out.println("Enter patient zip code: ");
        String zipCode = input.nextLine();

        System.out.println("Enter patient phone number: ");
        String phoneNumber = input.nextLine();

        System.out.println("Enter patient emergency contact name: ");
        String emergencyName = input.nextLine();

        System.out.println("Enter patient emergency contact number: ");
        String emergencyPhone = input.nextLine();

        Patient patient = new Patient(firstName, middleName, lastName, streetAddress, city, state, zipCode, phoneNumber,
                emergencyName, emergencyPhone);

        Procedure procedure1 = new Procedure("Physical Exam","7/20/2019","Dr.Andrews",3000);

        Procedure procedure2 = new Procedure("Colonoscopy","3/15/2024");
        procedure2.setPractitionerName("Dr.Williams");
        procedure2.setProcedureCharges(1092.32);

        Procedure procedure3 = new Procedure();
        procedure3.setProcedureName("Blood Test");
        procedure3.setProcedureDate("7/14/24");
        procedure3.setPractitionerName("Dr.Combs");
        procedure3.setProcedureCharges(219.78);

        displayPatient(patient);

        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);

        double totalCharges = calculateTotalCharges(procedure1.getProcedureCharges(), procedure2.getProcedureCharges(), procedure3.getProcedureCharges());
        System.out.printf("\n Total Charges: $" + String.format("%.2f", totalCharges));

        displayStudentInfo();

    }

    public static void displayPatient(Patient patient){
        System.out.println(patient.toString());
    }

    public static void displayProcedure(Procedure procedure){
        System.out.println(procedure.toString());
    }

    public static double calculateTotalCharges(double total1, double total2, double total3){
        double totalCharges = total1 + total2 + total3;
        return totalCharges;
    }

    public static void displayStudentInfo(){
        System.out.println("\n\nStudent Name: Christopher Andrews");
        System.out.println("MC# M21166373");
        System.out.println("Due Date: 09/29/2024");
    }

}


