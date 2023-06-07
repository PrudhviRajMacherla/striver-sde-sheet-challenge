public class Arrays_set_matrix_zero
{
    public static void set(int row,int col,int n,int m,int matrix[][])
    {
        for(int i=0;i<m;i++)
        {
            //setting all row elements to zero
            matrix[row][i]=0;
        }
        for(int j=0;j<n;j++)
        {
            //setting column elements tozero
            matrix[j][col]=0;
        }
    }
    public static void optimalApproach(int[][] matrix)
    {
        //int col[m]={0}--> matrix[0][...]
        //int row[n]={0}--> matrix[...][0]
        int n=matrix.length;
        int m=matrix[0].length;
        int col1=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][0]=0;

                    if(j!=0)
                    {
                        matrix[0][j]=0;
                    }
                    else{
                        col1=0;
                        
                    }
                }
            }
        }
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(matrix[i][0]==0||matrix[0][j]==0)
                {
                    matrix[i][j]=0;
                }
            }
        }
        //now check first element
        if(matrix[0][0]==0)
        {
            for(int j=1;j<m;j++)
            {
                matrix[0][j]=0;
            }
        }
        if(col1==0)
        {
            for(int i=0;i<n;i++)
            {
                matrix[i][0]=0;
            }
        }

    }
    public static void myApproach(int[][] matrix)
    {
        int n=matrix.length;
        int m=matrix[0].length;
        boolean[][] vis = new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    vis[i][j]=true;//making the visited matrix set zero
                }
            }
        }
        //calling a function to set matrix to zero
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(vis[i][j]==true && matrix[i][j]==0)
                {
                    set(i,j,n,m,matrix);
                }
            }
        }
        
        
    }
     public static void betterApproach(int matrix[][]) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[] row = new int[m];
        int[] col = new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    row[j]=1;
                    col[i]=1;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(row[j]==1||col[i]==1)
                {
                    matrix[i][j]=0;
                }
                
            }
        }
    }
    public static void main(String[] args)
    {
        int[][] arr =
                        {{0,1,2,0},
                        {3,4,5,2},
                        {1,3,1,5}};
        int[][] matrix = arr.clone();
        int n=matrix.length;
        int m=matrix[0].length;
       // myApproach(matrix);
       betterApproach(matrix);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }

    }
}