import java.util.*;
public class pattern2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        int n=sc.nextInt();
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<i+1;j++)
            System.out.print("*");
            System.out.println();
            }
            for(i=1;i<n;i++)
            {
                for(j=i;j<n;j++)
                System.out.print("*");
                System.out.println();
            }
    }
}
