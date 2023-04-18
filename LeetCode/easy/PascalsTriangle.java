package easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> previous = new ArrayList<>();
        previous.add(1);
        ans.add(previous);

        for(int i = 1; i < numRows; i++) {
            List<Integer> current = new ArrayList<>();
            current.add(1);
            for(int j = 1; j < i; j++){
                current.add(previous.get(j) + previous.get(j - 1));
            }
            current.add(1);
            ans.add(current);
            previous = current;
        }
        return ans;
    }

    public static void main(String[] args) {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        List<List<Integer>> output = pascalsTriangle.generate(6);
        System.out.println(output);
    }
}
