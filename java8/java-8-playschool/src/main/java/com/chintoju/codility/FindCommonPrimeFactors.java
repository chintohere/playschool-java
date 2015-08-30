package com.chintoju.codility;// you can also use imports, for example:

import java.io.PrintStream;

/**
 * A prime is a positive integer X that has exactly two distinct divisors: 1 and X. The first few prime integers are 2, 3, 5, 7, 11 and 13.

 A prime D is called a prime divisor of a positive integer P if there exists a positive integer K such that D * K = P. For example, 2 and 5 are prime divisors of 20.

 You are given two positive integers N and M. The goal is to check whether the sets of prime divisors of integers N and M are exactly the same.

 For example, given:

 N = 15 and M = 75, the prime divisors are the same: {3, 5};
 N = 10 and M = 30, the prime divisors aren't the same: {2, 5} is not equal to {2, 3, 5};
 N = 9 and M = 5, the prime divisors aren't the same: {3} is not equal to {5}.
 Write a function:

 class Solution { public int solution(int[] A, int[] B); }

 that, given two non-empty zero-indexed arrays A and B of Z integers, returns the number of positions K for which the prime divisors of A[K] and B[K] are exactly the same.

 For example, given:

 A[0] = 15   B[0] = 75
 A[1] = 10   B[1] = 30
 A[2] = 3    B[2] = 5
 the function should return 1, because only one pair (15, 75) has the same set of prime divisors.

 Assume that:

 Z is an integer within the range [1..6,000];
 each element of arrays A, B is an integer within the range [1..2,147,483,647].
 Complexity:

 expected worst-case time complexity is O(Z*log(max(A)+max(B))2);
 expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
 Elements of input arrays can be modified.

 Copyright 2009–2015 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
 */

import java.io.*;
import java.util.*;
import java.io.*;
import java.util.stream.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class FindCommonPrimeFactors
{
	private TreeSet<Integer> primesCache = new TreeSet<>();

	public int solution(int[] A, int[] B)
	{
		long startTime = System.currentTimeMillis();

		// write your code in Java SE 8

		if (A == null || B == null || A.length == 0 || B.length == 0)
			return 0;

		PrintStream err = System.err;
		int count = 0;

		for (int i = 0; i < A.length; i++)
		{
			err.println("Start " + i);

			final int gcd = gcd(A[i], B[i]);

			err.println("GCD:" + gcd);

			if (gcd < 2)
				continue;

			int[] primes = getPrimes(gcd);

			Arrays.stream(primes).forEach(p -> primesCache.add(p));

			Arrays.stream(primes).forEach(x -> err.print(x + " ,"));
			err.println("");

			//find prime factors for each
			final HashSet<Integer> primeFactorsA = findPrimeFactors(A[i], primes);
			final HashSet<Integer> primeFactorsB = findPrimeFactors(B[i], primes);

			if (primeFactorsA.equals(primeFactorsB))
				count++;

			err.println(primeFactorsA);
			err.println(primeFactorsB);

			err.println("\nEnd: " + i);
		}


		long endTime= System.currentTimeMillis();
		err.println(endTime - startTime);

		return count;
	}

	public HashSet<Integer> findPrimeFactors(int number, int[] primes)
	{
		HashSet<Integer> primeFactors = new HashSet<>();

		int numOriginal = number;

		for (int i = 0; i < primes.length; i++)
		{
			final int prime = primes[i];
			if (number % prime == 0)
			{
				primeFactors.add(prime);

				number /= prime;
			}
		}
		return primeFactors;
	}

	public int gcd(int a, int b)
	{
		if (a % b == 0)
		{
			return b;
		}
		else
			return gcd(b, a % b);
	}

	public int[] getPrimes(int max)
	{
		return IntStream.range(2, max + 1).filter(x -> isPrime(x)).toArray();
	}

	public boolean isPrime(int x)
	{
		if (x < 2)
		{
			return false;
		}

		if (primesCache.contains(x))
			return true;

		int root = (int) Math.sqrt(x);

		return !IntStream.range(2, root + 1).filter(i -> x % i == 0).findAny().isPresent();
	}

}