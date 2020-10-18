import java.util.TreeMap;

public interface Executioner {

    public TreeMap<Integer, Object> get(int[] keys);

    public void insert(TreeMap<Integer, Object> entries);

    public void delete(TreeMap<Integer, Object> entries);

}
