import java.util.Scanner;
public class fact {
    public static int fact1(int n)
    {
if(n==1)
return 1;
else
return n*fact1(n-1);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n");
        int n=sc.nextInt();
       System.out.print(fact1(n));
    }
}
