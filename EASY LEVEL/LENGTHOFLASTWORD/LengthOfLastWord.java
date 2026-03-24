public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (length > 0) {
                    break;
                }
            } else {
                length++;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        LengthOfLastWord solution = new LengthOfLastWord();
        String input = "Hello World";
        int result = solution.lengthOfLastWord(input);
        System.out.println("Length of the last word: " + result); // Output: 5
    }
}