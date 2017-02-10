/**
 * 
 */
package com.dauph.lejema160.AdditionQuestionUtils;

/**
 * @author lejema160
 *
 */
public class AdditionQuestion {

	/**
	 * The number of the addition question
	 */
	private int a, b;

	/**
	 * Constructor that generates an addition question
	 * a is a number between 1 and 50
	 * b is a number between 0 and 49
	 */
	public AdditionQuestion(){
		a = (int)(Math.random()*50+1);
		b = (int)(Math.random()*50);
	}
	
	/**
	 * @return a string that is the question
	 */
	public String getQuestion(){
		return "What is "+a+" + "+b+" ?";
	}
	
	/**
	 * @return the correct answer
	 */
	public int getCorrectAnswer(){
		return a+b;
	}

}
