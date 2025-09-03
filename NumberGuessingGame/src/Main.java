import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int programChosenNum = 0;
        int playerCurrentGuess = 0;
        int numOfPlayerGuesses = 0;

        programChosenNum = (int) (100.00 * Math.random());

    System.out.println("I am thinking of a whole number number between 1 and 100. Try to guess it.");
    System.out.print("Input a whole number, then press enter:");
    playerCurrentGuess = scnr.nextInt();Math.random();

    if (programChosenNum == playerCurrentGuess) {
        System.out.println("Correct! the number I was thinking of is indeed " + playerCurrentGuess + ".");
    }
    else {
        System.out.print("Incorrect. The number I'm thinking of is ");
    }
    if (playerCurrentGuess < programChosenNum) {
        System.out.print("higher than " + playerCurrentGuess + ".");
    }
    else if (playerCurrentGuess > programChosenNum) {
        System.out.print("lower than " + playerCurrentGuess + ".");

    }
    System.out.println(" Program's number: " + programChosenNum); //TEST. REMOVE LATER


    }
    }
