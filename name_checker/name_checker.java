package name_checker;
import java.util.*;

public class name_checker {
    // i am run on on online java compiler
       public static void main(String[] args) {
        // in this we pass the fuction name condtion is that if there is a middle present then give firt name first later and middle first later and write complet last name if present
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = find_answer(str);
          System.out.println(ans);
    }
    public static String find_answer(String str){
        StringBuilder stringBuilder= new StringBuilder();
        String[] ans = str.trim().split("\\s+");
        if(str.length()==0 || str.isEmpty()){
            return null;
        }
          // here i pass first character
          // means all first name second and third name is present
        if(ans.length==3){
             stringBuilder.append(ans[0].charAt(0));
            stringBuilder.append('.');
            stringBuilder.append(ans[2].charAt(0));
             stringBuilder.append('.');
             stringBuilder.append(ans[2]);

        }
        if(ans.length==2){
            stringBuilder.append(ans[0].charAt(0));
            stringBuilder.append('.');
            stringBuilder.append(ans[1]);

        }
        else if(ans.length==1){
           stringBuilder.append(ans[0].charAt(0));
           stringBuilder.append('.');
        }
        else{
            System.out.println("you pass something wrong");
        }

        return stringBuilder.toString();

    }
    
}
