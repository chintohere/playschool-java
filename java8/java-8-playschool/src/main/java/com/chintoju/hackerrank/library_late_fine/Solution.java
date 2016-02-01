package com.chintoju.hackerrank.library_late_fine;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import static java.util.Calendar.*;

/**
 * Created by kishore.chintoju on 30/01/2016.
 */
public class Solution
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);

		String actualDateString = console.nextLine();
		String expectedDateString = console.nextLine();

		System.err.println(actualDateString);
		System.err.println(expectedDateString);

		Calendar actualDate = convertToDate(actualDateString);
		Calendar expectedDate = convertToDate(expectedDateString);

		System.err.println(actualDate.getTime());
		System.err.println(expectedDate.getTime());

		int yearsDifference = actualDate.get(YEAR) - expectedDate.get(YEAR);
		int monthsDifference = (actualDate.get(MONTH)) - (expectedDate.get(MONTH));
		int datesDifference = actualDate.get(DATE) - expectedDate.get(DATE);

		System.err.println(actualDate.get(MONTH));
		System.err.println(expectedDate.get(MONTH));

		yearsDifference = yearsDifference > 0 ? yearsDifference : 0;
		monthsDifference = monthsDifference > 0 ? monthsDifference : 0;
		datesDifference = datesDifference > 0 ? datesDifference : 0;

		System.err.println("Days: " + datesDifference);
		System.err.println("Months: " + monthsDifference);
		System.err.println("Years: " + yearsDifference);

		if (yearsDifference > 0)
		{
			System.out.println(10000);
		}
		else if (monthsDifference > 0)
		{
			System.out.println(500 * monthsDifference);
		}
		else if (datesDifference > 0)
		{
			System.out.println(datesDifference * 15);
		}
		else
		{
			System.out.println(0);
		}

	}

	private static Calendar convertToDate(String actualDateString)
	{
		Scanner splitter = new Scanner(actualDateString);
		Calendar date = getInstance();

		date.set(DATE, splitter.nextInt());
		date.set(MONTH, splitter.nextInt() + 1);
		date.set(YEAR, splitter.nextInt());

		return date;
	}
}
