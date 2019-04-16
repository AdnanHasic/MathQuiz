import java.util.Scanner;

public class MathQuiz {

	public static Scanner unos = new Scanner(System.in);

	public static void main(String[] args) {

		MathematicalOperations mathOp = new MathematicalOperations();

		mathOp.randomChoice();

		System.out.println("You have correct anwsers : " + mathOp.getCounterCorrectAnswer());
		System.out.println("You have wrong answers : " + mathOp.getCounterWrongAnsswer());
	}

}
