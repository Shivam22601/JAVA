import java.util.Scanner;
public class FirstUniqueChar{
    public int firstuniquechar(String s){
        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }
        for(int i =0; i<s.length(); i++){
            if(freq[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        FirstUniqueChar fuc = new FirstUniqueChar();
        System.out.println("Enter a string:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int result = fuc.firstuniquechar(input);
        if(result != -1){
            System.out.println("The first unique character is at index: " + result);
        } else {
            System.out.println("No unique character found.");
        }
    }
}