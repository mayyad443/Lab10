package lab10;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public testSelectionSort() {
    }

    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;


       int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

		testSelectionSort temp1 = new testSelectionSort();
		@SuppressWarnings("unused")
		int maxValue = temp1.testSelectionSort(Sortedarr);
		Object maxValue1 = 10;
		Assert.assertSame(10, maxValue1);
		Assert.assertSame(10, maxValue1);
    }


	private int testSelectionSort(int[] sortedarr) {
		// TODO Auto-generated method stub
		return 0;
	}
@Test
	public void testNegative(){
		        int[] arr = new int[5];
		        arr[0] = -8;
		        arr[1] = -9;
		        arr[2] = -7;
		        arr[3] = -10;
		        arr[4] = -2;


		       int[] Sortedarr = new int[5];
		        Sortedarr[0] = -2;
		        Sortedarr[1] = -7;
		        Sortedarr[2] = -8;
		        Sortedarr[3] = -9;
		        Sortedarr[4] = -10;

				testSelectionSort temp1 = new testSelectionSort();
				@SuppressWarnings("unused")
				int maxValue = temp1.testSelectionSort(Sortedarr);
				Object maxValue2 = -2;
				Assert.assertSame(-2, maxValue2);
				Assert.assertSame(-2, maxValue2);
		    }
        /** Test data contains negative values only **/

    @Test
    public void testMixed(){

    	        int[] arr = new int[5];
    	        arr[0] = 5;
    	        arr[1] = 0;
    	        arr[2] = -5;
    	        arr[3] = 9;
    	        arr[4] = -1;


    	       int[] Sortedarr = new int[5];
    	        Sortedarr[0] = -5;
    	        Sortedarr[1] = -1;
    	        Sortedarr[2] = 0;
    	        Sortedarr[3] = 5;
    	        Sortedarr[4] = 9;

    			testSelectionSort temp1 = new testSelectionSort();
    			@SuppressWarnings("unused")
				int maxValue = temp1.testSelectionSort(Sortedarr);
    			Object maxValue2 = 9;
    			Assert.assertSame(9, maxValue2);
    			Assert.assertSame(9, maxValue2);
    	    }
        /** Test data contains with both positive, negative and zeros **/
    @Test
    public void testDuplicates(){

    	        int[] arr = new int[5];
    	        arr[0] = 0;
    	        arr[1] = 9;
    	        arr[2] = 11;
    	        arr[3] = 0;
    	        arr[4] = 9;


    	       int[] Sortedarr = new int[5];
    	        Sortedarr[0] = 0;
    	        Sortedarr[1] = 0;
    	        Sortedarr[2] = 9;
    	        Sortedarr[3] = 9;
    	        Sortedarr[4] = 11;

    			testSelectionSort temp1 = new testSelectionSort();
    			@SuppressWarnings("unused")
				int maxValue = temp1.testSelectionSort(Sortedarr);
    			Object maxValue3 = 11;
    			Assert.assertSame(11, maxValue3);
    			Assert.assertSame(11, maxValue3);
    	    }
        /** Test data contains duplicates **/
    }
