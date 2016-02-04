/**
 * Created by jibbgh on 1/27/2016.
 */
public class Main
{

    public static Node<String> rootNode;
    public static Node<String> childOne;
    public static Node<String> childTwo;
    public static Node<String> childThree;
    public static DepthFirstSearch dfs;

    public static void main(String [] args)
    {
        //initializing variables
        rootNode = new Node<String>("rootNode");
        childOne = new Node<String>("childOne");
        childTwo = new Node<String>("childTwo");
        childThree = new Node<String>("childThree");
        dfs = new DepthFirstSearch();

        //building the trees
        rootNode.addChild(childOne);
        rootNode.addChild(childThree);
        childOne.addChild(childTwo);

        dfs.DepthFirstSearch(rootNode, childTwo);

    }
}
