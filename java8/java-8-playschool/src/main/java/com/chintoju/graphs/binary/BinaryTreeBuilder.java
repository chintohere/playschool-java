package com.chintoju.graphs.binary;

import com.chintoju.graphs.binary.BinaryNode;

/**
 * Created by kishore.chintoju on 23/08/2015.
 */
public class BinaryTreeBuilder
{
	public static BinaryNode<Integer> buildBinarySearchTree()
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
