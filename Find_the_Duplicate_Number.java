import java.util.*;
public class rug{
    public static void main(String args[])
    {
        Scanner r= new Scanner(System.in);
        int n=r.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=r.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
             if(arr[i]==arr[j])
             {
                 System.out.println(arr[i]);
             }
            }
        }
        
    }
}