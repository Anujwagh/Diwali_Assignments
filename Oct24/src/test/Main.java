package test;

import study.Calculator;
import study.WrongOperatorException;

public class Main {
    public static void main(String[] args) {
    	
        int a = 10;
        int b = 0;
        String operator = "%"; 

        try {
        	
            int result = Calculator.calculate(a, b, operator);
            System.out.println("Result: " + result);
            
        } catch (WrongOperatorException e) {
        	
            System.out.println("Error: " + e.getMessage());
            
        } catch (ArithmeticException e) {
        	
            System.out.println("Error: " + e.getMessage());
        }
    }
}
