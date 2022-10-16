package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class TwoSum {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] nums = {-2,3,7,4,8};
int target=11;
TwoSum twosum=new TwoSum();
System.out.println(Arrays.toString(twosum.twoSumWithHM(nums, target)));
	}
	
public static int[] twoSum(int[] nums,int target) {
		
		
		for(int i=0;i<nums.length;i++) {
			for (int j=i+1;j<nums.length;j++) {
				if (nums[i]+nums[j]==target) {
					return new int[] {i,j};
				}
			}
		}
		throw new IllegalArgumentException("No such numbers found");
		
		
	}

public int[] twoSumWithHM(int[] nums, int target){
	
	Map<Integer,Integer>input =new HashMap<Integer,Integer>();
	
	for(int i=0;i<nums.length;i++) {
		int secondNumber=target-nums[i];
		if(input.containsKey(secondNumber)) {
			return new int[] {input.get(secondNumber),i};
		}
		input.put(nums[i], i);
	}
	throw new IllegalArgumentException("No such numbers found");
}

}
