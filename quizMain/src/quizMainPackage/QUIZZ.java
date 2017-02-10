package quizMainPackage;

import com.dauph.lejema160.codePackage.aQuestionForAChampion;

public class QUIZZ {
	
	/**
	 * Main method that execute the quiz.
	 * @param args
	 * @see AdditionQuiz.getQuiz()
	 * @see AdditionQuiz.answerQuiz()
	 * @see AdditionQuiz.endQuiz()
	 */
	public static void main(String[] args) {
		System.out.println("!! WELCOME IN A QUESTION FOR A CHAMPION !!");
		System.out.println("There is ten additions... Let's go !");
		aQuestionForAChampion quiz = new aQuestionForAChampion();
		quiz.getQuiz();
		quiz.answerQuiz();
		quiz.endQuiz();
	}
	
}
