import java.util.Arrays;
public class VALIDANAGRAM{
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;
        int[] count = new int[26];
        for(char c : s.toCharArray())
        count[c- 'a']++;

        for(char c : t.toCharArray())
        count[c - 'a']--;

        for(int val : count)
                if(val != 0) return false;

            return true;
    }



    public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";
        System.out.print(isAnagram(s,t));
    }
}