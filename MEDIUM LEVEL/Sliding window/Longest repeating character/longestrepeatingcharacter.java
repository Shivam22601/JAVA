public class longestrepeatingcharacter{
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int maxCount = 0;
        int left = 0;
        int result = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            count[currentChar - 'A']++;
            maxCount = Math.max(maxCount, count[currentChar - 'A']);

            while (right - left + 1 - maxCount > k) {
                char leftChar = s.charAt(left);
                count[leftChar - 'A']--;
                left++;
            }

            result = Math.max(result, right - left + 1);
        }

        return result;
    }
    public static void main(String[] args) {
        longestrepeatingcharacter solution = new longestrepeatingcharacter();
        String s = "AABABBA";
        int k = 1;
        int result = solution.characterReplacement(s, k);
        System.out.println("Longest repeating character replacement: " + result);
    }
}