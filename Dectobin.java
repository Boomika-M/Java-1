import java.util.*;
public class Dectobin{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[1000];
        int i=0;
        while(n>0)
        {
            a[i]=n%2;
            n/=2;
            i++;
        }
        for(int k=i-1;k>=0;k--)
        {
            System.out.print(a[k]);
        }
    }
}
