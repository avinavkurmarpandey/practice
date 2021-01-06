package com.myproject.rpn;

import java.util.Arrays;
import java.util.HashSet;

public class OperatorChecker {
	public static boolean isOperator(String token) {
		HashSet<String> match = new HashSet<>(Arrays.asList("(", ")", "+", "-",
				"%", "/", "*", "^", "!"));

		if (match.contains(token)) {
			return true;
		}
		return false;
	}

}
