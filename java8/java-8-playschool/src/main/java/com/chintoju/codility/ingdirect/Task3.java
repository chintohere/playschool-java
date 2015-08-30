package com.chintoju.codility.ingdirect;
// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * Passed. 75%. 1/4th use cases missed.
 */
class Task3
{
	static PrintStream err = System.err;

	static final char[] validChars = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/', '*' };

	static final Set<Character> VALID_CHARS;

	static final Set<Character> OPERATORS;

	static
	{
		VALID_CHARS = new HashSet<>();
		for (char c : validChars)
		{
			VALID_CHARS.add(c);
		}

		OPERATORS = new HashSet<>();
		OPERATORS.add('+');
		OPERATORS.add('/');
		OPERATORS.add('*');
	}

	public int solution(String S)
	{
		try
		{
			//check input
			if (S == null || S.isEmpty() || S.length() > 200000)
				return -1;

			final char[] chars = S.toCharArray();
			if (!isValid(chars))
				return -1;

			//calculate
			int result = -1;

			Deque<BigInteger> characterDeque = new LinkedList<>();

			for (char aChar : chars)
			{
				err.println(aChar);

				if (!isOperator(aChar))
				{
					final BigInteger e = BigInteger.valueOf(Character.getNumericValue(aChar));
					err.println("Number: " + e);
					characterDeque.push(e);
				}
				else if (characterDeque.size() >= 2)
				{
					BigInteger operandA = characterDeque.pop();
					BigInteger operandB = characterDeque.pop();

					err.printf("Operator found.A:  %d, B: %d, OPER: %c \n", operandA, operandB, aChar);

					final BigInteger operate = operate(operandA, operandB, aChar);

					err.println("Result:" + operate);

					characterDeque.push(operate);
				}
				else
				{
					return -1;
				}

			}

			if (characterDeque.size() > 0)
			{
				return characterDeque.pop().intValue();
			}

			return result;
		}
		catch (Exception e)
		{
			err.println("things didn't go well. " + e.toString());
			return -1;
		}
	}

	private BigInteger operate(BigInteger operandA, BigInteger operandB, char aChar)
	{
		switch (aChar)
		{
			case '+':
				return operandA.add(operandB);

			case '/':
				return operandA.divide(operandB);

			case '*':
				return operandA.multiply(operandB);

			default:
				throw new IllegalArgumentException("invalid operator");
		}
	}

	private boolean isOperator(char aChar)
	{
		return OPERATORS.contains(aChar);
	}

	public boolean isValid(char[] characters)
	{
		return IntStream.range(0, characters.length).noneMatch(i -> !VALID_CHARS.contains(characters[i]));
	}
}