package telran.arrays.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static telran.arrays.MyArraysInt.*;

class MyArraysIntTest {

	@Test
	void testAddNumber() {
		//TODO
		int array[] = {1, 2, 3, 4, 5};
		int expected1[] = {1, 2, 3, 4, 5, 6};
		int expected2[] = {1, 2, 3, 4, 5, 1};
		int expected3[] = {1, 2, 3, 4, 5, 0};
		
		assertArrayEquals(expected1,addNumber(array,6));
		assertArrayEquals(expected2,addNumber(array,1));
		assertArrayEquals(expected3,addNumber(array,0));
		
	}

	@Test
	void testRemoveNumber() {
		//TODO
		int[] array = {1, 2, 3, 4, 5};
        int[] expectedArray = {1, 2, 4, 5};
        int[] expectedArray1 = {2, 3, 4, 5};

        assertArrayEquals(expectedArray, removeNumber(array, 2));
        assertArrayEquals(array, removeNumber(array, -1));
        assertArrayEquals(array, removeNumber(array, array.length+1));
        assertArrayEquals(expectedArray1, removeNumber(array,0));
		
	}

	@Test
	void testInsertNumber() {
		//TODO
		int[] array = {1, 2, 3, 4, 5, 6};
        int[] expectedArray = {1, 2, 4, 5, 6};
        int[] expectedArray1 = {2, 3, 4, 5, 6};
        int[] expectedArray2 = {1, 2, 3, 4, 5};
        
        assertArrayEquals(array,insertNumber(expectedArray,2,3));
        assertArrayEquals(array,insertNumber(array, -1,3));
        assertArrayEquals(array,insertNumber(array, array.length+1,1));
        assertArrayEquals(array,insertNumber(expectedArray1,0,1));
        assertArrayEquals(array,insertNumber(expectedArray2,array.length - 1,6));
        
	}

}
