import java.util.*;
public class Rotate_matrix_by_90{
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        // Write your code here.
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=m-1;
        while(left<right && top<bottom)
        {
            int prev=mat.get(top+1).get(left);
            //top boundary
            for(int i=left;i<=right;i++)
            {
                int curr=mat.get(top).get(i);
                mat.get(top).set(i,prev);
                prev=curr;
            }
            top++;
            //right boundary
            for(int i=top;i<=bottom;i++)
            {
                int curr=mat.get(i).get(right);
                mat.get(i).set(right,prev);
                prev=curr;
            }
            right--;
            //bottom boundary
            for(int i=right;i>=left;i--)
            {
                int curr=mat.get(bottom).get(i);
                mat.get(bottom).set(i,prev);
                prev=curr;
            }
            bottom--;
            //left boundary
            for(int i=bottom;i>=top;i--)
            {
                int curr=mat.get(i).get(left);
                mat.get(i).set(left,prev);
                prev=curr;
            }
            left++;

        }
    }
    public static void main(String[] args)
    {
        int n=4;
        int m=4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int ct=0;
        for(int i=0;i<n;i++){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int j=0;j<m;j++)
            {
                temp.add(ct);
                ct++;
            }
            adj.add(temp);    
        }
        rotateMatrix(adj,n,m);
        for(int i=0;i<n;i++){
            ArrayList<Integer> t = adj.get(i);
            for(int j=0;j<m;j++){
                System.out.print(t.get(j)+"\t");
            }System.out.println();
        }
    }
}