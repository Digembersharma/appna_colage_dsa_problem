import java.util.*;
public class power_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double x = sc.nextInt();
         int n = sc.nextInt();
        double ans = find_answer(x,n);
        System.out.println(ans);
    }
    public static double find_answer(double x , int n){
        int bn = n;
        if(bn<0){
            x= 1/x;
            bn = -bn;
        }
        double ans =1;
        while(bn>0){
            if(bn%2==1){
                ans = ans*x;
            }
            x= x*x;
            bn = bn/2;
        }
        return ans; // in this question we know we have to conver into bineary 
    }
    
}
