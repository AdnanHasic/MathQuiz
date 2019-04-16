
public class MathematicalOperations {

	public void addition() {

		int x = (int) (Math.random() * 10 + 1);
		int y = (int) (Math.random() * 10 + 1);

		System.out.println(x + " + " + y + " = ");

		int result = MathQuiz.unos.nextInt();

		if (result == (x + y)) {

			System.out.println("Your answer is correct");

		} else {

			System.out.println("Your answer is wrong. The correct answer is " + (x + y));
		}

	}

	public void subtraction() {

		int x = (int) (Math.random() * 10 + 1);
		int y = (int) (Math.random() * 10 + 1);

		System.out.println(x + " - " + y + " = ");

		int result = MathQuiz.unos.nextInt();

		if (result == (x - y)) {

			System.out.println("Your answer is correct");

		} else {

			System.out.println("Your answer is wrong. The correct answer is " + (x - y));
		}

	}

	public void multiplication() {

		int x = (int) (Math.random() * 10 + 1);
		int y = (int) (Math.random() * 10 + 1);

		System.out.println(x + " * " + y + " = ");

		int result = MathQuiz.unos.nextInt();

		if (result == (x * y)) {

			System.out.println("Your answer is correct");

		} else {

			System.out.println("Your answer is wrong. The correct answer is " + (x * y));
		}

	}

	public void division() {

		int x = (int) (Math.random() * 10 + 1);
		int y = (int) (Math.random() * 10 + 1);

		System.out.println(x + " / " + y + " = ");

		double result = MathQuiz.unos.nextInt();

		if (result == ((double) x / y)) {

			System.out.println("Your answer is correct");

		} else {

			System.out.println("Your answer is wrong. The correct answer is " + ((double) x / y));
		}

	}

	public void squared() {

		int x = (int) (Math.random() * 10 + 1);
		int y = (int) (Math.random() * 10 + 1);

		System.out.println(x + " ^ " + y + " = ");

		int result = MathQuiz.unos.nextInt();

		if (result == (int) Math.pow(x, y)) {

			System.out.println("Your answer is correct");

		} else {

			System.out.println("Your answer is wrong. The correct answer is " + (int) Math.pow(x, y));
		}

	}

	public void squareRoot() {

		int x = (int) (Math.random() * 10 + 1);

		System.out.println("Square root : " + x);

		double result = MathQuiz.unos.nextDouble();

		if (result == Math.sqrt(x)) {

			System.out.println("Your answer is correct");

		} else {

			System.out.println("Your answer is wrong. The correct answer is " + Math.sqrt(x));
		}

	}

	public void randomChoice() {

		int counter = 0;

		while (counter < 5) {

			int choice = (int) (Math.random() * 6 + 1);

			switch (choice) {

			case 1:
				addition();
				break;

			case 2:
				subtraction();
				break;

			case 3:
				multiplication();
				break;

			case 4:
				division();
				break;

			case 5:
				squared();
				break;

			case 6:
				squareRoot();
				break;

			}

			counter++;
		}
	}

}
