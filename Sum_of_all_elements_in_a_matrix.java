import java.util.*;

public class rug{
    public static void main(String args[])
    {
        Scanner r= new Scanner(System.in);
        int R=r.nextInt();
        int C=r.nextInt();
        int[][] a=new int[R][C];
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
              a[i][j]=r.nextInt();   
            }
        }
        int sum=0;
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                sum=sum+a[i][j];
            }
        }
        System.out.println(sum);
     
    }
}