
public class texterTwo {
	
	public static void main (String[] args) 
	{
		
		int num = 1;
		int [] arr = {1, 2, 3, 4, 5};
		mystery(0, arr.length - 1, num);
	}
	
	public static int[] arr;
	  /** Precondition: arr contains no duplicates;
	   *                the elements in arr are in sorted order.
	   * @param low 0 ≤ low ≤ arr.length
	   * @param high low - 1 ≤ high < arr.length
	   * @param num
	   */
	  public static int mystery(int low, int high, int num)
	  {
	    int mid = (low + high) / 2;
	    if (low > high)
	    {
	      return low;
	    }
	    else if (arr[mid] < num)
	    {
	      return mystery(mid + 1, high, num);
	    }
	    else if (arr[mid] > num)
	    {
	      return mystery(low, mid - 1, num);
	    }
	    else      // arr[mid] == num
	    {
	      return mid;
	    }
	  }

}
