import java.util.Scanner;

/**
 * This program simulates an addition quiz.
 * The user has to answer 10 questions (additions).
 * He will see the answers and his score.
 */

/**
 * @author lejema160
 *
 */
public class AdditionQuiz {
	
	/**
	 * Global variable that stores the first int of the addition of every question.
	 */
	public static int[] first = new int [10];
	
	/**
	 * Global variable that stores the second int of the addition of every question.
	 */
	public static int[] second = new int [10];
	
	/**
	 * Global variable that stores the answers of the user of every question.
	 */
	public static int[] answers = new int[10];

	/**
	 * Main method that execute the quiz.
	 * @param args
	 * @see AdditionQuiz.getQuiz()
	 * @see AdditionQuiz.answerQuiz()
	 * @see AdditionQuiz.endQuiz()
	 */
	public static void main(String[] args) {
		System.out.println("!! WELCOME IN THE ADDITION QUIZ !!");
		System.out.println("There is ten additions... Let's go !");
		getQuiz();
		answerQuiz();
		endQuiz();
	}
	
	/**
	 * Attribute in arrays the first and second number of every question.
	 * These numbers are between 0 and 150.
	 * @see Math.random()
	 * @see AdditionQuiz.first
	 * @see AdditionQuiz.second
	 */
	public static void getQuiz(){
		for (int i=0; i<10; i++){
			first[i] = (int)(Math.random()*(150+1));
			second[i] = (int)(Math.random()*(150+1));
		}
	}
	
	/**
	 * Prints the questions and stores in an array the answers of the user for each question.
	 * @see Scanner
	 * @see Scanner.nextInt()
	 * @see Scanner.close()
	 * @see AdditionQuiz.first
	 * @see AdditionQuiz.second
	 * @see AdditionQuiz.answers
	 */
	public static void answerQuiz(){
		for (int i=0; i<10; i++){
			System.out.println("Question "+(i+1)+" : "+first[i]+" + "+second[i]+" = ?");
			Scanner sc = new Scanner(System.in);
			answers[i]=sc.nextInt();
			sc.close();
		}
		System.out.println("");
		System.out.println("The Quiz is OVER!");
		System.out.println("");
	}
	
	/**
	 * Prints the questions, the result and the answer of the user.
	 * Tells the user if he was right or wrong.
	 * Counts and gives the score of the user at the end.
	 * @see AdditionQuiz.first
	 * @see AdditionQuiz.second
	 * @see AdditionQuiz.answers
	 */
	public static void endQuiz(){
		int score = 0;
		for (int i=0; i<10; i++){
			int result = first[i]+second[i];
			int j=i+1;
			System.out.println(j);
			System.out.println("Question "+j+" : "+first[i]+" + "+second[i]+" = "+result);
			System.out.println("You answered : "+answers[i]);
			if (answers[i]==result) {
				System.out.println("It's right ! You win a point.");
				score++;
			}
			else System.out.println("It's wrong ! You don't win any point...");
		}
		System.out.println("");
		System.out.println("The quiz is over, your score : "+score+"/10");
	}

}
