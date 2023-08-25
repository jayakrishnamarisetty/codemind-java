import java.util.*;
public class rug{
    public static void main(String args[])
    {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        int c=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=r.nextInt();
            if(arr[i]%2!=0)
            {
                c+=1;
            }
        }
        if(c>2) System.out.println("NO");
        else System.out.println("YES");
    }
}