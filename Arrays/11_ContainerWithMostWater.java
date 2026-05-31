import java.util.*;
public class ContainerWithMostWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] height = new int[len];
        for(int i=0;i<len;i++){
            height[i]=sc.nextInt();
        }
        ContainerWithMostWater max = new ContainerWithMostWater();   // Object is created to access the non static function
        int b = max.maxArea(height);
        System.out.println(b);
        sc.close();

    }public int maxArea(int[] height){
        int maxWater = 0;
        int i = 0, j = height.length-1;

        while(i < j) {
            int min = Math.min(height[i], height[j]);
            maxWater = Math.max(min * (j-i), maxWater);      //Area has been calculated

            while (i < j && height[i] <= min) i++;           //Two pointer Approach for optimization 
            while (i < j && height[j] <= min) j--;
        }

        return maxWater;
    }
}
