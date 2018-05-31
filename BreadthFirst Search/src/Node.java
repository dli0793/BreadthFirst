
import java.util.ArrayList;

public class Node 
{
	int posX;
	int posY;
	ArrayList<Node> children;
	Node parent;
	
	public Node(int posX, int posY, ArrayList<Node> children, Node parent)
	{
		this.posX = posX;
		this.posY = posY;
		this.children = children;
		this.parent = parent;
	}
	
	
	public ArrayList<Node> getChildren()
	{
		ArrayList<Node> childNodes = new ArrayList<>();
		Node topNode = new Node(posX,posY+1,children,parent);
		Node bottomNode = new Node(posX,posY-1,children,parent);
		Node leftNode = new Node(posX-1,posY,children,parent);
		Node rightNode = new Node(posX+1,posY,children,parent);
		Node nwNode = new Node(posX-1,posY+1,children,parent);
		Node neNode = new Node(posX+1,posY+1,children,parent);
		Node swNode
	}
	
}
