package arraysapi;

import java.util.Arrays;

public class ArraysAPI {

    /**
     * 10 Points - Creates a new array of type int with size newSize. Then, loops
     * through oldArr, copying elements into the newArr. You can assume that the
     * size of newArr is same size or bigger than size of OldArr. If the newSize
     * is bigger than the size of oldArr then the extra values can be left to their
     * initial value. YOU ARE NOT ALLOWED TO USE ANY JAVA PROVIDED ARRAY COPY
     * METHODS
     * You can assume oldArr is already created and initialized.
     * @param oldArr reference to old array
     * @param newSize size of the new array to be created
     * @return
     */
    public static int[] arrayResizeAndCopy(int[] oldArr, int newSize) {
        int[] newArr = new int[newSize];
        /*********YOUR CODE STARTS HERE*******/
     
	for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }	
		
		
        /********YOUR CODE STOPS HERE*********/
        return newArr;
    }

    /**
     *  **** EXTRA CREDIT 10 POINTS **** Given a 1D array of integers, reverse
     * the array so that the last elements becomes the first, the n-1 element
     * becomes the second element, the n-2 element becomes the third, and so
     * on. YOU ARE NOT ALLOWED TO USE ANY JAVA PROVIDED ARRAY REVERSAL METHODS
     * HINT: You will need a temp variable for swapping elements in the array so
     * you do not overwrite values.
	 * You can assume arr is already created and initialized.
     *
     * @param arr
     */
    public static void arrayReversal(int[] arr) {
        int temp;
        /*********YOUR CODE STARTS HERE*******/
       for (int i = 0; i < arr.length / 2; i++){
           int tempo = arr[i];
           arr[i] = arr[arr.length - i -1];
           arr[arr.length - i -1] = tempo;
       }
        /********YOUR CODE STOPS HERE*********/
    }

    /**
     * 10 Points - Given two arrays, determine if the two arrays are equal. For
     * two arrays to be equal, they must contain the same elements at the same
     * indices. For example, {1,2,3,4,5} and {1,2,3,4,5} are equal, but
     * {3,2,1,4,5} and {1,2,3,4,5} are not even though they contain the same
     * elements, some elements are in different indices. Hint: arrays of
     * different length are automatically not equal. The isEqual boolean variable
	 * is used to determine if two arrays are equal. Once you find that two arrays are
	 * unequal simply flip the variable to false and break.
     * You can assume arr1 and arr2 are already created and initialized.
     * @param arr1
     * @param arr2
     * @return
     */
    public static boolean arraysAreEqual(int[] arr1, int[] arr2) {
        boolean isEqual = true;
        /*********YOUR CODE STARTS HERE*******/
     for(int i =0; i<arr1.length;i++){
		if(arr1[i]!=arr2[i])
                isEqual=false;
     }
		
		
        /********YOUR CODE STOPS HERE*********/
        return isEqual;
    }

    /**
     * 10 Points -  Given an array of integers, find the last occurrence of the smallest
     * element in array arr. For example, if we have an array with the following
     * values : { 1,3,4,5,6,1,56,6,1} has length 9. Our smallest element is 1
     * and its last occurrence is idx = 8
     * You can assume arr is already created and initialized.
     * @param arr
     * @return
     */
    public static int findLastMinArray(int[] arr) {
        int min = arr[0];
        int idx = 0;
        /*********YOUR CODE STARTS HERE*******/
       for (int i = 1; i < arr.length;i++) {
           if(arr[i] < min) {
               min = arr[i];
               idx = i;
           }
       }
          
      
        
		
		
        /********YOUR CODE STOPS HERE*********/
        return idx;
    }

    /**
     * 10 Points - Given a 2D array of integers, compute the sum of each row.
     * Store the sums of each row into an 1D array. The sum of row 0 in arr will be
     * stored in rowSum[0], and then the sum of row i will be stored in
     * rowSum[i].
     * You can assume arr is already created and initialized.
     * @param arr
     * @return
     */
    public static int[] arrayRowSum(int[][] arr) {
        int[] rowSum = new int[arr.length];
        
        /*********YOUR CODE STARTS HERE*******/
      double sum;
      for (int i = 0; i <arr.length;i++){
          sum = 0;
          for (int row =0; row < arr[i].length;row++){
              sum = sum +arr[i][row];
              
          }
      }
      
    
      
          
      
            
        
       
       
        
        
        
        
        /********YOUR CODE STOPS HERE*********/
        return rowSum;
    }
    /* ~~~~~~~~~ DO NOT EDIT ANY CODE PAST THIS POINT ~~~~~~~~~~~~~~~~*/

    public static void main(String[] args) {
        /* TEST ARRAY SIZR AND COPY    */
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr2 = arrayResizeAndCopy(arr, 10);
        boolean testPass = true;
        for (int i = 0; i < arr2.length; i++) {
            if (i < arr.length) {
                if (arr[i] != arr2[i]) {
                    testPass = false;
                    break;
                }
            } else {
                if (arr2[i] != 0) {
                    testPass = false;
                    break;
                }
            }
        }
        System.out.println("Array Resize And Copy Test          : " + (testPass ? "PASS" : "FAILED"));
        /* TEST ARRAY REVERSAL         */
        testPass = true;
        int[] arr3 = {1, 2, 3, 4, 5, 6};
        int[] arr4 = {6, 5, 4, 3, 2, 1};
        arrayReversal(arr4);
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] != arr4[i]) {
                testPass = false;
                break;
            }
        }
        System.out.println("Array Reversal                      : " + (testPass ? "PASS" : "FAILED"));
        /* TEST ARRAYS ARE EQUAL       */
        testPass = true;
        int[] arr5 = {1, 2, 3, 4, 5, 6};
        int[] arr6 = {1, 2, 3, 4, 5, 6};
        int[] arr7 = {1, 4, 3, 2, 5, 6};
        System.out.println("Array Are Equal Test 1              : " + (arraysAreEqual(arr6, arr5) ? "PASS" : "FAILED"));
        System.out.println("Array Are Equal Test 2(should Fail) : " + (arraysAreEqual(arr6, arr7) ? "PASS" : "FAILED"));
        /* TEST FIND LAST OCCURING MIN */
        testPass = true;
        int[] arr8 = {1, 4, 3, 2, 5, 6, 2, 4, 5, 23, 2, 2, 4, 1, 32, 4, 23, 5};
        int minIdx = findLastMinArray(arr8);
        System.out.println("Find last Occurrence of Min value    : " + ((minIdx == 13) ? "PASS" : "FAILED"));
        /* TEST ARRAY ROW SUM          */
        testPass = true;
        int[][] arr9 = {{5, 6, 2, 5, 3, 9, 3},
        {5, 23, 2, 5, 2, 9, 3},
        {5, 6, 4, 5, 10, 9, 3},
        {5, 2, 1, 2, 2, 9, 1}};
        int[] sums = arrayRowSum(arr9);
        int[] expectedSums = {33, 49, 42, 22};
        for (int i = 0; i < sums.length; i++) {
            if (sums[i] != expectedSums[i]) {
                testPass = false;
                break;
            }
        }
        System.out.println("Array Row Sums                      : " + ((testPass) ? "PASS" : "FAILED"));
    }

}
