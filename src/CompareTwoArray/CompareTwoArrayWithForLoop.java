package CompareTwoArray;

import java.util.ArrayList;
import java.util.List;

public class CompareTwoArrayWithForLoop {

	public static void compareTwoArrayForLoop() {
	//Compare first array with 2nd array
		int[] Array1 = {1,2,5,9,10,12,14,20};
	    int[] Array2 = {1,5,6,8,9,12,14,20,25};
	    boolean contains = false;
	    List<Integer> results1 = new ArrayList<Integer>();
	    List<Integer> results2 = new ArrayList<Integer>();
	    
	    for(int i=0;i<Array1.length;i++) {
	       for(int j=0;j<Array2.length;j++) {
	    	   if (Array1[i]==Array2[j]) {
	    		  System.out.println("Available in both Array"+Array1[i]);
	    		  contains =true;
	    		  break;
	    	   }
	       }
	  
	       if(!contains) {
	            results1.add(Array1[i]);
	        }
	        else{
	            contains = false;
	        }
	    }
	       System.out.println("Available in only first array="+results1);
	    
	       
	       for(int i=0;i<Array2.length;i++) {
		       for(int j=0;j<Array1.length;j++) {
		    	   if (Array2[i]==Array1[j]) {
		    		  contains =true;
		    		  break;
		    	   }
		       }
		  
		       if(!contains) {
		            results2.add(Array2[i]);
		        }
		        else{
		            contains = false;
		        }
		    }
		       System.out.println("Available in only 2nd array="+results2);
		       
	}
}
