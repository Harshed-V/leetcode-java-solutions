import java.util.*;

public class SumCloset {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] num = {-1,2,1,-4};
        int target = 1;
        int result = threeSumClosest(num, target);
        System.out.println(result);
    }
    public static int threeSumClosest(int[] num, int target){
        Arrays.sort(num);
        int closest = Integer.MAX_VALUE;
        int minDiff = Integer.MAX_VALUE;
        for(int i =0 ; i<num.length-1;i++){
            if(i>0 && num[i]==num[i-1]) continue;
            int left = i+1,right = num.length-1;
            while(left<right){
                int sum = num[i]+num[left]+num[right];
                int diff = Math.abs(sum-target);
                if (diff == 0) return target;
                if (diff < minDiff) {
                    minDiff = diff;
                    closest = sum;
                }

                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return closest;
    }
}
