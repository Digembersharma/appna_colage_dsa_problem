import java.util.*;
public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = find_answer(arr);
        System.out.println(ans);
    }
    public static int find_answer(int[] arr){
        int max =0;
        int max2 = Integer.MIN_VALUE;
        int ans =0;
        for(int i=0;i<arr.length;i++){
             ans = ans+arr[i];

           max = Math.max(max+arr[i],arr[i]);
           max2 = Math.max(max,max2);

        }
        return max2;
    }
}
