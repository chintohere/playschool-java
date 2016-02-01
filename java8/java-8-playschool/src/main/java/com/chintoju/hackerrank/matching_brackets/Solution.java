package com.chintoju.hackerrank.matching_brackets;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kishore.chintoju on 31/01/2016.
 */
public class Solution
{
	/*
 * Complete the function below.
 */
	static Pattern curly = Pattern.compile("\\{\\}");
	static Pattern square = Pattern.compile("\\[\\]");
	static Pattern round = Pattern.compile("\\(\\)");

	static String[] Braces(String[] values)
	{
		String[] result = new String[values.length];

		for (int i = 0; i < values.length; i++)
		{
			String input = values[i];
			result[i] = isMatching(input) ? "YES" : "NO";
		}

		return result;
	}

	static boolean isMatching(String input)
	{
		System.err.println("checking " + input);

		//empty or unbalanced string
		if (input == null || (input.length() & 1) != 0)
		{
			return false;
		}

		//now start removing matched brackets
		do
		{
			Matcher curlyFinder = curly.matcher(input);
			Matcher squareFinder = square.matcher(input);
			Matcher roundFinder = round.matcher(input);

			if (curlyFinder.find())
			{
				input = curlyFinder.replaceAll("");
			}
			else if (squareFinder.find())
			{
				input = squareFinder.replaceAll("");
			}
			else if (roundFinder.find())
			{
				input = roundFinder.replaceAll("");
			}
			else if (input.length() > 0)
			{
				break;
			}
		}
		while (input.length() > 0);

		return input.isEmpty() ? true : false;
	}

}
