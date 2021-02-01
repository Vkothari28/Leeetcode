
public class removeDuplicates {
	
	 public int removeDuplicates(int[] nums) {
	       int i=1;
	        int j=0;
	        // using j as an index
	        // if nums[i] does not equal that put the number right after the current non-duplicate
	        while(i<nums.length){
	            if(nums[i]!=nums[j]){
	                j++;
	            nums[j]=nums[i];
	            }
	         
	           
	            i++;
	        }
	        
	        return j+1;
	    }

}
