import java.util.*;

public class countSubstrings{

    public static int countSubstrings(String s) {
        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            // Odd length palindromes
            count += expand(s, i, i);

            // Even length palindromes
            count += expand(s, i, i + 1);
        }

        return count;
    }

    private static int expand(String s, int left, int right) {
        int count = 0;

        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "aaa"; // You can change input here
        int result = countSubstrings(s);

        System.out.println("Total Palindromic Substrings: " + result);
    }
}