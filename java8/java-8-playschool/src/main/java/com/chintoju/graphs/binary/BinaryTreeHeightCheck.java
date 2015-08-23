package com.chintoju.graphs.binary;

/**
 * Created by kishore.chintoju on 23/08/2015.
 */
public class BinaryTreeHeightCheck
{
	public static void main(String[] args)
	{
		final BinaryNode<Integer> integerBinaryNode = BinaryTreeBuilder.buildBinarySearchTree();

		System.out.println(getHeight(integerBinaryNode));
	}

	private static int getHeight(BinaryNode<Integer> node)
	{
		if (node == null)
			return 0;

		return Math.max(getHeight(node.getLeft()), getHeight(node.getRight())) + 1;
	}
}
