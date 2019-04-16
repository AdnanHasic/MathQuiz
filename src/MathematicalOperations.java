
public class MathematicalOperations {

	public void sabiranjeBrojeva() {

		int x = (int) (Math.random() * 10 + 1);
		int y = (int) (Math.random() * 10 + 1);

		for (;;) {

			System.out.println(x + " + " + y + " = ");

			int rezultat = MathQuiz.unos.nextInt();

			if (rezultat == (x + y)) {

				System.out.println("Vas odgovor je tacan");
				break;

			} else {

				System.out.println("Vas odgovor je pogresan, pokusajte ponovo");
			}

		}

	}

	public void oduzimanjeBrojeva() {

		int x = (int) (Math.random() * 10 + 1);
		int y = (int) (Math.random() * 10 + 1);

		for (;;) {

			System.out.println(x + " - " + y + " = ");

			int rezultat = MathQuiz.unos.nextInt();

			if (rezultat == (x - y)) {

				System.out.println("Vas odgovor je tacan");
				break;

			} else {

				System.out.println("Vas odgovor je pogresan, pokusajte ponovo");
			}
		}
	}

	public void mnozenjeBrojeva() {

		int x = (int) (Math.random() * 10 + 1);
		int y = (int) (Math.random() * 10 + 1);

		for (;;) {

			System.out.println(x + " * " + y + " = ");

			int rezultat = MathQuiz.unos.nextInt();

			if (rezultat == (x * y)) {

				System.out.println("Vas odgovor je tacan");
				break;

			} else {

				System.out.println("Vas odgovor je pogresan, pokusajte ponovo");
			}

		}

	}
	
	public void dijeljenjeBrojeva() {

		int x = (int) (Math.random() * 10 + 1);
		int y = (int) (Math.random() * 10 + 1);

		for (;;) {

			System.out.println(x + " / " + y + " = ");

			int rezultat = MathQuiz.unos.nextInt();

			if (rezultat == (x / y)) {

				System.out.println("Vas odgovor je tacan");
				break;

			} else {

				System.out.println("Vas odgovor je pogresan, pokusajte ponovo");
			}

		}

	}
	
	public void randomIzbor () {
		
		int izbor = (int)(Math.random()*4+1);
		
		switch(izbor) {
		
		case 1: sabiranjeBrojeva();
		break;
		
		case 2: oduzimanjeBrojeva();
		break;
		
		case 3: mnozenjeBrojeva();
		break;
		
		case 4: dijeljenjeBrojeva();
		break;
		
		}
	}

}
