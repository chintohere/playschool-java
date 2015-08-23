package com.chintoju.graphs.binary;

import java.util.LinkedList;

/**
 * Created by kishore.chintoju on 23/08/2015.
 */
public class DepthFirstSearch_InOrder
{
	public static void main(String[] args)
	{
		BinaryNode<Integer> tree = BinaryTreeBuilder.buildBinarySearchTree();
		inOrder(tree);
	}

	private static void inOrder(BinaryNode<Integer> node)
	{
		if(node !=null)
		{
			inOrder(node.getLeft());
			System.out.print(node.getData() + ", ");
			inOrder(node.getRight());
		}
	}
}
