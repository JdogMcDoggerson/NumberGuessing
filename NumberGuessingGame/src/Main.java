import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int programChosenNum = 0;
        int playerCurrentGuess = 0;
        int numOfPlayerGuesses = 0;

        programChosenNum = (int) (100.00 * Math.random());

        System.out.println("I am thinking of a whole number number between 1 and 100. Try to guess it.");
        System.out.println(" Program's number: " + programChosenNum); //TEST. REMOVE LATER

        while (playerCurrentGuess != programChosenNum) {
            System.out.print("Input a whole number, then press enter:");
            playerCurrentGuess = scnr.nextInt();
            numOfPlayerGuesses = numOfPlayerGuesses + 1;
            if (playerCurrentGuess != programChosenNum){
                System.out.print("\nIncorrect. The number I'm thinking of is ");
            }
            if (playerCurrentGuess < programChosenNum) {
                System.out.println("higher than " + playerCurrentGuess + ".");
            } else if (playerCurrentGuess > programChosenNum) {
                System.out.println("lower than " + playerCurrentGuess + ".");
            }
        }
        if (programChosenNum == playerCurrentGuess) {
            System.out.println("\nCorrect! the number I was thinking of is indeed " + playerCurrentGuess + ".");
            System.out.println("You correctly guessed the number I was thinking of in: " + numOfPlayerGuesses + " guesses!");

        }
    }
    }
