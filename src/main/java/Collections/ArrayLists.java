package Collections;

import java.util.*;
import java.util.stream.Collectors;

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

    public static boolean happyList(ArrayList<String> original) {
        if(original.size() < 2 || original == null)
            return true;
        int count = 0;
        // iterate arraylist
        for (int i = 0; i < original.size() - 1; i++) {
            String str = original.get(i);
            for (int j = 0; j < str.length(); j++) {
                if(helper(original.get(i+1)).contains(str.charAt(j))){
                    count++;
                    break;
                }
            }
        }

        return count == original.size() - 1? true :false;
    }

    static Set helper(String str) {
        Set<Character> charsSet = str.chars()
                .mapToObj(e->(char)e).collect(Collectors.toSet());
        return charsSet;
    }
}
