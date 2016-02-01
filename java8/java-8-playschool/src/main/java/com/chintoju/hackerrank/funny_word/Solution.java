package com.chintoju.hackerrank.funny_word;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by kishore.chintoju on 30/01/2016.
 */
public class Solution
{

	public static final String NOT_FUNNY = "Not Funny";
	public static final String FUNNY = "Funny";

	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);

		final int jokesLength = console.nextInt();
		console.nextLine();

		for (int i = 0; i < jokesLength; i++)
			checkFunnybone(console.nextLine());
	}

	public static void checkFunnybone(String joke)
	{
		System.err.println("checking : " + joke);

		if (joke == null || joke.length() < 2)
		{
			System.out.println(NOT_FUNNY);
			return;
		}

		final int length = joke.length();
		final char[] jokeChars = joke.toCharArray();

		for (int i = 1, j = length - 1; i < length && j > 1; i++, j--)
		{
			//check forward direction
			int a = jokeChars[i];
			int b = jokeChars[i - 1];

			int diffA = Math.abs(a - b);

			//check reverse direction
			int x = jokeChars[j - 1];
			int y = jokeChars[j];

			int diffB = Math.abs(x - y);

			System.err.println("diffA[" + (char) a + "-" + (char) b + " = " + diffA + "], diffB ["+ (char) x + "-" + (char) y + " = " + + diffB + "]");

			if (diffA != diffB)
			{
				System.out.println(NOT_FUNNY);
				return;
			}
		}

		System.out.println(FUNNY);

	}
}
