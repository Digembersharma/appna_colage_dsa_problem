public class maximum_xor {
    public static void main(String[] args) {
        int[] arr ={5,28,34,12};
        int ans = find_answer(arr);
        System.out.println(ans);
    }
    public static int find_answer(int[] arr){
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int i=0;
        int j = i+1;
        while(i<arr.length-1){
            max = Math.max(max,arr[i]^arr[j]);
            max2 = Math.max(max,max2);
            j++;
            if(j==arr.length-1){
                i++;
                j=i+1;
            }
        }
        return max2;
    }
    
}
