import java.util.*;
public class subArraySum{
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
     int currsum = 0;
     int count = 0;
     for(int num : nums)   {
        currsum += num;
        if(map.containsKey(currsum-k)){
            count += map.get(currsum - k);
        }
        map.put(currsum, map.getOrDefault(currsum,0)+1);
     }
    return count;
    }

public static void main(String[] args){
    int[] nums = {1,2,3,4,7};
    int k = 7;
    subArraySum array  = new subArraySum();
    System.out.print(array.subarraySum(nums, k));
}
}