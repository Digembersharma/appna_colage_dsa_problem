import java.util.*;
public class find_stiring_sum {
    public static void main(String[] args) {
        String input1 ="12345";
        String input2 = "23456";
        String ans = find_answer(input1,input2);
        System.out.println(ans);
    }
    public static String find_answer(String input1,String input2){
        StringBuilder str = new StringBuilder();
        int i=input1.length()-1;
        int j = input2.length()-1;
        // now think about the code in the comming state 
        int carry =0;
        while(i>=0 || j>=0 || carry>0){
            int x = (i>=0)?input1.charAt(i)-'0':0;
            int y = (j>=0)?input2.charAt(j)-'0':0;
            int ans = x+y+carry;
            str.append(ans%10);
            carry = ans/10;
        }
        return str.reverse().toString();
    }
    
}
