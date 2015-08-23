package com.chintoju.graphs.binary;

import java.util.Arrays;
import java.util.Optional;

/**
 * Created by kishore.chintoju on 22/08/2015.
 */
public class BinaryNode<T extends Comparable>
{
	private T data;

	private BinaryNode<T> parent;

	private BinaryNode<T> left;

	private BinaryNode<T> right;

	private boolean visited;

	public BinaryNode()
	{
	}

	public BinaryNode(T data)
	{
		this.data = data;
	}

	public BinaryNode(T data, BinaryNode<T> parent)
	{
		this.data = data;
		this.parent = parent;
	}

	public BinaryNode(T data, T leftData, T rightData)
	{
		this(data, new BinaryNode<T>(leftData), new BinaryNode<T>(rightData));
	}

	public BinaryNode(T data, BinaryNode<T> left, BinaryNode<T> right)
	{
		this.data = data;
		this.left = left;
		left.attachToParent(this);
		this.right = right;
		right.attachToParent(this);
	}

	public T getData()
	{
		return data;
	}

	public void setData(T data)
	{
		this.data = data;
	}

	public boolean isVisited()
	{
		return visited;
	}

	public void setVisited(boolean visited)
	{
		this.visited = visited;
	}

	public BinaryNode<T> getLeft()
	{
		return left;
	}

	public void setLeft(BinaryNode<T> left)
	{
		this.left = left;
		if(left !=null)
		left.setParent(this);
	}

	public BinaryNode<T> getRight()
	{
		return right;
	}

	public void setRight(BinaryNode<T> right)
	{
		this.right = right;
		if (right != null)
			right.setParent(this);
	}

	public BinaryNode<T> getParent()
	{
		return parent;
	}

	public void setParent(BinaryNode<T> parent)
	{
		this.parent = parent;
	}

	public void visit()
	{
		setVisited(true);
	}

	public void attachToParent(BinaryNode<T> parent)
	{
		this.setParent(parent);
	}

	public static <X extends Comparable> void appendChildren(BinaryNode<X> parent, BinaryNode<X> left, BinaryNode<X> right)
	{
		parent.setLeft(left);
		parent.setRight(right);
	}

	public void appendChildrenToLeft(BinaryNode<T> leftNode, BinaryNode<T> rightNode)
	{
		appendChildren(getLeft(), leftNode, rightNode);
	}

	public void appendChildrenToRight(BinaryNode<T> leftNode, BinaryNode<T> rightNode)
	{
		appendChildren(getRight(), leftNode, rightNode);
	}

	//	public void append(BinaryNode<T> node)
	//	{
	//		final BinaryNode<T> binaryNode = Optional.of(node);
	//		if (getLeft() !=null)
	//		{
	//			setLeft(binaryNode);
	//		}
	//		else if (!getRight().isPresent())
	//		{
	//			setRight(binaryNode);
	//		}
	//		else if (getLeft().get().getData().compareTo(node.getData()) < 0)
	//		{
	//			getRight().get().append(node);
	//		}
	//		else
	//		{
	//			getLeft().get().append(node);
	//		}
	//
	//	}

	public boolean hasChildren()
	{
		return left != null || right != null;
	}

	public boolean hasParent()
	{
		return parent != null;
	}

	@Override
	public String toString()
	{
		final StringBuilder sb =
						new StringBuilder("--").append(data).append("--").append("\n");
		sb.append("-/-").append("\\-\n");
		sb.append(left != null ? left.getData().toString() : "[]");
		sb.append("--");
		sb.append(right != null ? right.getData().toString() : "[]").append("\n");
		return sb.toString();
	}
}
