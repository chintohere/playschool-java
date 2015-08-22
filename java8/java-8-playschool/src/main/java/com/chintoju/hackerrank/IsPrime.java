package com.chintoju.hackerrank;

import java.io.Console;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by kishore.chintoju on 22/08/2015.
 */
public class IsPrime
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number");
		String input = scanner.nextLine();

		final int inputAsInt = Integer.parseInt(input);

		System.out.printf("Prime %s", isPrime(inputAsInt));
	}

	private static boolean isPrime(int inputAsInt)
	{
		if (inputAsInt < 2)
		{
			return false;
		}

		int intRoot = (int) Math.sqrt(inputAsInt);

		return !(IntStream.range(2, intRoot + 1).filter(x -> inputAsInt % x == 0).findAny().isPresent());
	}
}
