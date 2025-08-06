import java.util.*;
public class pascal_triangle {
    public static void main(String[] args) {
        //List<List<Integer>> ans = new ArrayList<>();
        int n = 5;
         List<List<Integer>> ans = find_answer(n);
         for(List<Integer> l : ans){
            System.out.println(" ");
            for(int i : l){
                System.out.print(i);
            }
         }
    }
    public static List<List<Integer>> find_answer(int n){
        List<List<Integer>> answer = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }
                else{
                    int val = answer.get(i-1).get(j)+answer.get(i-1).get(j-1);
                    row.add(val);
                }
            }
            answer.add(row);
        }
        return answer;
    }
    
}
