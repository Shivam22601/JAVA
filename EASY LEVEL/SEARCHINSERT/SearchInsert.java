import java.util.Scanner;
public class SearchInsert{
    public int SearchInsert(int[]nums, int target){
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args){
        SearchInsert searchInsert = new SearchInsert();
        System.out.println("enter the number of elements in the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("enter the elements in the array");
        for(int i= 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("enter the target element");
        int target = sc.nextInt();
        int result = searchInsert.SearchInsert(nums, target);
        System.out.println("the target element is at index: " + result);
    }
}