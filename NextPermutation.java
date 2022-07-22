class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=0;
        for(i=n-1;i>0;--i){
            if(nums[i]>nums[i-1]){
                int j=n-1;
                while(nums[j]<=nums[i-1]){
                    --j;
                }
                swap(nums,i-1,j);
                break;
            }
        }
        reverse(nums,i,n-1);        
    }
    
    void swap(int a[],int i, int j){
        int temp=a[j];
        a[j]=a[i];
        a[i]=temp;
    }
    
    void reverse(int nums[],int p,int q){
        while(p<q){
            int temp=nums[p];
            nums[p]=nums[q];
            nums[q]=temp;
            ++p;
            --q;
        }
    }
}