import java.util.*;

public class Rug {
    public static void main(String args[]) {
        Scanner r = new Scanner(System.in);
        String s = r.nextLine();
        Set<Character> seen = new HashSet<>();

        boolean containsDuplicates = false;

        for (char c : s.toCharArray()) {
            if (seen.contains(c)) {
                containsDuplicates = true;
                break; // Exit the loop as soon as a duplicate is found
            }
            seen.add(c);
        }

        if (containsDuplicates) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}
