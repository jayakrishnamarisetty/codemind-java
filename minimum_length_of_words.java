import java.util.*;
public class rug{
    public static void main(String args[])
    {
        Scanner r= new Scanner(System.in);
        String s=r.nextLine();
        // split method returns a String array
        String[] arr=s.split(" ");
        // Initialize min with the maximum possible value

        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            // Use Math.min to find the minimum length
            min=Math.min(min,arr[i].length());
        }
        System.out.print(min);
    }
}