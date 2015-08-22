package com.chintoju.java7playschool.regex;

/**
 * Created by kishore.chintoju on 15/08/2015.
 */
public class Banana
{
	public static void main(String[] args)
	{
		String in = "1 a2 b 3 c4d 5e";
		System.out.println(in.split(" ").length);
		final String[] split = in.split("\\d");
		for (String s : split)
		{
			System.out.println(s);
		}
		System.out.println(split.length);
	}
}
