package com.chintoju.hackerrank.binary_tree_level_order;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by kishore.chintoju on 30/01/2016.
 */
public class Solution
{
	static void levelOrder(Node root)
	{
		//Write your code here

		Queue<Integer> queue = new LinkedList<>();

		Node current = root;

		while (current != null)
		{
			queue.add(current.data);
			System.err.println(current.data);

			if(current.left !=null)
			{
				current = current.left;
			}
			else if(current.right !=null)
			{
				current = current.right;
			}
			else
			{
				current = null;
			}
		}

		queue.stream().forEach(i -> System.out.print(i));

	}

	public static Node insert(Node root, int data)
	{
		if (root == null)
		{
			return new Node(data);
		}
		else
		{
			Node cur;
			if (data <= root.data)
			{
				cur = insert(root.left, data);
				root.left = cur;
			}
			else
			{
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0)
		{
			int data = sc.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
	}
}
