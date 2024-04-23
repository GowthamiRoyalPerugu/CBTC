import java.util.*;

public class GuessTheNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.err.println("!!! NUMBER GUESSING GAME !!!");
		System.err.println("The system generates a random number from a given range 1 to 100.");
		System.err.println("You have to enter their given number by guessing it.");
		System.err.println("The computer then tells if the entered number matches the guesses number");
		System.err.println("The game continues under the user guessing the number.");
		System.err.println("YOU HAVE 3 ATTEMPTS TO GUESS THE CORRECT NUMBER");
		GuessTheNumberMethod ex=new GuessTheNumberMethod();
		ex.guessGame();
		while(true)
		{
			System.err.println("Press 1 to Add Another Round OR PRESS ANY KEY TO EXIT GAME!!!");
			if (scan.nextInt()==1) 
			{
				ex.guessGame();
			}
		}
	}
}

