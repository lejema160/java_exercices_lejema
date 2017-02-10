/**
 * 
 */
package DiceUtils;

/**
 * PairOfDice is a class that simulate a roll of a pair of dice.
 * 
 * @author lejema160
 *
 */
public class PairOfDice {
	
	/**
	 * dice1 is the first dice
	 */
	private int dice1;
	
	/**
	 * dice2 is the second dice
	 */
	private int dice2;
	
	/**
	 * Main method that counts how many times a pair of dice is rolled, before the total of the two dice is equal to two.
	 * @param args
	 */
	public static void main(String[] args) {
		PairOfDice dices = new PairOfDice();
		int counter=1;
		dices.rollingToString();
		while (dices.getSum()!=2){
			System.out.println("Not equal to two yet! Rolling it again.");
			System.out.println("The dices are rolling...");
			dices.roll();
			dices.rollingToString();
			counter++;
		}
		System.out.println("Here we are ! It needed "+counter+" rolls to get 2 !");
	}
	
	/**
	 * Constructor of a PairOfDice rolling the dice.
	 */
	public PairOfDice(){
		roll();
	}

	/**
	 * Roll the dice : dice1 and dice2 have a value between 1 and 6.
	 */
	public void roll() {
		dice1 = (int)(Math.random()*(6-1+1)+1);
		dice2 = (int)(Math.random()*(6-1+1)+1);
	}
	
	/**
	 * Shows the result of the roll and the total. 
	 */
	public void rollingToString(){
		if (dice1==dice2) System.out.println("Double "+dice1+" !");
		else System.out.println(dice1+" and "+dice2+" !");
		System.out.println("The total is "+getSum()+" !");
	}
	
	/**
	 * @return the sum of dice1 and dice2
	 */
	public int getSum(){
		int sum = dice1+dice2;
		return sum;
	}

	/**
	 * @return the dice1
	 */
	public int getDice1() {
		return dice1;
	}

	/**
	 * @param dice1 the dice1 to set
	 */
	public void setDice1(int dice1) {
		this.dice1 = dice1;
	}

	/**
	 * @return the dice2
	 */
	public int getDice2() {
		return dice2;
	}

	/**
	 * @param dice2 the dice2 to set
	 */
	public void setDice2(int dice2) {
		this.dice2 = dice2;
	}

}
