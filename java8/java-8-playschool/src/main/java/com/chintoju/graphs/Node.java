package com.chintoju.graphs;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by kishore.chintoju on 22/08/2015.
 */
public class Node<T extends Comparable>
{
	private T data;

	private Node<T> parent;

	private LinkedList<Node<T>> children = new LinkedList<>();

	private boolean visited;

	public Node()
	{
	}

	public Node(T data)
	{
		this.data = data;
	}

	public Node(T data, Node<T> parent)
	{
		this.data = data;
		this.parent = parent;
	}

	public Node(T data, Node<T> parent, T... childData)
	{
		this(data, parent);

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

	public Node<T> getParent()
	{
		return parent;
	}

	public void setParent(Node<T> parent)
	{
		this.parent = parent;
	}

	public void visit()
	{
		setVisited(true);
	}

	public void attachToParent(Node<T> parent)
	{
		this.setParent(parent);
	}

	public LinkedList<Node<T>> getChildren()
	{
		return children;
	}

	public void setChildren(LinkedList<Node<T>> children)
	{
		this.children = children;
	}

	public boolean hasChildren()
	{
		return !children.isEmpty();
	}

	public boolean hasParent()
	{
		return parent != null;
	}

	@Override
	public String toString()
	{
		final StringBuilder sb = new StringBuilder("Node{");
		sb.append("parent=").append(parent);
		sb.append(", data=").append(data);
		sb.append(", children=").append(children);
		sb.append(", visited=").append(visited);
		sb.append('}');
		return sb.toString();
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
			return true;
		if (!(o instanceof Node))
			return false;

		Node<?> that = (Node<?>) o;

		return !(data != null ? !data.equals(that.data) : that.data != null);

	}

	@Override
	public int hashCode()
	{
		return data != null ? data.hashCode() : 0;
	}
}
