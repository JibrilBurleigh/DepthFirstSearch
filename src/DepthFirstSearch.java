import java.util.Hashtable;
import java.util.Stack;

/**
 * Created by jibbgh on 1/26/2016.
 */
public class DepthFirstSearch<T>
{
    public Node<T> root;
    public Node<T> goal;
    public Node<T> child;
    public Hashtable<Node<T>, Boolean> visited;

    public Node<T> DepthFirstSearch(Node<T> root, Node<T> goal)
    {
        this.root = root;
        this.goal = goal;

        if(this.root == this.goal)
        {
            System.out.println("The goal has been reached.");
            return this.root;
        }else
        {
            if(root.children.size()-1 >0)
                child = this.root.children.get(root.children.size()-1);


            DepthFirstSearch(child, this.goal);
            visited.put(child, true);
            return child;
        }
    }

}
