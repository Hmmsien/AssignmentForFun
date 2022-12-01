package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list2);
        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int res1 = 0, res2 = 0;
        for(int n : list1)
            res1 += n;
        for(int n : list2)
            res2 += n;
        return res1+res2;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        original.removeAll(Arrays.asList(toRemove));
        return original;
    }

    public boolean happyList(ArrayList<String> original) {
        return false;
    }
}
