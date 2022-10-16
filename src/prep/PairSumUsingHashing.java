package prep;

import java.util.HashMap;
import java.util.Map;

public class PairSumUsingHashing {
	
	
	
	public static void findPair(int[]nums,int target)
	
	{
		//create an empty hashmap
		
		Map<Integer,Integer> map=new HashMap<>();
		
		for (int i=0;i<nums.length;i++ ) {
			
			
			//check if a pair (nums[i],target-nums[i] exists
			//if the difference is seen before print the pair
			
			if (map.containsKey(target-nums[i])) {
				System.out.printf("Pair found (%d, %d))",nums[map.get(target-nums[i])],nums[i]);
			return;
			}
			
			//store index of current element in the map
			map.put(nums[i],i);
		}
		//we reach here if pair not found
		System.out.println("Pair not found");
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int []nums = {8,7,2,5,3,1};
	int target =31;
	findPair(nums,target);
	}

}
