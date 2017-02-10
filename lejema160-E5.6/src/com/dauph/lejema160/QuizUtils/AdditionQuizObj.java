/**
 * 
 */
package com.dauph.lejema160.QuizUtils;

import java.util.Scanner;

import com.dauph.lejema160.AdditionQuestionUtils.AdditionQuestion;

/**
 * @author lejema160
 *
 */
public class AdditionQuizObj {

	/**
	 * Global variable that stores the answers of the user of every question.
	 */
	private static int[] answers = new int[10];
	
	private static AdditionQuestion[] questions = new AdditionQuestion[10];
	
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
	 * Attribute in arrays the ten addition questions.
	 * @see AdditionQuestion
	 */
	public static void getQuiz(){
		for (int i=0; i<10; i++){
			questions[i]= new AdditionQuestion();
		}
	}
	
	/**
	 * Prints the questions and stores in an array the answers of the user for each question.
	 * @see Scanner
	 * @see AdditionQuestion
	 * @see AdditionQuiz.answers
	 */
	public static void answerQuiz(){
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<10; i++){
			System.out.println(questions[i].getQuestion());
			answers[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("");
		System.out.println("The Quiz is OVER!");
		System.out.println("");
	}

	/**
	 * Prints the questions, the result and the answer of the user.
	 * Tells the user if he was right or wrong.
	 * Counts and gives the score of the user at the end.
	 * @see AdditionQuestion
	 * @see AdditionQuiz.answers
	 */
	public static void endQuiz(){
		int score = 0;
		for (int i=0; i<10; i++){
			int result = questions[i].getCorrectAnswer();
			int j=i+1;
			System.out.print("Question "+j+" : ");
			System.out.println(questions[i].getQuestion());
			System.out.println("The correct answer was : "+result);
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
