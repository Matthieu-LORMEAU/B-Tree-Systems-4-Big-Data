import java.util.TreeMap;

public class Node {
    private TreeMap<Integer, Object> entries = new TreeMap<>();
    private Node[] children;
    private boolean isLeaf;

    public Node(boolean isLeaf) {
        this.isLeaf = isLeaf;
    }

    public TreeMap<Integer, Object> getEntries() {
        return entries;
    }

    public void setEntries(TreeMap<Integer, Object> entries) {
        this.entries = entries;
    }

    public Node[] getChildren() {
        return children;
    }

    public void setChildren(Node[] children) {
        this.children = children;
    }

    public boolean isLeaf() {
        return isLeaf;
    }

    public void setLeaf(boolean leaf) {
        isLeaf = leaf;
    }

    @Override
    public String toString() {
        return "Node{}";
    }
}
