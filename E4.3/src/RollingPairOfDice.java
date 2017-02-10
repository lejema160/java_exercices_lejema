import java.util.Scanner;

/**
 * This program simulates rolling a pair of dice while we get a certain number 
 * between 2 and 12.
 * The user can enter the number he wants.
 * If you want to see the number of rolls it takes to get snake eyes, enter 2.
 */

/**
 * @author lejema160
 *
 */
public class RollingPairOfDice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number = getNumber();
		System.out.println("It takes "+getNumberOfTimes(number)+" times to get number "+number+".");
		System.out.println("It takes "+getNumberOfTimes(2)+" times to get SNAAAAAKE EYYYYEEEES !!");

	}
	/**
	 * 
	 * @return the number we want for the total of the dice.
	 * @throws IllegalArgumentException
	 */
	public static int getNumber() throws IllegalArgumentException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number between 2 and 12 :");
		int number = sc.nextInt();
		sc.close();
		if (number < 2 || number > 12) throw new IllegalArgumentException();
		return number;		
	}
	/**
	 * 
	 * @param number
	 * @return the number of times it takes to take to get the number in param.
	 */
	public static int getNumberOfTimes(int number){
		int premierDe = (int)(Math.random()*(6-1+1))+1;
		int secondDe = (int)(Math.random()*(6-1+1))+1;
		int numberOfTimes = 1;
		while (premierDe+secondDe!=number){
			numberOfTimes++;
			premierDe = (int)(Math.random()*(6-1+1))+1;
			secondDe = (int)(Math.random()*(6-1+1))+1;
		}
		return numberOfTimes;
	}
	
}
