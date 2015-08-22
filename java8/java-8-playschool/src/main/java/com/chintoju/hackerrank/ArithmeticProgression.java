package com.chintoju.hackerrank;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by kishore.chintoju on 21/08/2015.
 */
public class ArithmeticProgression
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		int count = scanner.nextInt();

		String numbersString = scanner.nextLine();
		final List<Integer> numbers = Arrays.asList(numbersString.split(" ")).stream().filter(s -> !s.isEmpty())
						.mapToInt(s -> Integer.parseInt(s))
						.boxed()
						.collect(Collectors.toList());

		Map<Integer, Integer> differenceMap = new HashMap<Integer, Integer>();
		List<Integer> differenceList = new ArrayList<>();

		for (int i = 0; i < numbers.size() - 1; i++)
		{
			int difference = numbers.get(i+1) - numbers.get(i);
			differenceList.add(i, difference);
			int size = differenceMap.containsKey(difference) ? differenceMap.get(difference) : 0;
			differenceMap.put(difference, size + 1);
		}

		Integer oddDifference = differenceMap.entrySet().stream().filter(e -> e.getValue() == 1).findFirst().get().getKey();
		Integer standardDifference = differenceMap.entrySet().stream().filter(e -> e.getValue() > 1).findFirst().get().getKey();

		System.out.println(oddDifference);
		System.out.println(standardDifference);
		Integer oddDifferenceIndex = differenceList.indexOf(oddDifference);

		System.out.println(numbers.get(oddDifferenceIndex) + standardDifference);

	}
}
