public class Find_duplicate{
    public static int findDuplicate(int[] nums) 
    {
        int slow=nums[0];
        int fast=nums[0];
        do
        {
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast); 
        fast=nums[0];
        while(slow!=fast)
        {
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
    public static void main(String[] args)
    {
        System.out.println("Duplicate element is "+findDuplicate(new int[]{1,3,4,2,2}));
    }
}