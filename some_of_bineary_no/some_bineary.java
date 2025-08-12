package some_of_bineary_no;
import java.util.*;

public class some_bineary {
      public static void main(String[] args) {
        String str ="111";
        String str2 ="001";
        String ans = find_answer(str,str2);
        System.out.println("the answer is "+ans);
    }
    public static String find_answer(String str, String str2){
        // how we can find sumisun how we can do this 000001010100+
        StringBuilder string  = new StringBuilder();
         int i=0;
         int j=0;
         int carry=0;
         int sum=0;

        while(i!=str.length() && j!=str2.length()){
            
                
                    sum = sum+str.charAt(i)-'0'+str2.charAt(j)-'0'+carry;
                    System.out.println(sum);
                    string.append(sum%2);
                    if(sum>1){
                    carry = sum/2;
                    }
                    sum=0;

                 
                 i++;
                 j++;
        }
       return string.toString(); 
    }
    
}
