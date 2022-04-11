import java.util.Scanner;

public class Convert_integer_to_romanNum {
    public void convert(int n) {
        if(n>500)
        {
        System.out.println("value is greater then 500");
        }
        else{
            String c[]={ "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
		String x[]={ "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
		String i[]={ "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };

		String huns=c[(n%1000)/100];
		String tens=x[(n%100)/10];
		String ones=i[n%10];

		String ans=huns+tens+ones;
		System.out.println(ans);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a integer between 1-500");
        int n=sc.nextInt();
        
        Convert_integer_to_romanNum o=new Convert_integer_to_romanNum();
        o.convert(n);
    }
}
