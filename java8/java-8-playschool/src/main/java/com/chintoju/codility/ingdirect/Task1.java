package com.chintoju.codility.ingdirect;

import java.io.PrintStream;
import java.util.*;
import java.util.stream.*;

/**
 * Performance improvement. Failed. 0%.
 */
public class Task1
{
	static PrintStream err = System.err;

	int solution(int[] A)
	{
		HashSet<Integer> numbers = new HashSet<>();

		long l = System.currentTimeMillis();
		final Runtime runtime = Runtime.getRuntime();
		final long freeMemory = runtime.freeMemory();

		int N = A.length;
		int result = 0;

		IntStream.range(0, A.length).forEach(i -> numbers.add(A[i]));

		if (A.length != numbers.size())
			return result;

		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < N; j++)
			{
				if (A[i] == A[j])
				{
					result = Math.max(result, Math.abs(i - j));
				}
			}
		}

		err.printf("Time took %d. Memory Used %d. Result %d \n", System.currentTimeMillis() - l, freeMemory - runtime.freeMemory(), result);
		return result;
	}
}