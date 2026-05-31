import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] num1 = new int[m];
        int i;
        for (i = 0; i < m; i++) {
            num1[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int[] num2 = new int[n];
        for (i = 0; i < n; i++) {
            num2[i] = sc.nextInt();
        }
        Solution1 solution = new Solution1();
        solution.merge(num1,m,num2,n);
    }
}

class Solution1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Last index of nums1 actual elements
        int j = n - 1; // Last index of nums2
        int k = m + n - 1; // Last index of nums1 including extra space

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If there are remaining elements in nums2
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
