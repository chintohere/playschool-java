package com.chintoju.graphs.binary;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * Created by kishore.chintoju on 23/08/2015.
 */
public class BinaryTreeHeightCheck
{
	public static void main(String[] args)
	{
		final BinaryNode<Integer> integerBinaryNode = BinaryTreeBuilder.buildBinarySearchTree();

		System.out.println(getHeight(integerBinaryNode));
		System.out.println(getHeightByIterator(integerBinaryNode));
	}

	private static int getHeight(BinaryNode<Integer> node)
	{
		if (node == null)
			return 0;

		return Math.max(getHeight(node.getLeft()), getHeight(node.getRight())) + 1;
	}

	public static <T extends Comparable> int getHeightByIterator(BinaryNode<T> node)
	{
		if (node == null)
			return 0;

		int height = 0;

		LinkedList<BinaryNode<T>> queue = new LinkedList<>();
		queue.add(node);

		Set<BinaryNode<T>> levelNodes = new HashSet<>();

		while (!queue.isEmpty())
		{
			final BinaryNode<T> pop = queue.pop();

			if (pop.hasChildren())
			{
				height++;
			}

			if (pop.getLeft() != null)
			{
				queue.add(pop.getLeft());
			}
			if (pop.getRight() != null)
			{
				queue.add(pop.getRight());
			}
		}

		return height;
	}
}
