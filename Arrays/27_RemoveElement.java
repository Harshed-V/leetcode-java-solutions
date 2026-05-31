public class RemoveEle {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 4, 1, 3};
        int val = 1,i;
        int b=removeElement(a,val);
        for(i=0;i<b;i++)
            System.out.print(a[i]);

    }public static int removeElement(int[] nums, int val){
        int i=0, j;
        int len=nums.length;
        for(j=0;j<len;j++){
           if(nums[j]!=val){
              nums[i]=nums[j];
              i++;
           }
        }return i;
    }
}
