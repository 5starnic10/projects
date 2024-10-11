/**
 * 
 */
package projects.guessinggame;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 */
public class GuessingGame {

	public static void main(String[] args)
    {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int guesses = 0;
		int random = rand.nextInt(101);
        System.out.println("Welcome to Guessing Game!");
        System.out.println("How many guesses can you guess a number from 1-100 in?");
        
        guesses = scan.nextInt();
        int counter = guesses;
        int guess;
        for(int i = 0; i < guesses; i++) {
        	System.out.println("You have " + counter + " guesses left.");
        	System.out.println("Take a guess: ");
        	guess = scan.nextInt();
        	if(guess == random) {
        		if(guess == 1) {
        			System.out.println("Congratulations you won with " + counter + " guess left!");
        		}
        		else {
        			System.out.println("Congratulations you won with " + counter + " guesses left!");
        		}
        	}
        	else {
        		if(guess < random) {
        			System.out.println("Your answer is too low.");
        		}
        		if(guess > random) {
        			System.out.println("Your answer is too high.");
        		}
        	}
        	
        	if(guess == 0) {
        		System.out.println("The correct answer was " + random);
        	}
        	counter--;
        }
        scan.close();
        
    }
}
