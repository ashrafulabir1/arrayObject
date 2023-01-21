package CompareTwoArray;
import java.util.Arrays;  
public class JointTwoArray {
	static void jointTwoArray() {
		
		int[] firstArray = {56,56,90,32,67,12}; //initialized array  
		int[] secondArray = {90,78,9,5,32,12,15};  
		int length = firstArray.length + secondArray.length; //add the length of firstArray into secondArray  
		int[] mergedArray = new int[length];    //resultant array  
		int pos = 0;  
		for (int element : firstArray) //copying elements of secondArray using for-each loop  
		{  
		mergedArray[pos] = element;  
		pos++;              //increases position by 1  
		}  
		for (int element : secondArray) //copying elements of firstArray using for-each loop  
		{  
		mergedArray[pos] = element;  
		pos++;  
		}  
		System.out.println(Arrays.toString(mergedArray));   //prints the resultant array    
    }
}
