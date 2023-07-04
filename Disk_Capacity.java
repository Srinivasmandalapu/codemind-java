import java.util.*;
public class Capacity
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,r;
        t=sc.nextInt();
        int b;
        b=sc.nextInt();
        int s;
        s=sc.nextInt();
        r=t*b*s*512*2;
        System.out.println(r);
    }
}