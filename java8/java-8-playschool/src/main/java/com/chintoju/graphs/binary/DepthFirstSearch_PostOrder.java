package com.chintoju.graphs.binary;

import java.util.LinkedList;

/**
 * Created by kishore.chintoju on 23/08/2015.
 */
public class DepthFirstSearch_PostOrder
{
	public static void main(String[] args)
	{
		BinaryNode<Integer> tree = BinaryTreeBuilder.buildBinarySearchTree();
		postOrder(tree);
	}

	private static void postOrder(BinaryNode<Integer> node)
	{
		if(node !=null)
		{
			postOrder(node.getLeft());
			postOrder(node.getRight());
			System.out.print(node.getData() +", ");
		}
	}
}
