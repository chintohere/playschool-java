package com.chintoju.hackerrank.print_stairs;

/**
 *
 * Print stairs like below
 *
 * 6
 *      #
 *     ##
 *    ###
 *   ####
 *  #####
 * ######
 *
 * Last row has no leading spaces
 *
 * Created by kishore.chintoju on 31/01/2016.
 */
public class Solution
{
	static void StairCase(int n)
	{
		if (n < 1)
		{
			return;
		}

		for (int i = 1; i <= n+1; i++)
		{
			printStairs(n - i, i);
		}

	}

	static void printStairs(int spaces, int stairs)
	{
		StringBuilder levelBuilder = new StringBuilder();

		for (int x = 0; x < spaces; x++)
		{
			levelBuilder.append(' ');
		}

		for (int x = 0; x < stairs; x++)
		{
			levelBuilder.append('#');
		}

		final String level = levelBuilder.toString();
		if (level.length() > 0)
			System.out.println(level);
	}

}
