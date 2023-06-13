import java.util.*;
public class Merge_without_using_extra_space
{
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n)
    {
        int left=m-1;
        int right=0;
        while(left>=0 && right<n)
        {
            if(arr1[left]>arr2[right])
            {
                int temp=arr1[left];
                arr1[left]=arr2[right];
                arr2[right]=temp;
                left--;
                right++;
            }
            else
            {
                break;
            }
        }
        Arrays.sort(arr1,0,m);
        Arrays.sort(arr2,0,n);
        for(int i=m;i<arr1.length;i++)
        {
            arr1[i]=arr2[i-m];
        }
        return arr1;
    }
    public static void main(String[] args)
    {
        int[] arr1={3,6,9,0,0};
        int[] arr2={4,10};
        int m=3;
        int n=2;
        System.out.println("Sorted Array Without Using Extra space is:"+Arrays.toString(ninjaAndSortedArrays(arr1,arr2,m,n)));
    }
}