package com.chintoju.java7playschool.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kishore.chintoju on 15/08/2015.
 */
public class NumRegex
{
	public static void main(String[] args)
	{
		final Pattern compile = Pattern.compile("\\d*");
		final Matcher matcher = compile.matcher("ab34ef");
		while (matcher.find())
		{
			System.out.println(matcher.start());
			System.out.println(matcher.group());
		}

	}
}
