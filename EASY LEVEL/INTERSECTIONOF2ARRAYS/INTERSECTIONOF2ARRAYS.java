import java.util.*;
public class INTERSECTIONOF2ARRAYS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the first array:");
        int size1 = sc.nextInt();
        int[] nums1 = new int[size1];

        System.out.println("Enter the elements of the first array:");
        for(int i =0; i<size1 ; i++){
            nums1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of the second array:");
        int size2 = sc.nextInt();
        int[] nums2 = new int[size2];

        System.out.println("Enter the elements of the second array:");
        for(int i =0; i<size2 ; i++){
            nums2[i] = sc.nextInt();
        }

        //solution
        Solution obj = new Solution();
        int[] result = obj.intersection(nums1, nums2);
         System.out.print("Intersection of arrays: ");
        for (int num : result) {
            System.out.print(num + " ");
    }
    sc.close();
}
}
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            if (set.contains(num)) {
                resultSet.add(num);
            }
        }
        int[] result = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
            result[index++] = num;
        }
        return result;
    }
}