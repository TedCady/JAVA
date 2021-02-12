package Calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator prac = new Calculator (100.8, "-", 22.8);
		Calculator test = new Calculator (75, "+", 22.8);
		prac.performOperation();
		test.performOperation();
		prac.getResults();
		test.getResults();
	}

}
