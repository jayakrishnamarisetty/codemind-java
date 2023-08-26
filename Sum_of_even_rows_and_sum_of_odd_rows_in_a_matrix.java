import java.util.*;
public class rug{
    public static void main(String args[])
    {
        Scanner r= new Scanner(System.in);
        int a=r.nextInt();
        int c=r.nextInt();
        int sum=0;
        int k=0;
        int[][] ar=new int[a][c];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<c;j++)
            {
                ar[i][j]=r.nextInt();
            }
        }
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<c;j++)
            {
                if (i%2==0)
                {
                    sum+=ar[i][j];
                }
                else
                {
                    k+=ar[i][j];
                }
            }
        }
        System.out.print(sum+" "+k );
    }
}