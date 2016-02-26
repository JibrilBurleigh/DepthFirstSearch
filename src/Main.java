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
        rootNode = new Node<>("rootNode");
        childOne = new Node<>("childOne");
        childTwo = new Node<>("childTwo");
        childThree = new Node<>("childThree");
        dfs = new DepthFirstSearch();

        //building the trees
        rootNode.addChild(childOne);
        rootNode.addChild(childThree);
        childOne.addChild(childTwo);

       System.out.print(dfs.DepthFirstSearch(rootNode, rootNode));

    }
}
