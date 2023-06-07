import java.util.*;
public class Maximum_subarray_sum{
    public static void kadanes_algo(int[] arr)
    {
        int start=0;
        int startarr=-1;
        int endarr=-1;
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(sum==0)
            {
                start=i;
            }
            sum+=arr[i];
            if(sum>maxi)
            {
                startarr=start;
                endarr=i;
                maxi=sum;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        if(maxi<0)
        {
            maxi=0;
        }
        if(maxi==0)
        {
            System.out.println("It is an Empty SubArray");
        } 
        else
        {
        System.out.println("Maximum Sub Array Sum is:"+maxi);
        System.out.println("The Array Start from "+startarr+"and end's at"+endarr);
         }
    }
    public static void main(String[] args)
    {
        int[] arr ={-2, 1, -3, 4, -1, 2, 1, -5, 4};kadanes_algo(arr);

    }
}