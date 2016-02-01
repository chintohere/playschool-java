package com.chintoju.hackerrank;

/**
 * Created by kishore.chintoju on 30/01/2016.
 */
public class MinimumAbsoluteDifference
{
	public static void main(String[] args)
	{
		final double pow = Math.pow(2, 32);
		final double x = 2 * Math.pow(10, 5);
		final double pow1 = Math.pow(10, 14);
		System.out.println(pow);
		System.out.println(x);
		System.out.println(pow1);

		System.out.println(pow > x);
		System.out.println(pow > pow1);
	}
}
