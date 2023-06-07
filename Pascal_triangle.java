import java.util.*;
public class Pascal_triangle
{
    public static void pascal(int n)
    {
        for(int row=1;row<=n;row++)
        {
            int ans=1;
            for(int col=1;col<=row;col++)//the col<=row bcoz every row have same number of row elements
            {
                System.out.println(ans+"\t");
                ans=ans*(row-col)/(col);
            }
            System.out.println();
        }
    }
    public static int fndncr(int n,int c)
    {
        int ans=1;
        for(int i=0;i<c;i++){
            ans=ans*(n-i)/(i+1);
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number");
        int row=sc.nextInt();
        System.out.println("Enter col number");
        int col=sc.nextInt();
        System.out.println("The Particular number is :"+fndncr(row-1,col-1));
        System.out.println("The Triangle is:");
        pascal(row);
    }
}