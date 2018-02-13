/****************************************************************************
 *
 * Created by: Johnathan Bell
 * Created on: Feb 2018
 * This program calculates the maximum number of logs that gac fit on a truck
 *   given the length of said logs.
 *
 ****************************************************************************/
import java.util.Scanner;

public class CalculateNumberOfLogs {

  public static void main(String[] args) {

    // variables for weights
    double choice = 0.0;
    double maximumPossibleWeight = 1100.0;
    double weightOfMapleLog = 20.0;

        // instructions on how to use the program are at the top when the program is run.
    System.out.println("What is the length, in metes, of the logs you need?"
    + " This program will calculate how many of them will fit in the truck. "
    + " Company one cuts logs to 0.25 metres, company two cuts logs to 0.5 metres, and company 3 cuts logs to 1 metre."
    + " The truck can cary 1100kg, "
    + " your options are company one (1), company two (2) or company three (3)");

    // scanners make user inputs possible (found on
    Scanner input = new Scanner(System.in);
    choice = input.nextInt();
    // if you followed the instructions than the program will calculate the data given one of the three choices

    if (choice == 1) {
      double sizeOfLogs = 0.25;
      System.out.println("");
      System.out.println("you chose " + sizeOfLogs + "m.");
      double weightOfLogs = sizeOfLogs * weightOfMapleLog;
      double numberOfLogs =  maximumPossibleWeight / weightOfLogs;
      System.out.println("the truck can carry " + numberOfLogs + " logs.");

    }else if (choice == 2) {
      double sizeOfLogs = 0.5;
      System.out.println("");
      System.out.println("you chose " + sizeOfLogs + "m.");
      double weightOfLogs = sizeOfLogs * weightOfMapleLog;
      double numberOfLogs =  maximumPossibleWeight / weightOfLogs;
      System.out.println("the truck can carry " + numberOfLogs + " logs.");

    }else if (choice == 3) {
      double sizeOfLogs = 1;
      System.out.println("");
      System.out.println("you chose " + sizeOfLogs + "m.");
      double weightOfLogs = sizeOfLogs * weightOfMapleLog;
      double numberOfLogs =  maximumPossibleWeight / weightOfLogs;
      System.out.println("the truck can carry " + numberOfLogs + " logs.");

     // if you have FAILED to follow the instructions the program advises the user to select one of the options.
    }else {
      System.out.println("");
      System.out.println("you chose " + choice + "?");
      System.out.println("Please select one of the choices from up above...");

    }

  }

}
