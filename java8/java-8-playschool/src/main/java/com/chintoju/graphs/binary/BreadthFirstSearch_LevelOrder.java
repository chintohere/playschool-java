package com.chintoju.graphs.binary;

import java.util.LinkedList;

/**
 * Created by kishore.chintoju on 23/08/2015.
 */
public class BreadthFirstSearch_LevelOrder
{
	private static LinkedList<BinaryNode<Integer>> depth;
	private static int maxHeight = 0;

	public static void main(String[] args)
	{
		maxHeight = 0;
		BinaryNode<Integer> tree = BinaryTreeBuilder.buildBinarySearchTree();
		levelOrder(tree);
		System.out.println("\nHeight: "+maxHeight);
	}

	private static void levelOrder(BinaryNode<Integer> node)
	{
		depth = new LinkedList<>();
		depth.add(node);
		if (depth.size() > 0)
			maxHeight++;

		while (!depth.isEmpty())
		{
			maxHeight++;
			final BinaryNode<Integer> binaryNode = depth.pop();
			System.out.print(binaryNode.getData()+", ");
			if (binaryNode.getLeft() != null)
				depth.add(binaryNode.getLeft());
			if (binaryNode.getRight() != null)
				depth.add(binaryNode.getRight());
		}
	}
}
