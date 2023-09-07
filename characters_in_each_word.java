import java.util.*;

public class Rug {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String s = r.nextLine();
        String[] words = s.split(" "); // Split the input sentence into words
        for (String word : words)
        // to find string using for each loop
        
        {
            int wordLength = word.length(); // Calculate the length of each word
            System.out.print(wordLength+" ");
        }
    }
}
