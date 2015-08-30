package com.chintoju.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kishore.chintoju on 26/08/2015.
 */
public class MergeSort
{
	public static void main(String[] args)
	{
		Integer[] test = new Integer[] { 10, 34, 1, 31, 88 };
		List<Integer> integerList = new ArrayList<>();
		integerList.addAll(Arrays.asList(test));

		integerList = mergesort(integerList);

		integerList.forEach(i -> System.out.print(i + " "));

	}

	private static List<Integer> mergesort(List<Integer> array)
	{
		if (array.size() <= 1)
			return array;

		int lo = 0;
		int hi = array.size() - 1;
		int middle = (lo + hi) / 2;

		List<Integer> left = array.subList(lo, middle);
		List<Integer> right = array.subList(middle + 1, hi);

		left = mergesort(left);
		right = mergesort(right);

		return merge(left, right);
	}

	private static List<Integer> merge(List<Integer> left, List<Integer> right)
	{
		List<Integer> result = new ArrayList<>();


		while (!left.isEmpty() && !right.isEmpty())
		{
			if (left.get(0) <= right.get(0))
			{
				result.add(left.get(0));
				left = left.subList(1, left.size()-1);
			}
			else
			{
				result.add(right.get(0));
				right = right.subList(1, right.size()-1);
			}
		}

		result.addAll(left);
		result.addAll(right);

		return result;
	}

	private static void print(int[] input, int[] temp)
	{
		Arrays.stream(input).forEach(i -> System.out.print(i + " "));
		System.out.println("\n");
		Arrays.stream(temp).forEach(i -> System.out.print(i + " "));
		System.out.println("\n");
	}

}
