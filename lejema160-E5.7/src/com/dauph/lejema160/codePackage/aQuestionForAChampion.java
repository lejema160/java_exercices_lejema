/**
 * 
 */
package com.dauph.lejema160.codePackage;

import java.util.Scanner;

import com.dauph.lejema160.scriptPackage.AdditionQuestion;

import package1.IntQuestion;

/**
 * @author lejema160
 *
 */
public class aQuestionForAChampion {

	/**
	 * Global variable that stores the answers of the user of every question.
	 */
	private int[] answers = new int[10];
	
	/**
	 * Global variable that stores the questions
	 */
	private IntQuestion[] questions = new AdditionQuestion[10];
	
	/**
	 * Attribute in arrays the ten addition questions.
	 * @see AdditionQuestion
	 */
	public void getQuiz(){
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
	public void answerQuiz(){
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
	public void endQuiz(){
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
