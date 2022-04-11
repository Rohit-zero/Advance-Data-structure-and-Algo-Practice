import java.util.ArrayList;
import java.util.Scanner;

public class Unique_combination {
    public void find_combination(char[] arr,int l, int r) {
        if(l==r)
        {
            printstring(arr);
            return;
        }
        for(int i=l;i<=r;i++)
        {
            swap(arr, l, i);
            find_combination(arr, l+1, r);
            swap(arr, l, i);

        }
 
    }
    public void printstring(char[] arr) {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]);
            //System.out.println();
        }
        System.out.println();
    }

    public void swap(char[] arr,int i, int j) {
        char temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        String input;
        Scanner sc=new Scanner(System.in);
        input=sc.nextLine();

        char[] arr = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            arr[i] = input.charAt(i);
        }

        ArrayList<String> ans=new ArrayList<String>();
        Unique_combination o=new Unique_combination();
        o.find_combination(arr,0,arr.length-1);
    }
}
