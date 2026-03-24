import java.util.Arrays;
public class SortedSquares{
    public int[] main(int[] nums){
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        SortedSquares sortedSquares = new SortedSquares();
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = sortedSquares.main(nums);
        System.out.println(Arrays.toString(result));
    }
}