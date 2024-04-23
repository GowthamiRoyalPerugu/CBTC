import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberMethod {
	public void guessGame()
	{
		Scanner scanner=new Scanner(System.in);
		Random random= new Random();
		int rr= random.nextInt(100);
		for(int j=1;j<=3;j++)
		{
			System.out.print("Guess a Number: ");
			int guess=scanner.nextInt();

			if (rr==guess && (j==1||j==2||j==3))
			{
				System.err.println("You have Guessed Correct Number in "+ j+" Attempt Your SCORE is: "+(10/j));
				return;
			}
			else if (rr!=guess && j>3) 
			{
				System.err.println("You Guessed Wrong number!! Attempt "+j+ " Failed! All Attempts Exhausted!! Your SCORE is: 0 ! The Number Generated is: "+rr);
				return;
			}
			else if (rr!=guess && guess>rr)
			{
				System.err.println("You have Guessed a Wrong Number!! Attempt "+j+" Failed!!"+" Guessed Number is Greater than the system generated number."+rr);
			}
			else if (rr!=guess && guess<rr)
			{
				System.err.println("You have Guessed a Wrong Number!! Attempt "+j+" Failed!!"+" Guessed Number is Smaller than the system generated number."+rr);
			}
		}
		scanner.close();
	}

}
