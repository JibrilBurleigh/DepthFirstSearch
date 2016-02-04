import java.util.ArrayList;

/**
 * Created by jibbgh on 1/26/2016.
 */
public class Node<T>
{
    T data;
    Node<T> parent;
    ArrayList<Node<T>> children;

    public Node(T data)
    {
        this.data = data;
        this.children = new ArrayList<Node<T>>();
    }

    public Node<T> addChild(T child)
    {
        Node<T> childNode = new Node<T>(child);
        childNode.parent = this;
        this.children.add(childNode);
        return childNode;
    }

    public ArrayList<Node<T>> removeChild(T child)
    {
        Node<T> childNode = new Node<T>(child);
        ArrayList<Node<T>> children = this.children;
        children.remove(child);
        return children;
    }
}
