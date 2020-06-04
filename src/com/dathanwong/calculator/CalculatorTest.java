package com.dathanwong.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.setOperandOne(40.1);
		calc.setOperandTwo(23.52);
		calc.setOperation("+");
		calc.performOperation();
		calc.getResults();
	}

}
