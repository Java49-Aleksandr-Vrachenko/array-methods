package telran.arrays;

import java.util.Arrays;

public class MyArraysInt {
	public static int [] addNumber(int[] array, int num) {
		//TODO
		int[] ArrCopy = Arrays.copyOf(array, array.length + 1);
	    ArrCopy[ArrCopy.length - 1] = num;
		
	    return ArrCopy;
	}
	public static int[] removeNumber(int [] array, int index) {
		//TODO
		 if (index < 0 || index >= array.length) {
			 return array;
		 }
		 int[] ArrCopy = new int[array.length - 1];
		 System.arraycopy(array, 0, ArrCopy, 0, index);
		 System.arraycopy(array, index + 1, ArrCopy, index, array.length - index - 1);
		 
		return ArrCopy;
	}
	public static int[] insertNumber(int [] array, int index, int num) {
		//TODO
		  if (index < 0 || index > array.length) {
		        return array;
		    }
		   int[] ArrCopy = new int[array.length + 1];
		    System.arraycopy(array, 0, ArrCopy, 0, index);
		    ArrCopy[index] = num;
		    System.arraycopy(array, index, ArrCopy, index + 1, array.length - index);
		    return ArrCopy;
	}
}
