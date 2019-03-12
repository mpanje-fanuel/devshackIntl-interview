/**
 * Created by fmpanje on 3/12/19
 */

public class WordDistanceCalc {

	/**
	 * Edit Distance
	 * Given two strings left and right and below operations that can performed on left. Find minimum number of edits
	 * (operations) required to convert left into right.
	 * Insert
	 * Remove
	 * Replace
	 * All of the above operations are of equal cost
	 *
	 * Examples:
	 * Input:   left = "devshack", right = "devshackIntl"
	 * Output:  4
	 * We can convert left into right by removing 'I', ‘n’, ‘t’, and ‘l’.
	 *
	 * Input:   left = "cat", right = "cut"
	 * Output:  1
	 * We can convert left into right by replacing 'a' with 'u'.
	 *
	 * Input:   left = "sunday", right = "saturday"
	 * Output:  3
	 * Last three and first characters are same.  We basically
	 * need to convert "un" to "atur".  This can be done using
	 * below three operations.
	 * Replace 'n' with 'r', insert t, insert a
	 *
	 * @param left string to be converted
	 * @param right control string
	 * @param lengthLeft length of string `left`
	 * @param lengthRight length of string `right`
	 * @return minimum number of edits required to convert `left` into `right`
	 */
	static int minDistance(String left, String right, int lengthLeft, int lengthRight) {
		//TODO: Make your changes here

		return 0;


	}

}
