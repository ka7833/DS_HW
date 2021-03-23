package day2Class;

import java.util.Arrays;
import java.util.Collections;

public class DS_HW {

	public static void main(String[] args) {

	    int[] numberArray = {1, 2, 3 ,4, 5};
	    int sum = 0;
	    for(int number: numberArray) {
	    	sum+= number;
	    }
	     System.out.println(sum);
		
	    double[] exampleArray = {1, 5, 6, 5, 4, 1};

            double maximum = exampleArray[0];

        int index = 0;

        for (int i = 1; i<exampleArray.length; i++){

             if (exampleArray[ i ] > maximum) { 

                  maximum = exampleArray[ i ];

                  index = i;
             }
        }

        System.out.println(index);
        
        int[] arr = toPower(4, 2);
        System.out.println(Arrays.toString(arr));
	}
	
	public static int[] toPower(int size, int power) {
		
		int[] myArray = new int[size];
		for(int i = 0; i < size; i++) {
			myArray[i] = (int)Math.pow(i, power);
		}

		return myArray;
	}
}
