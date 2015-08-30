package com.chintoju.graphs.binary;

import java.util.LinkedList;

/**
 * Created by kishore.chintoju on 23/08/2015.
 */
public class BreadthFirstSearch_LevelOrder
{
	private static LinkedList<BinaryNode<Integer>> queue;

	public static void main(String[] args)
	{
		BinaryNode<Integer> tree = BinaryTreeBuilder.buildBinarySearchTree();
		levelOrder(tree);
	}

	private static void levelOrder(BinaryNode<Integer> node)
	{
		queue = new LinkedList<>();
		queue.add(node);

		while (!queue.isEmpty())
		{
			final BinaryNode<Integer> binaryNode = queue.pop();
			System.out.print(binaryNode.getData() + ", ");
			if (binaryNode.getLeft() != null)
				queue.add(binaryNode.getLeft());
			if (binaryNode.getRight() != null)
				queue.add(binaryNode.getRight());
		}
	}
}
