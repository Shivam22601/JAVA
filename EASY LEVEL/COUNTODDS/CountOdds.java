import java.util.Scanner;
public class CountOdds{
    public int countOdds(int low, int high){
        int count = 0;
        for(int i= low ; i <= high ; i++){
            if(i % 2 != 0){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args){
        CountOdds countOdds = new CountOdds();
        System.out.println("Enter the low and high values:");
        Scanner scanner = new Scanner(System.in);
        int low ;
        int high;
        low = scanner.nextInt();
        high = scanner.nextInt();
        int result = countOdds.countOdds(low, high);
        System.out.println(result);
    }
}