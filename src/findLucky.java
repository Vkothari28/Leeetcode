import java.util.Arrays;
import java.util.HashMap;

public class findLucky {
	
	public int findLucky(int[] arr) {
		  Arrays.sort(arr);
		    
	        
	        for(int i=arr.length-1;i>=0;){
	            for(int j=0;j<=i;j++){
	                
	                 if(arr[i]==arr[j]){
	                    if(arr[i]==i-j+1){
	                        return arr[i];
	                    }
	                           else{
	                        i=j-1;
	                        break;
	                    }
	                }
	            }
	        }
	        return -1;
	    }
	}

