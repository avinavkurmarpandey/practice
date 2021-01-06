package com.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.myproject.rpn.RPNBasic;

@SpringBootApplication
public class MainTest {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(MainTest.class, args);
		// Taking input from user
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.print("Enter Input: ");
		String input = reader.readLine();

		// A user defined class that evaluates RPN expression
		RPNBasic basic = new RPNBasic();
		System.out.println("O/P: " + basic.evaluateExpression(input));

		
		String writeInput = "2 3 ^ 4 5 + +";// write any input here 
		test(writeInput);
	}

	public static void test(String input) {

		// A user defined class that evaluates RPN expression
		RPNBasic basic = new RPNBasic();
		System.out.println("O/P: " + basic.evaluateExpression(input));
	}
}

