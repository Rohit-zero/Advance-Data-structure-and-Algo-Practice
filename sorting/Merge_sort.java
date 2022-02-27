import java.util.Arrays;

public class Merge_sort {
    public int[] sort(int[] arr) {
        int n=arr.length-1;
        if(arr.length == 1)
        {
            return arr;
        }
        n=n/2;
        int[] left=sort(Arrays.copyOfRange(arr, 0, n));
        int[] right=sort(Arrays.copyOfRange(arr, n, arr.length-1));
        return merge(left,right);
        
    }

    //function for swap
    // public static int[] swapp(int[] arr) {
        // if(arr[1]<arr[0])
        // {
        //     int temp=arr[0];
        //     arr[1]=arr[0];
        //     arr[0]=temp;
        // }
        // return arr;
    //}


    // function for marge two arrays
    public static int[] merge(int[] arr1, int[] arr2)
    {
        int[] arr=new int[arr1.length + arr2.length];
        int n=arr1.length-1;
        int m=arr2.length-1;
        int i=0;
        while(n != arr1.length || m != arr2.length)
        {
            if(arr1[n]>arr2[m])
            {
                arr[i]=arr[m];
                i=i+1;
            }else{
                arr[i]=arr[n];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={3,7,1,9,4,6,2};
        Merge_sort o= new Merge_sort();
        o.sort(arr);
    }
}
