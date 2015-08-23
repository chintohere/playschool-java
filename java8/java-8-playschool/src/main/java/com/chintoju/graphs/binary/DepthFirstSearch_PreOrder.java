package com.chintoju.graphs.binary;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by kishore.chintoju on 23/08/2015.
 */
public class DepthFirstSearch_PreOrder
{
	public static void main(String[] args)
	{
		BinaryNode<Integer> tree = BinaryTreeBuilder.buildBinarySearchTree();
		preOrder(tree);
	}

	private static void preOrder(BinaryNode<Integer> node)
	{
		if(node !=null)
		{
			System.out.print(node.getData()+ ", ");
			preOrder(node.getLeft());
			preOrder(node.getRight());
		}
	}
}
