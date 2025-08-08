import java.util.*;
public class changing_character {
   public static void main(String[] args) {
	  String str = "mmmoonnus";
	  String t = "k";
	  String ans = find_answer(str,t);
	  System.out.print(ans);
	}
	public static String find_answer(String str , String t){
	    StringBuilder st = new StringBuilder();
	    HashMap<Character,Integer> hash = new HashMap<>();
	    char ans =' ';
	    for(int i=0;i<str.length();i++){
	        char ch = str.charAt(i);
	        hash.put(ch,hash.getOrDefault(ch,0)+1);
	    }
	    // now we have to find the maximum frequency StackTraceElement
	    int max =Integer.MIN_VALUE;
	        for(char c : hash.keySet()){
	         
	                max = Math.max(max,hash.get(c));
	                
	            
	        }
	        
	        for(char s: hash.keySet()){
	            if(hash.get(s)==max){
	                 
	                ans = s;
	                
	          }
	           
	            
	            
	        }
	    for(int i=0;i<str.length()-1;i++){
	        char ch = str.charAt(i);
	        
	        if(ch==ans){
	            st.append(t.charAt(0));
	        }
	        else if(ch!=ans){
	            st.append(ch);
	        }
	        
	    }
	    st.append(str.charAt(str.length()-1));
	    return st.toString();
	}
    
}
