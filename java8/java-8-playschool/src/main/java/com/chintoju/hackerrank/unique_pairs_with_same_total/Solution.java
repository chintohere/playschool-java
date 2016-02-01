package com.chintoju.hackerrank.unique_pairs_with_same_total;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by kishore.chintoju on 31/01/2016.
 */
public class Solution
{
	/*
 * Complete the function below.
 */

	public static void main(String[] args)
	{
		NumberOfPairs(new int[] {}, 5);
	}

	static int NumberOfPairs(int[] a, long k)
	{
		Set<String> unique = new TreeSet<>();

		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				//dont add same numbers
				if (i == j)
					continue;

				if (matches(a[i], a[j], k))
				{
					add(a[i], a[j], unique);
				}
			}
		}

		return unique.size();
	}

	private static void add(int i, int j, Set<String> unique)
	{
		unique.add(i < j ? "" + i + j : "" + j + i);
	}

	static boolean matches(int a, int b, long total)
	{
		return total == a + b;
	}

}
