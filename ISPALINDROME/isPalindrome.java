import java.util.Scanner;
public class isPalindrome{
    public boolean IsPalindrome(int x){
        if(x <  0 ) {
            return false;
        }
        int original = x;
        int reverse = 0;
        while(x != 0){
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x /= 10;
        }
        // if(original ==  reverse){
        //     System.out.println("the number is palindrome");
        // }else if(original != reverse){
        //     System.out.println("the number is not a palindrome");
        // }
        return original == reverse;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        isPalindrome check = new isPalindrome();
        boolean result = check.IsPalindrome(num);
        System.out.println("Is the number a palindrome? " + result);
        sc.close();
    }
    
}