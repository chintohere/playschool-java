package com.chintoju.sorting;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class QuickSortLomutoPartition
{

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		if(size <= 1)
		{
			System.out.println(sc.nextLine());
			return;
		}

		ArrayList<Integer> input = new ArrayList<>(size);

		IntStream.range(0,size).forEach(x -> input.add(sc.nextInt()));

		System.err.println(input);


		//pivot position
		int i = 0;
		int lastIndex = size -1;

		quicksort(input,i,lastIndex);

	}

	static void quicksort(List<Integer> input, int i, int j)
	{
		if(i>=j) return;

		int p = partition(input, i, j);
		quicksort(input, i , p-1);
		quicksort(input, p+1, j);

		print(input);
	}

	static int partition(List<Integer> input, int lo, int hi)
	{
		int pivot = input.get(hi);

		int i = lo;

		for(int j=lo;j < hi; j++)
		{
			if(input.get(j) < pivot)
			{
				swap(input, j, i);
				i++;
			}
		}

		swap(input, i, hi);
		return i;
	}

	static void swap(List<Integer> input, int x, int y)
	{
		int temp = input.get(x);
		input.set(x,input.get(y));
		input.set(y,temp);
	}

	static void print(List<Integer> input)
	{
		input.forEach(x -> System.out.print(x +" "));
		System.out.println("");
	}
}