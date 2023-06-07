import java.util.*;
public class Next_permutation
{
    public static void reverse(int[] nums,int si,int ei)
    {
        int i=si,j=ei;
        while(i<j)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public static void nextPermutation(int[] nums) 
    {
        int idx=-1;
        for(int i=nums.length-2;i>=0;i--)//find the break point
        {
            if(nums[i]<nums[i+1])
            {
                idx=i;
                break;
            }
        }
        if(idx==-1)
        {
            reverse(nums,0,nums.length-1);//if not found reverse the array as it was the last permutation
            return;
        }
        else
        {
            for(int i=nums.length-1;i>idx;i--)
            {
                if(nums[i]>nums[idx])   //swap with the 
                {
                    int temp=nums[i];
                    nums[i]=nums[idx];
                    nums[idx]=temp;     
                    break;
                }
            }
            reverse(nums,idx+1,nums.length-1);
        }
    }
        public static void main(String[] args)
        {
            int[] arr = {1,2,3,4};
            nextPermutation(arr);
            System.out.println(Arrays.toString(arr));
        }
    
}