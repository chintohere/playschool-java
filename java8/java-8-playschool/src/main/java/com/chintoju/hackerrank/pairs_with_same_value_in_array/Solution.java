package com.chintoju.hackerrank.pairs_with_same_value_in_array;

import java.io.BufferedReader;
import java.io.StreamTokenizer;
import java.util.*;
import java.util.stream.IntStream;

public class Solution
{

	public static void main(String[] args)
	{
	    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

		Scanner console = new Scanner(System.in);

		int tesCases = console.nextInt();
		console.nextLine();

		IntStream.range(0, tesCases).forEach(i -> checkPairs(console.nextInt(), console));
	}

	private static void checkPairs(int numbersCount, Scanner console)
	{
		console.nextLine();

		int[] numbers = new int[numbersCount];

		final String numbersStr = console.nextLine();

		System.err.println(Calendar.getInstance().getTime() + "numbers: " + numbersStr);

		StringTokenizer tokenizer = new StringTokenizer(numbersStr, " ");
		IntStream.range(0, numbersCount).forEach(i -> numbers[i] = Integer.parseInt(tokenizer.nextToken()));

		System.err.print(Calendar.getInstance().getTime() + "read numbers into array");

		int matchedPairsCount = countMatchedPairs(numbers);

		System.out.println(matchedPairsCount);
	}

	private static int countMatchedPairs(int[] numbers)
	{
		int matchedPairs = 0;
		for (int i = 0; i < numbers.length; i++)
		{
			for (int j = 0; j < numbers.length; j++)
			{
				//dont match the same number
				if (i == j)
				{
					continue;
				}

				if (numbers[i] == numbers[j])
				{
					matchedPairs++;
				}

			}
		}

		return matchedPairs;
	}
}
