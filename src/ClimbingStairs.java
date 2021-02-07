
public class ClimbingStairs {
	
	public int climbStairs(int n) {
	      
	      //fibonacci sequence; 
	        int second=1;
	        int now=1;
	            
	        while(n>1){
	            int temp=now;
	            now =now+second;
	            second=temp;
	            n--;
	        }
	     return now;
	    }
	}


