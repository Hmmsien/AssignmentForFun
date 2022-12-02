package Collections;

import java.util.*;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {
        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {

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

        return keys.toArray(new Object[keys.size()]);
    }

    Map<Integer,Integer> memo = new TreeMap<Integer,Integer>();
    public int fib(int N) {
        if(N == 0) {
            return 0;
        } else if(N <= 2){
            return 1;
        }
        if(memo.containsKey(N)){
            return memo.get(N);
        } else {
            int val = fib(N-1) + fib(N-2);
            memo.put(N, val);
        }

        return fib(N - 1) + fib(N - 2);
    }
    public Map<Integer, Integer> fibonacciTree(int size) {
        Map<Integer,Integer> map = new TreeMap<Integer,Integer>();

        for(int i = 1; i <= size; i++ ) {
            map.put(i,fib(i));
        }
        return map;
    }


    Map<Integer,Integer> map2 = new TreeMap<Integer,Integer>();
    public int fib(int N, int f, int s) {
        if(N == 0) {
            return 0;
        } else if(N == 1){
            return f;
        } else if(N == 2) {
            return s;
        }

        if(map2.containsKey(N)){
            return map2.get(N);
        } else {
            int val = fib(N-1, f,s) + fib(N-2, f, s);
            map2.put(N, val);
        }

        return fib(N - 1,f,s) + fib(N - 2, f, s);
    }
    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        Map<Integer,Integer> map = new TreeMap<Integer,Integer>();

        for(int i = 1; i <= size; i++ ) {
            map.put(i,fib(i,first,second));
        }
        return map;
    }
}
