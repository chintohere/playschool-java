package com.chintoju.sorting;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by kishore.chintoju on 26/08/2015.
 */
public class MergeSortWithLists
{
	public static void main(String[] args)
	{
		int[] test = new int[] { 10, 34, 31, 88 };
		mergesort(test);

		Arrays.stream(test).forEach(i -> System.out.print(i + " "));

	}

	static void mergesort(int[] array)
	{
		final int length = array.length;
		int[] helper = new int[length];
		for(int i=0;i<length;i++)helper[i]=array[i];

		mergesort(array, helper, 0, length - 1);
	}

	private static void mergesort(int[] array, int[] helper, int lo, int hi)
	{
		if (lo < hi)
		{
			int middle = (lo + hi) / 2;

			mergesort(array, helper, lo, middle);
			mergesort(array, helper, middle+1, hi);
			merge(array, helper, lo, middle, hi);
		}
	}

	private static void merge(int[] input, int[] temp, int lo, int middle, int hi)
	{
		print(input, temp, lo, hi);
//		IntStream.range(lo, hi).forEach(i -> temp[i] = input[i]);

		for(int i=lo;i<hi;i++)temp[i]=input[i];

		print(input, temp, lo, hi);

		int inputIndex = lo;

		int sortedIndex = lo;

		int tempIndex = middle + 1;

		while (inputIndex <= middle && tempIndex <= hi)
		{
			if (temp[inputIndex] <= temp[tempIndex])
			{
				input[sortedIndex] = temp[inputIndex];
				inputIndex++;
			}
			else
			{
				input[sortedIndex] = temp[tempIndex];
				tempIndex++;
			}

			sortedIndex++;
		}

		int remaining = middle - inputIndex;

		for(int x=0;x<remaining;x++)
			input[sortedIndex+x] = temp[inputIndex+x];
	}

	private static void print(int[] input, int[] temp, int lo, int hi)
	{
		IntStream.range(lo, hi).forEach(i -> System.out.print(input[i] + " "));
		System.out.println("\n");
		IntStream.range(lo, hi).forEach(i -> System.out.print(temp[i] + " "));
		System.out.println("\n");
	}

}
