import java.util.*;
public class rug{
    public static void main(String args[])
    {
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        int[] a=new int[n];
        int ar1[] = new int[n];
        // ArrayList<Integer> ar1=new ArrayList<>();
        int j = 0 ;
        for(int i=0;i<n;i++)
        {
            a[i] = r.nextInt();
            if (a[i] == 0){
                continue;
            }
            else{
               ar1[j++] = a[i];
            }
        }
        for (int i : ar1)
        {
            System.out.print(i+ " ");
        }
        // System.out.println(Arrays.toString(ar1));
    }
}