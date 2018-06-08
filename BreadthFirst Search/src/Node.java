import java.util.ArrayList;

public class Node 
{
	String name;
	ArrayList<Node> children;
	
	public Node(String name, ArrayList<Node> children)
	{
		this.name = name;
		this.children = children;
	}
	
	public ArrayList<Node> getChildren() 
	{
		return children;
	}

	public void setChildren(ArrayList<Node> children) 
	{
		this.children = children;
	}

	public boolean removeChild(Node n)
	{
		return false;
	}

	public String toString() 
	{
		return name;
	}	
	
}
