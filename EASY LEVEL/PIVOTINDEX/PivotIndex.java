import java.util.Scanner;
public class PivotIndex{
    public int pivotIndex(int[] nums){
        int totalsum = 0;
        int leftsum = 0;
        for(int i = 0 ; i< nums.length; i++){
            totalsum += nums[i];
        }
        for(int i = 0 ; i< nums.length; i++){
            int rightsum = totalsum- nums[i] - leftsum;

            if(leftsum == rightsum){
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        PivotIndex pivoIndex = new PivotIndex();
        System.err.println("enter size of array : ");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] nums = new int[n];
        System.err.println("enter elements of array : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int result = pivoIndex.pivotIndex(nums);
        System.out.println("pivot index is : " + result);
    }
}