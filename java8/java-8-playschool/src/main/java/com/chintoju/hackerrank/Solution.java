package com.chintoju.hackerrank;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Solution {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		System.err.println("Test Cases:" + t);
		for(int i=0;i<t;i++)
		{
			int numberOfNodes = scanner.nextInt();
			int numberOfEdges = scanner.nextInt();
			System.err.println("Nodes:" + numberOfNodes);
			System.err.println("Edges:" + numberOfEdges);

			ArrayList<Node> graph = new ArrayList<Node>();
			IntStream.range(0, numberOfNodes).forEach(x -> graph.add(new Node(x,x)));





		}



	}

	static class Node
	{
		public Integer value;
		public Integer index;

		public Node(Integer value, Integer index)
		{
			this.value = value;
			this.index = index;
		}
	}
}
