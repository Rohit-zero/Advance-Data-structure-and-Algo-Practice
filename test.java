public class test {
    public void print(int a) {
        if(a<=5)
        {
            System.out.println(a);
            print(a+1);
        }
        System.out.println("check");
    }
    public static void main(String[] args) {
        test o=new test();
        o.print(0);
    }
}
