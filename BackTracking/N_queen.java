public class N_queen {
    public void positions(int r, int c, int n) {
        if(c==n)
        {
            return;
        }
        for(int i=0;i<n;i++)
        {
            
        }
    }

    public void check() {
        
    }
    public static void main(String[] args) {
        int n=4     // size of matrix
        N_queen o = new N_queen();
        o.positions(0, 0,n);
    }
}
