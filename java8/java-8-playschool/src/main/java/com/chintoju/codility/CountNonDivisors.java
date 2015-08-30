package com.chintoju.codility;

// you can also use imports, for example:

import java.io.PrintStream;
import java.util.Arrays;
import java.util.stream.IntStream;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class CountNonDivisors
{
	static PrintStream err = System.err;

	public int[] solution(int[] A)
	{
		// write your code in Java SE 8
		final long l = System.currentTimeMillis();
		final int[] ints = Arrays.stream(A).map(x -> countOfNonDiv(x, A)).toArray();
		err.print(System.currentTimeMillis() - l);
		return ints;
	}

	private int countOfNonDiv(int x, int[] a)
	{
		//		err.println(x);

		return (int) IntStream.range(0, a.length).filter(i -> isNotDivisible(x, a[i])).count();
	}

	public static boolean isNotDivisible(int x, int element)
	{

		if (x == element)
			return false;

		if (element == 0 | x < element || x % element != 0)
		{
			return true;
		}

		return false;
	}
}
