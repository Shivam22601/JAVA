import java.util.*;
public class Plusone{
 public static void main(String args[]){
    System.out.println("Enter the number of digits in array");
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[sc.nextInt()];
    System.out.println("Enter the digits in array");
    for(int i = 0 ;i < arr.length ; i++){
        arr[i] = sc.nextInt();
    }
    Plusone obj = new Plusone();
    int[] result = obj.Plusone(arr);
    System.out.println("The result is : ");
    for(int i = 0 ;i < result.length ; i++){
        System.out.print(result[i] + " ");
    }   
 }
 public int[] Plusone(int[] arr){
    for(int i = arr.length - 1; i>= 0; i--){
        if(arr[i] < 9){
            arr[i] = arr[i] + 1;
            return arr;
        }
        else{
            arr[i] = 0;
        }
    }

    int[] result = new int[arr.length + 1];
    result[0] = 1;
    return result;
 }

}
