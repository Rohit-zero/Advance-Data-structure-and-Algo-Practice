import javax.swing.plaf.synth.Region;

public class Min_Max {
    // native and nife solution (Linear)
    public void native_solution(int[] arr) {
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if( min>arr[i])
            {
                min=arr[i];
            }
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println("min = "+ min + "  "+ "max = " + max);
    }
    
    // Divide and Concurar Section...   
    public int divide_and_concurar(int[] arr,int n) {
        if(arr.length==2)
        {
            return Integer.min(arr[0], arr[1]);
        }
        n=arr.length/2;
        int left = divide_and_concurar(copy(arr,0,n),copy(arr, 0, n).length/2);
        int right = divide_and_concurar(copy(arr,n,arr.length-1),copy(arr, 0, n).length/2);
        return Integer.min(left, right);
    }
    public static int[] copy(int[] arr,int s, int n) {
        int[] c=new int[n];
        for(int i=0;i<n;i++)
        {
            c[i]=arr[i];
        }
        return c;
    }
    public static void main(String[] args) {
        int[] arr={5,2,8,3,9,4,7,1};
        Min_Max o=new Min_Max();
       // o.native_solution(arr);
       int n=arr.length;
        o.divide_and_concurar(arr,n);
    }
}
