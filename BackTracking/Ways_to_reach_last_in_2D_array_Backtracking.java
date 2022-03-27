public class Ways_to_reach_last_in_2D_array_Backtracking {
//    int left, right;
     public int ways_to_reach_last_in_2D_array(int r,int c) {
                                         // 0   .   .
                                         // .   .   .
                                         // .   .   1
         if(r==1 || c==1)
             return 1;

         int left = ways_to_reach_last_in_2D_array(r-1,c);
         int right = ways_to_reach_last_in_2D_array(r, c-1);

         return left+right;
     }
    public static void main(String[] args) {
        Ways_to_reach_last_in_2D_array_Backtracking o =new Ways_to_reach_last_in_2D_array_Backtracking();
        System.out.println(o.ways_to_reach_last_in_2D_array(3,3));
    }
}

// paths with resitriction or opsticals in maze

public int ways_to_reach_with opsticals(int r, int c) {
    
}