import java.util.Hashtable;


public class DepthFirstSearch<T>
{
    public Node<T> root;
    public Node<T> goal;
    public Hashtable<Node<T>, Boolean> visited;

    public boolean DepthFirstSearch(Node<T> root, Node<T> goal)
    {
        this.root = root;
        this.goal = goal;

        if(this.root == this.goal)
        {
            System.out.println("The goal has been reached.");
            return true;

        } else {
            if(root.children.size()-1 >0)
            {
                for(Node<T>child: root.children)
                {
                    DepthFirstSearch(child, goal);
                }
            }

            return false;
        }
    }

}
