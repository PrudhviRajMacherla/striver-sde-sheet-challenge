public class Sort_Array_of_0_1_2{
    public static void swap(int[] nums,int low,int high)
    {
        int temp=nums[low];nums[low]=nums[high];nums[high]=temp;
    }
    public static void dutch_national_flag(int[] nums)
    {
        System.out.println("Dutch National Flag Algo");
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                //swap low and mid values
                swap(nums,low,mid);
                low++;mid++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else{
               swap(nums,mid,high);
                high--;
            }
        }
    }
    public static void better_solution(int[] nums) 
    {
        int ct0=0,ct1=0,ct2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                ct0++;
            }
            else if(nums[i]==1)
            {
                ct1++;
            }
            else
            {
                ct2++;
            }
        }
        for(int i=0;i<ct0;i++)
        {
            nums[i]=0;
        }
        for(int i=ct0;i<ct0+ct1;i++)
        {
            nums[i]=1;
        }
        for(int i=ct0+ct1;i<ct0+ct1+ct2;i++)
        {
            nums[i]=2;
        }
    }

    public static void main(String[] args)
    {
        int[] arr ={2 ,1 ,2 ,0 ,1 ,0};
       // better_solution(arr);
        dutch_national_flag(arr);
        for(int e:arr){
            System.out.print(e+"\t");
        }
    }
}