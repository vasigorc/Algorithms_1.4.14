package ca.vgorcinschi.algorithms_1_4_14;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		In in = new In(args[0]);
		int[] whiteList = in.readAllInts();
		Arrays.sort(whiteList);

		while (!StdIn.isEmpty()) {// Read key, print if not in whitelist.
			int key = StdIn.readInt();
			if (rank(key, whiteList) == -1) {
				StdOut.println(key);
			}
		}
	}

	@Deprecated
	public static int rank(int key, int[] a) {//Array must be sorted
		return indexOf(a, key);
	}
	
	public static int indexOf(int[]a, int key) {
		int lo = 0;
		int hi = a.length - 1;
		while(lo <= hi){//Key is in a[lo..hi] or not present
			int mid = lo +(hi-lo) / 2;
			while((mid-1)>0 && a[mid-1]==a[mid]){
				mid = mid-1;
			}
			if(key < a[mid]) hi = mid -1;
			else if(key > a[mid]) lo = mid+1;
			else return mid;
		}
		return -1;		
	}
}