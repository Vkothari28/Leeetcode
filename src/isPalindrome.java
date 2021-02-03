
public class isPalindrome {
	 public boolean isPalindrome(int x) {
	        
	        if(x<0){
	            return false;
	        }
	        
	    String f= Integer.toString(x);        
	    for(int i=0;i<f.length();i++){
	        if (f.charAt(i)!=f.charAt(f.length()-1-i)){
	            return false;
	        }
	    }
	        
	        return true;
	    }
	}

