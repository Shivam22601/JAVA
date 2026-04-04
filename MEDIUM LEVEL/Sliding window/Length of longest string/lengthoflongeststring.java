import java.util.HashSet;
public class lengthoflongeststring{
    public int lengthoflongeststring(String s){
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxlen = 0;
        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            maxlen = Math.max(maxlen, right - left + 1);
        }
    return maxlen;
    }

    public static void main(String[] args) {
        lengthoflongeststring obj = new lengthoflongeststring();
        String s = "abcabcbb";
        int result = obj.lengthoflongeststring(s);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }
}