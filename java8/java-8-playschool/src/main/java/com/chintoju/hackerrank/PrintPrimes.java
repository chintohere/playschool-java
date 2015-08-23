package com.chintoju.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by kishore.chintoju on 22/08/2015.
 */
public class PrintPrimes
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int max = Integer.parseInt(reader.readLine());

		ArrayList<Boolean> primary = new ArrayList<>();

		IntStream.range(0, max).forEach(x -> primary.add(true));
		IntStream.range(0, 2).forEach(x -> primary.set(x, false));

		for (int prime = 2; prime < Math.sqrt(max); prime = getNextPrime(primary, prime))
		{
			checkForComposits(primary, prime);
		}

		IntStream.range(0, primary.size()).filter(x -> primary.get(x)).forEach(y -> System.out.println(y));
	}

	private static void checkForComposits(ArrayList<Boolean> primary, int prime)
	{
		for (int x = prime * prime; x < primary.size(); x += prime)
		{
			primary.set(x, false);
		}
	}

	private static int getNextPrime(ArrayList<Boolean> primary, int prime)
	{
		prime++;
		for (; prime < primary.size(); ++prime)
		{
			if (primary.get(prime))
			{
				return prime;
			}
		}
		return prime;
	}
}
