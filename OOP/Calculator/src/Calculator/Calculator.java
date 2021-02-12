package Calculator;

public class Calculator {
private double operandOne = 0.0;
private double operandTwo = 0.0;
private double total = 0.0;
private String operation = "";

public Calculator() {
	
}

public Calculator(double operandOne, String operation, double operandTwo) {
	this.operandOne = operandOne;
	this.operation = operation;
	this.operandTwo = operandTwo;
}

public double getOperandOne() {
	return operandOne;
}

public void setOperandOne(double operandOne) {
	this.operandOne = operandOne;
}

public double getOperandTwo() {
	return operandTwo;
}

public void setOperandTwo(double operandTwo) {
	this.operandTwo = operandTwo;
}

public double getTotal() {
	return total;
}

public void setTotal(double total) {
	this.total = total;
}

public String getOperation() {
	return operation;
}

public void setOperation(String operation) {
	this.operation = operation;
}

public void performOperation() {
	if(getOperation().equals("+")){
			double total = getOperandOne() + getOperandTwo();
			setTotal(total);
	}
	else if(getOperation().equals("-")) {
		double total = getOperandOne() - getOperandTwo();
		setTotal(total);
	}
}
public void getResults() {
	System.out.println(getTotal());
}
}
