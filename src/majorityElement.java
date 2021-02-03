import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class majorityElement {
	
	 public List<Integer> majorityElement(int[] nums) {
	        Arrays.sort(nums);
	        List<Integer>fin= new ArrayList<Integer>();
	        for(int i=0;i<nums.length;){
	            int count=0;
	        for(int j=nums.length-1;j>=i;j--){
	            if(nums[i]==nums[j]){
	                count=j-i+1;
	                break;
	}
	        }
	            if(count>nums.length/3){
	                fin.add(nums[i]);
	            }
	            i+=count;
	        }
	        return fin;
	    }
	}


