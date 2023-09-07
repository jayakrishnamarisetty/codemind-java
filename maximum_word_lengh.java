import java.util.*;
public class Main {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" "); // split method returns a String array

        int max = 0;

        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i].length()); // Here arr[i] is a String and we are accessing its length 
        }

        System.out.println(max);

        
    }
}