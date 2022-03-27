public class N_queen {
    public boolean positions(int[][] arr, int row, int n) {
        if(row==n)
        {
            return true;
        }
        for(int i=0;i<n;i++)
        {
            // i is represting columns

            if(check(arr,row,i))
            {
                arr[row][i]=1;
                if(positions(arr,row+1,n))
                {
                    return true;
                }
                arr[row][i]=0;
            }
        }
        return false;
    }

    public boolean check(int arr[][],int row,int col) {
        for(int i=0; i<arr.length;i++)
        {
            if(arr[row][i]==1)
            {
                return false;
            }
            if(arr[i][col]==1)
            {
                return false;
            }
            if(arr[i][i]==1)
            {
                return false;
            }
        }
        return true;
    }
    
    public void print_location(int[][] arr) {
        for(int r=0; r<arr.length; r++)
            for(int c=0; c<arr.length; c++)
                if(arr[r][c]==1)
                    System.out.println(r,c);
    }
    
    public static void main(String[] args) {
        int n=4;     // size of matrix
        int[][] arr=new int[n][n];

        // inserting 0 in each cell
        // zero means queen not present and ones means queen are there
        for(int i=0;i<n;i++)
        {
            arr[0][i]=0;
            arr[i][0]=0;
        }
        N_queen o = new N_queen();
        o.positions(arr,0,n);
        o.print_location(arr);
    }
}
