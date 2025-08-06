import java.util.*;
public class main {
    	public static void main(String[] args) {
		 int[]  arr = {3,4,5,6,9};
		 int[] ans = find_answer(arr);
		 for(int i=0;i<ans.length;i++){
		     System.out.print(ans[i]);
		 }
	}
	public static int[] find_answer(int[] arr){
	    int ans1=0;
	    ArrayList<Integer> list = new ArrayList<>();
	    for(int i=0;i<arr.length;i++){
	         
	        ans1 = ans1*10+arr[i];
	        
	        
	        
	    }
	    ans1 = ans1+1;
	    System.out.print(ans1+"///");
	    // think how to connvert 
	    int n = ans1;
	    while(n!=0){
	        int remender = n%10;
	        list.add(remender);
	        n = n/10;
	    }
	     
	    Collections.reverse(list);
	     
	    int[] answer = new int[list.size()];
	    int k=0;
	    for(int i : list){
	         
	        answer[k++]=i;
	    }
	    return answer;
	}
}
