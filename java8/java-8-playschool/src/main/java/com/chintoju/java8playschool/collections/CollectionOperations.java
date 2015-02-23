package com.chintoju.java8playschool.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by kishore.chintoju on 22/02/15.
 */
public class CollectionOperations
{
	public static void main(String[] args)
	{
		final List<String> bigList = Arrays.asList("First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth", "Tenth");

		List<String> smallList = Arrays.asList("Sixth", "Seventh");

		System.out.println(Collections.indexOfSubList(bigList, smallList));
	}
}
