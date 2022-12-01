package DansDilemma;

import java.util.HashSet;
import java.util.Set;

public class DansDilemma {
    Set helper(Double input1, Double input2) {
        Set<Double> res = new HashSet<Double>();
        res.add(input1+input2);
        res.add(input1*input2);
        res.add(input1-input2);
        res.add(input2-input1);
        res.add(input1/input2);
        res.add(input2/input1);

        return res;
    }

    public Integer dilemmaOfTwo(Double input1, Double input2) {
        return helper(input1,input2).size();
    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
        Set<Double> res = new HashSet<Double>();
        res.addAll(helper(input1, input2));
        res.addAll(helper(input1, input3));
        res.addAll(helper(input2, input3));
        return res.size();
    }

    public Integer dilemmaOfN(Double... args){
        return null;
    }
}
