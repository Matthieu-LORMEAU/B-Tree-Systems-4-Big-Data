import java.util.TreeMap;

public class BTree {

    private final int M;
    private enum executionType{single_thread, multi_thread, spark};
    private SingleExecutioner single_executioner = new SingleExecutioner();
    private MultiExecutioner multi_executioner =  new MultiExecutioner();
    private SparkExecutioner spark_executioner = new SparkExecutioner();
    private Node rootNode;

    public BTree(int M, Node rootNode){
        this.M = M;
        this.rootNode = rootNode;
    }

    public void insert(TreeMap<Integer, Object> entries, executionType execution){
        switch (execution){
            case single_thread:
                single_executioner.insert(entries);
                break;
            case multi_thread:
                multi_executioner.insert(entries);
                break;
            case spark:
                spark_executioner.insert(entries);
                break;
        }
    }

    public TreeMap<Integer, Object> get(int[] keys, executionType execution){
        switch (execution){
            case single_thread:
                single_executioner.get(keys);
                break;
            case multi_thread:
                multi_executioner.get(keys);
                break;
            case spark:
                spark_executioner.get(keys);
                break;
        }
        return null;
    }

    public void delete(TreeMap<Integer, Object> entries, executionType execution){
        switch (execution){
            case single_thread:
                single_executioner.delete(entries);
                break;
            case multi_thread:
                multi_executioner.delete(entries);
                break;
            case spark:
                spark_executioner.delete(entries);
                break;
        }
    }

    @Override
    public String toString() {
        return "BTree{}";
    }
}
