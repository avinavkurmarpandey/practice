package com.myproject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.myproject.rpn.RPNBasic;

public class JUnitTest {
	protected String input;

	@Before
	public void setUp() {
		input = "5 1 2 + 4 * + 3 -";
	}

	/*
	 * 1. Input: 1 2 3 + - Output: -4 2. Input: 6 2 * 3 / Output: 4 3. Input: 2
	 * 3 ^ 4 5 + + Output: 17 4. Input: 50 % 2 * Output: 1 5. Input: 3 ! 4 5 * +
	 * Output: 26 6. Input: 12 3 / ! Output: 24 7. Input: 5 1 2 + 4 * + 3 -
	 * Output: 14
	 */
	@Test
	public void test() {
		// A user defined class that evaluates RPN expression
		RPNBasic basic = new RPNBasic();
		Double output = basic.evaluateExpression(input);
		System.out.println(output);
	}

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(JUnitTest.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(result.wasSuccessful());
	}
}
