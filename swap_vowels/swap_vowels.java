public class swap_vowels {
    public static void main(String[] args) {
	 String str = "Leetcode";
	 String ans = find_answer(str);
	 System.out.println(ans);
	}
	public static String find_answer(String str){
	    char[] ch = str.toCharArray();
	    int i =0;
	    int j = ch.length-1;
	    while(j>i){
	        // no we have to check wheatere ch[i] is vowel or not then for ch[j]
	        if(!not_vowel(ch[i])){
	            i++;
	        }
	        if(!not_vowel(ch[j])){
	            j--;
	        }
	        
	        if(not_vowel(ch[i]) && not_vowel(ch[j])){
	            char temp = ch[i];
	            ch[i]= ch[j];
	            ch[j]=temp;
	            i++;
	            j--;
	        }
	    }
	    return new String(ch);
	    
	}
	public static boolean not_vowel(Character s){
	    if(s=='a'|| s=='e'|| s=='i' || s=='o' || s=='u' || s=='A' || s=='E' || s=='I' || s=='O' || s=='U'){
	        return true;
	    }
	    return false;
	}
    
}
