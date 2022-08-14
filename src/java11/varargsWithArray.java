package java11;
import java.util.ArrayList;
import java.util.Arrays;

public class varargsWithArray {
	

	    /*
	     * Accepts variable number of arguments and calculate sum of all the
	     * elements passed.
	     */
	    int calculateSum(Integer... nums) {
	        int sum = 0;
	        for (int num : nums) {
	            sum = sum + num;
	        }
	        return sum;
	    }
	    public static void main(String[] args) {
	    	varargsWithArray ex = new varargsWithArray();
	        Integer[] arr = { 1, 3, 5, 7, 9 };
	        ArrayList<Integer> listofInts = new ArrayList<>(Arrays.asList(arr));
	        System.out.println(listofInts);//[1, 3, 5, 7, 9]
	        // Compile Error
	        // Can not pass arraylist to varargs directly
	        // int sum = ex.calculateSum(listofInts);
	        // Lets convert the arraylist to array and pass it to
	        // function accepting varargs.
	        //int tsum = ex.calculateSum(listofInts.toArray(new Integer[0]));
	        int tsum = ex.calculateSum(listofInts.toArray(arr));//25

	        System.out.println(tsum);
	    }
	}

