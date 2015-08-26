package com.chintoju.numbers;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by kishore.chintoju on 26/08/2015.
 */
public class Fibonacci
{
	static HashMap<BigInteger, BigInteger> cache = new HashMap<>();

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		final int i = scanner.nextInt();
		System.out.println(fibonacci(BigInteger.valueOf(i)));
	}

	static BigInteger fibonacci(BigInteger i)
	{
		if (BigInteger.ZERO.equals(i) || BigInteger.ONE.equals(i))
			return i;

		if (cache.containsKey(i))
			return cache.get(i);

		BigInteger prev = i.subtract(BigInteger.ONE);
		BigInteger prevBefore = prev.subtract(BigInteger.ONE);
		assert prevBefore.compareTo(prev) < 0;

		final BigInteger result = fibonacci(prevBefore).add(fibonacci(prev));

		cache.put(i, result);
		return result;

	}
}
