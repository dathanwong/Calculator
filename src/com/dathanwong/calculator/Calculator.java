package com.dathanwong.calculator;

public class Calculator implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 996082385567994015L;
	private Double operandOne;
	private Double operandTwo;
	private String operation;
	private Double result;
	
	public Calculator() {
		
	}
	
	public void performOperation() {
		//Make sure there are values in the operands
		if(this.getOperandOne() == null || this.getOperandTwo() == null) return;
		//Make sure operation is set to add or subtract
		if(operation.equals("+")) {
			this.setResult(this.getOperandOne() + this.getOperandTwo());
		}else if(operation.equals("-")) {
			this.setResult(this.getOperandOne()-this.getOperandTwo());
		}else {
			System.out.println("Invalid operation only + and - are supported");
		}
		return;
	}
	
	public void getResults() {
		System.out.println("Result: " + this.getResult());
	}

	public Double getOperandOne() {
		return operandOne;
	}

	public void setOperandOne(Double operandOne) {
		this.operandOne = operandOne;
	}

	public Double getOperandTwo() {
		return operandTwo;
	}

	public void setOperandTwo(Double operandTwo) {
		this.operandTwo = operandTwo;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}
	
	
	
}
