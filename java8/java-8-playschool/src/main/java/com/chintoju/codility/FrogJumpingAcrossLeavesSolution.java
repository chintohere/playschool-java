package com.chintoju.codility;

// you can also use imports, for example:

import java.util.*;
import java.util.stream.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class FrogJumpingAcrossLeavesSolution
{
	public int solution(int X, int[] A)
	{
		// write your code in Java SE 8

		if (A == null || A.length <= 0)
			return -1;

		//find second
		int second = findSecond(X,A);
		if(second < 0) return second;

		//check if all leaves before are there
		if(!hasPath(X, A)) return  -1;

		return findMaxSecond(X,A);
	}

	public int findSecond(int x, int[] leaves)
	{
		OptionalInt second = IntStream.range(0, leaves.length).filter(sec -> leaves[sec] == x).findAny();
		return second.isPresent() ? second.getAsInt() : -1;
	}

	public boolean hasPath(int x, int[] leaves)
	{
		return IntStream.range(1,x+1).allMatch(leafPosition -> findSecond(leafPosition, leaves) >= 0);
	}

	public int findMaxSecond(int x, int[] leaves)
	{
		final Set<Integer> uniqueLeaves = IntStream.range(1, x + 1).boxed().collect(Collectors.toSet());

		int second = -1;
		for(int i=0;i<leaves.length ;i++)
		{
			final int leaf = leaves[i];
			if(uniqueLeaves.contains(leaf) && leaf <= x && i > second)
			{
				second = i;
				uniqueLeaves.remove(leaf);
			}

			if(uniqueLeaves.isEmpty())
			{
				return second;
			}
		}

		return second;
	}

}
