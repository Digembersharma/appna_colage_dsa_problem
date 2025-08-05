import java.util.*;
public class contains_water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
           arr[i] = sc.nextInt();
        }
        int ans = find_answer(arr);
        System.out.println(ans);
    }
    public static int find_answer(int[] arr){
	    
	    // in havve to move only one poinnter my condition is if arr[i]<arr[j] i++ else j--
	    int i=0;
	    int j=arr.length-1;
	    int max = Integer.MIN_VALUE;
	    int min = Integer.MAX_VALUE;
	     
	       
	    while(i<j){
	          min = Math.min(arr[i],arr[j]);
	         max = Math.max(max,min*(j-i));
	         
	         if(arr[i]<arr[j]){
	             i++;
	         }
	       else{
	           j--;
	       }
	       
	    }
	    return max;
	}
}
