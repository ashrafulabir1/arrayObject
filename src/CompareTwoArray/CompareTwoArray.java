package CompareTwoArray;

//With no loop

public class CompareTwoArray {
	
 static void compareTwoArrayMethod() {
	int[] Array1 = {1,2,5};
	int[] Array2 = {3,5,6};

	//checking Array1 index 1 with all Array2 index
	if(Array1[0]==Array2[0]) {
		System.out.println("Array1[0]==Array2[0]"+Array1[0]);
	}
	else 
		System.out.println("Array1[0]!=Array2[0]"+Array1[0]);
	
	if(Array1[0]==Array2[1]) {
		System.out.println("Array1[0]==Array2[1]"+Array1[0]);
	}
	else 
		System.out.println("(Array1[0]!=Array2[1]"+Array1[0]);
	
	if(Array1[0]==Array2[2]) {
		System.out.println("Array1[0]==Array2[2]"+Array1[0]);
	}
	else 
		System.out.println("Array1[0]!=Array2[2]"+Array1[0]);
	
	
	//checking Array1 index 2 with all Array2 index
	if(Array1[1]==Array2[0]) {
		System.out.println("Array1[1]==Array2[0]"+Array1[1]);
	}
	else {
		System.out.println("Array1[1]!=Array2[0]"+Array1[1]);
	}
	if(Array1[1]==Array2[1]) {
		System.out.println("Array1[1]==Array2[1]"+Array1[1]);
	}
	else {
		System.out.println("Array1[1]!=Array2[1]"+Array1[1]);
	}
	if(Array1[1]==Array2[2]) {
		System.out.println("Array1[1]==Array2[2]"+Array1[1]);
	}
	else 
		System.out.println("Array1[1]!=Array2[2]"+Array1[1]);
	
	//checking Array1 index 3 with all Array2 index
	if(Array1[2]==Array2[0]) {
		System.out.println("Array1[2]==Array2[0]"+Array1[2]);
	}
	else 
		System.out.println("Array1[2]!=Array2[0]"+Array1[2]);
	
	if(Array1[2]==Array2[1]) {
		System.out.println("Array1[2]==Array2[1]"+Array1[2]);
	}
	else 
		System.out.println("Array1[2]!=Array2[1]"+Array1[2]);
	
	if(Array1[2]==Array2[2]) {
		System.out.println("Array1[2]==Array2[2]"+Array1[2]);
	}
	else 
		System.out.println("Array1[2]!=Array2[2]"+Array1[2]);
	
	
	 if((Array1[2]==Array2[0]) || (Array1[2]==Array2[1]) || (Array1[2]==Array2[2]) ) {
		 System.out.println("Available in both Array="+Array1[2]);
	 }
	 else
		 System.out.println("Not available in 2nd Array="+Array1[2]);
  }
 
}
