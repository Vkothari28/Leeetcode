
public class rotateString {
	 public boolean rotateString(String A, String B) {
	        if(A.length()<=1 &&!A.equals(B)){return false;}
	    
	        String Astart=A;
	        if(A.equals(B)){
	            return true;
	        }
	      
	        while(!A.equals(B)){
	            A=A.substring(1,A.length())+A.charAt(0);
	            if(A.equals(Astart)){
	                return false;
	            }
	        }
	    
	    return true;
	}
	}


