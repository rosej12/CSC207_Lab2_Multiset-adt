import java.util.ArrayList;

public class Tree {
    // TODO complete this Tree class to replicate the implementation from the Tree class in adts.py

    private Integer root;               // The item stored at this tree's root, or None if the tree is empty.
    private ArrayList<Tree> subtrees;   // The list of all subtrees of this tree.

    public Tree(Integer root, ArrayList<Tree> subtrees) {
        this.root = root;
        this.subtrees = subtrees;
    }

    public Tree(Integer root) {
        this.root = root;
        this.subtrees = null;
    }

}
