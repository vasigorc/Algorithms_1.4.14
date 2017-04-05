package ca.vgorcinschi.algorithms_1_4_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author vgorcinschi
 *
 */
public class ClassicSolution {

	/**
	 * @param target - what the four integers 
	 * should sum-up together to(typically 0)
	 */
	public static List<List<Integer>> fourSum(int[] nums, int target){
		
		List<List<Integer>> result = new ArrayList();
		
		//if there is no array or if it is smaller then 4
		if(nums == null || nums.length < 4){
			return result;
		}		
		Arrays.sort(nums);
		
		//outer loop
		for (int i = 0; i < nums.length-3; i++) {
			/*
			 * if current int is same as previous
			 * skip the iteration
			 */
			if(i != 0 && nums[i] == nums[i-1]) continue;
			//first inner loop
			for(int j=i+1; j<nums.length-2; j++){
				/*
				 * if not the first iteration or 
				 * f current int is the same as previous
				 * skip the iteration
				 */
				if(j != i+1 && nums[j] == nums[j-1])
					continue;
				int k = j+1; //current inner loop index + 1
				int l = nums.length-1; //last index of the passed-in array
				
				/*
				 * main logic starts here:
				 * increment k until it hits the end of the array
				 * remember when we finish we will repeat everything with
				 * k+1 on next iteration
				 */
				while(k < l){
					/*
					 * if current indexes less then target -> 
					 * increment k
					 */
					if(nums[i]+nums[j]+nums[k]+nums[l] < target){
						k++;
					} else if(nums[i]+nums[j]+nums[k]+nums[l] > target){
						//if greater then target - decrement l
						l--;
					} else{
						/*
						 * save numbers at current indices
						 * to a new list -> result list
						 */
						List<Integer> t = new ArrayList();
						t.addAll(Arrays.asList(nums[i],nums[j]
								,nums[k],nums[l]));
						result.add(t);
						k++;
						l--;
						 
						while(k<l && nums[l] == nums[l+1]){
							l--;
						}
						
						while(k<l && nums[k] == nums[k-1]){
							k++;
						}
					}
				}
			}
			
		}
		return result;
	}
}
