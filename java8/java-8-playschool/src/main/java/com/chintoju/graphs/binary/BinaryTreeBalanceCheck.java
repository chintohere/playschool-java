package com.chintoju.graphs.binary;

/**
 * Check the balance of the binary tree using Breadth First Search
 * <p/>
 * Created by kishore.chintoju on 22/08/2015.
 */
public class BinaryTreeBalanceCheck
{
	public static void main(String[] args)
	{
		BinaryNode<Integer> tree = BinaryTreeBuilder.buildBinarySearchTree();

		System.out.println(isBalancedNode(tree));

	}

	private static boolean isBalancedNode(BinaryNode<Integer> node)
	{
		if (node == null)
			return true;

		int heightDifference = getHeight(node.getLeft()) - getHeight(node.getRight());

		System.err.println(heightDifference);
		if (heightDifference > 0)
		{
			return false;
		}
		else
		{
			return isBalancedNode(node.getLeft())&& isBalancedNode(node.getRight());
		}

	}

	private static int getHeight(BinaryNode<Integer> node)
	{
		if(node == null) return 0;

		System.err.println("at node " + node.getData());
		final int i = Math.max(getHeight(node.getLeft()), getHeight(node.getRight())) + 1;
		System.err.println("Height:" + i);
		return i;
	}

}
