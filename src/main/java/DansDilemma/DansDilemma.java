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
        if (input2 != 0)
            res.add(input1/input2);
        if (input1 != 0)
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
        System.out.println(res);
        return res.size();
    }

    public Integer dilemmaOfN(Double... args){
        Set<Double> res = new HashSet<Double>();
        for(int i = 0; i < args.length - 1; i++) {
            for (int j = i+1; j < args.length; j++) {
                res.addAll(helper(args[i],args[j]));
            }
        }

        return res.size();
    }

}
