public class find_encoded_code {
    public static void main(String[] args) {
        int[] arr ={7,6,8,16,12,3};
        int[] find = find_answer(arr);
        // over output should be {2,5,1,7,9};
    }
    public static int[] find_answer(int[] arr){
        int[] ans = new int[arr.length];
        ans[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-1;i>=0;i--){
           ans[i]= arr[i]-ans[i+1];
        }
        return ans;
    }
    
}
