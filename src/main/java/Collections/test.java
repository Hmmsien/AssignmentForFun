package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class test {
    public static Object[] findKeysOf(Map map, Object value) {

        List<Object> keys = new ArrayList<Object>();
        boolean getKey = false;

        for (Object key : map.keySet()) {
            if (map.get(key).equals(value) ) {
                keys.add(key);
                getKey = true;
            }
        }
        if(!getKey)
            return new Object[]{};

        System.out.println(keys);

        Object[] array = keys.toArray(new Object[keys.size()]);
        return array;
    }

    public static void main(String[] args) {

        Map<String, String> map1 = new TreeMap<String, String>();
        map1.put("Mario", "Mario Bros.");
        map1.put("Donkey Kong", "Donkey Kong");
        map1.put("Link", "Legend of Zelda");
        map1.put("Samus Aran", "Metroid");
        map1.put("Yoshi", "Yoshi's World");
        map1.put("Kirby", "Kirby");
        map1.put("Fox McCloud", "Star Fox");
        map1.put("Pikachu", "Pokemon");
        map1.put("Luigi", "Mario Bros.");
        map1.put("Captain Falcon", "F-Zero");
        map1.put("Ness", "EarthBound");
        map1.put("Jigglypuff", "Pokemon");

        String value = "Pokemon";
        // When
        //Object[] expected = {"Donkey Kong"};
        findKeysOf(map1,value);
    }


}
