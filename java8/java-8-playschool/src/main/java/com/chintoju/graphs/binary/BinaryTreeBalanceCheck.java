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
		BinaryNode<Integer> tree = buildBinarySearchTree();

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

		System.err.println("at node "+ node.getData());
		final int i = Math.max(getHeight(node.getLeft()), getHeight(node.getRight())) + 1;
		System.err.println("Height:"+ i);
		return i;
	}

	private static BinaryNode<Integer> buildBinarySearchTree()
	{
		Integer x = null;
		Integer y = null;
		BinaryNode<Integer> tree1 = new BinaryNode<>(1, 2, 3);
		BinaryNode<Integer> tree2 = new BinaryNode<>(4, 5, 6);
		BinaryNode<Integer> tree3 = new BinaryNode<>(7, 8, 9);
		BinaryNode<Integer> tree4 = new BinaryNode<>(10, 11, 12);
		BinaryNode<Integer> tree5 = new BinaryNode<>(13, 14, 15);


		tree1.appendChildrenToLeft(tree2, tree3);
		tree1.appendChildrenToRight(tree4, tree5);

		//tree1 3 is 1 less.
		return tree1;
	}
}
