package com.chintoju.codility.ingdirect;

// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * passed 100%. All use cases covered.
 */
class Task2
{
	static PrintStream err = System.err;

	public int solution(int A, int B)
	{
		//check invalid input
		if (A < 0 || B < 0)
			return -1;

		//default result
		long result = -1L;
		StringBuilder resultBuilder = new StringBuilder();
		try
		{
			err.printf("A :%d, B: %d \n", A, B);

			final String strA = String.valueOf(A);
			final String strB = String.valueOf(B);

			final LinkedList<Character> charsA = buildList(strA.toCharArray());
			final LinkedList<Character> charsB = buildList(strB.toCharArray());

			final ListIterator<Character> charAIter = charsA.listIterator();
			final ListIterator<Character> charBIter = charsB.listIterator();

			while (charAIter.hasNext() && charBIter.hasNext())
			{
				resultBuilder.append(charAIter.next());
				resultBuilder.append(charBIter.next());
			}

			appendRest(resultBuilder, charAIter);
			appendRest(resultBuilder, charBIter);

			String resultStr = resultBuilder.toString();

			if(resultStr.startsWith("0"))
				resultStr = resultStr.substring(1,resultStr.length());

			result = Long.decode(resultStr);

			//remove leading zero
			//check max
			if (result > 100_000_000)
				return -1;

			final int intValue = new Long(result).intValue();
			err.println(intValue);
			return intValue;
		}
		catch (Exception e)
		{
			err.println("things didn't go well. " + e.getMessage());
			return -1;
		}
	}

	private void appendRest(StringBuilder resultBuilder, ListIterator<Character> charAIter)
	{
		while (charAIter.hasNext())
		{
			resultBuilder.append(charAIter.next());
		}
	}

	private LinkedList<Character> buildList(char[] chars)
	{
		LinkedList<Character> list = new LinkedList<>();

		for (char c : chars)
		{
			list.add(c);
		}
		return list;
	}
}
