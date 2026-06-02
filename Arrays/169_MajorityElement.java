class Solution {
    public int majorityElement(int[] a) {
        int count=0,n=a.length,majority_element=a[0];
        for(int i=0;i<n;i++){
            if(count==0){
                majority_element=a[i];
                count++;

            }else if(a[i]==majority_element){
                count++;
            }else{
                count--;
            }
        }
        return majority_element;
    }
}
