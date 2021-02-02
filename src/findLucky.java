import java.util.Arrays;
import java.util.HashMap;

public class findLucky {
	
	public int findLucky(int[] arr) {
        Arrays.sort(arr);
        if(arr[0]==arr[arr.length-1]){
            if(arr.length==arr[0]){
                return arr[0];
            }
            return -1;
        }
        int returner=-1;
        
        HashMap<Integer,Integer>mymap= new HashMap<Integer,Integer>();
          for(int i=0;i<arr.length;i++){
           if(mymap.get(arr[i])==null){
               mymap.put(arr[i],1);
           }
           else{
               mymap.put(arr[i],mymap.get(arr[i])+1);
           }
       }
        
        for(int x:mymap.keySet()){
            if(mymap.get(x)==x){
                returner=mymap.get(x);
            }
        }
       
     return returner;
        
    }
}


