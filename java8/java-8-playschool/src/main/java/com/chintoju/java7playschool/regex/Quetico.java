package com.chintoju.java7playschool.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kishore.chintoju on 15/08/2015.
 */
public class Quetico
{
	public static void main(String[] args)
	{
		final Pattern compile = Pattern.compile("\\B");
		final Matcher matcher = compile.matcher("^23 *$76 bc");
		while (matcher.find())
			System.out.print(matcher.start());

	}
}
