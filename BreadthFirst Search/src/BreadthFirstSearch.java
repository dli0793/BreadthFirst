import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch extends AbstractSearch 
{
	Node startNode;
	Node goalNode;
	
	public BreadthFirstSearch(Node startNode, Node goalNode)
	{
		super(startNode,goalNode);
		this.startNode = startNode;
		this.goalNode = goalNode;
	}
	
	public boolean search()
	{
		if(this.startNode.equals(goalNode))
		{
            System.out.println("Goal Node Found!");
            System.out.println(startNode);
        }

        Queue<Node> queue = new LinkedList<>();
        ArrayList<Node> explored = new ArrayList<>();
        queue.add(this.startNode);
        explored.add(startNode);

        while(!queue.isEmpty())
        {
            Node current = queue.remove();
            if(current.equals(this.goalNode)) 
            {
                System.out.println(explored);
                return true;
            }
            else
            {
                if(current.getChildren().isEmpty())
                    return false;
                else
                    queue.addAll(current.getChildren());
            }
            explored.add(current);
        }

        return false;
	}
}
