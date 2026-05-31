import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows <= 0) 
            return result;

        //for intial always 1 at top of Pascal's Triangle
        result.add(new ArrayList<>(Arrays.asList(1)));

        for(int i=1; i<numRows;i++){
            List<Integer> prevRow = result.get(i-1);
            List<Integer> currentRow = new ArrayList<>();

            currentRow.add(1); //Initial 1 for each row

            for(int j=1; j<i;j++){  // Middle elements are the sum of two numbers above
                int val = prevRow.get(j-1) + prevRow.get(j);
                currentRow.add(val);
            }
            currentRow.add(1);//final 1 of each Row
            result.add(currentRow); //Adding final list to result
        }
        return result;
    }
}
public class pascals118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRows = sc.nextInt();
        Solution sol = new Solution();
        System.out.print(sol.generate(numRows));
    }
}
