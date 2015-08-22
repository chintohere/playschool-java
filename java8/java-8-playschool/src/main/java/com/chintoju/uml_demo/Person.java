package com.chintoju.uml_demo;

/**
 * Created by kishore.chintoju on 17/08/2015.
 */
public class Person
{
	private String firstName;

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public void test()
	{
		String fName = getFirstName();
		setFirstName("Rohith");
	}

	public static void main(String[] args)
	{
		Person p = new Person();
		p.setFirstName("Rohith");

		System.out.println(p.getFirstName());
	}
}
