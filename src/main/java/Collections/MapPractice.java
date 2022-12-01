package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {
        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {

        List<Object> keys = new ArrayList<Object>();

        for (Object key : map.keySet() )
        {
            if ( map.get(key).equals(value) )
            {
                keys.add(key);
            }
        }
        return new Object[]{keys};
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
        return null;
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        return null;
    }
}
