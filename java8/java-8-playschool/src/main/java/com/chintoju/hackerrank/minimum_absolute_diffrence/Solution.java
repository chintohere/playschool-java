package com.chintoju.hackerrank.minimum_absolute_diffrence;

import java.io.*;
import java.util.*;

public class Solution
{

	public static void main(String[] args)
	{

		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		ArrayList<Integer> input = new ArrayList<>();
		TreeMap<Integer, ArrayList<Integer>> differencesMap = new TreeMap<Integer, ArrayList<Integer>>();


		Scanner scanner = new Scanner(System.in);

//		System.err.println("reading now");

		Long size = Long.valueOf(scanner.nextLine());

//		System.err.println("size "+ size);

		//check if we have any elements
		if (size <= 0)
		{
//			System.err.println("no lines");
			return;
		}

		scanner.hasNextLine();

		final String inputString = scanner.nextLine();
//		System.err.println(inputString);


		Scanner splitter = new Scanner(inputString);

		//read input
		while (splitter.hasNext())
		{
			input.add(splitter.nextInt());
		}

		for (int i = 0; i < input.size() - 1; i++)
		{
			int a = input.get(i);
//			System.err.println("--------------");

			for (int j = i + 1; j < input.size(); j++)
			{
				int b = input.get(j);
				int difference = Math.abs(a - b);

				//				System.err.println("["+a+"] - [" + b +"] = [" + difference + "]");

				final ArrayList<Integer> operands = differencesMap.containsKey(difference) ? differencesMap.get(difference) : new ArrayList<>();

				operands.add(a);
				operands.add(b);

				differencesMap.put(difference, operands);
			}
		}

		//print
		final Iterator<Integer> differencesIterator = differencesMap.keySet().iterator();
		if (differencesIterator.hasNext())
		{
			final Integer minimumAbsDifference = differencesIterator.next();
			final ArrayList<Integer> operands = differencesMap.get(minimumAbsDifference);

			TreeSet<Integer> sortedOperands = new TreeSet<>(operands);
			sortedOperands.forEach(x -> System.out.print(x + " "));
		}

	}
}

