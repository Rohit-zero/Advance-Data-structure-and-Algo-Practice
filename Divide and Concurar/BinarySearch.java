//Binery search with loop traversal
public class BinarySearch {
    public boolean search(int arr[], int a) {
        boolean ans=false;
        int s=0;
        int l=arr.length-1;
        while (s<l) {
           int mid=(s + l) / 2;
            if(arr[mid]==a)
            {
                ans=true;
                break;
                //return true;
            }
            if(a>arr[mid])
            {
                s=mid+1;
            }else{
                l=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        BinarySearch o=new BinarySearch();
        System.out.println(o.search(arr, 8));
    }
}
