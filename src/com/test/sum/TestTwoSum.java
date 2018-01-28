package com.test.sum;

import java.util.HashMap;

public class TestTwoSum {

	public static void main(String[] args) {
		int[] numbers = { 1,3,5,2,2,7 };
		int target = 9;
		int[] tmp = twoSum(numbers, target);
		for (int i : tmp)
			System.out.println(i);
		int[] tmp1 = twoSum1(numbers, target);
		for (int i : tmp1)
			System.out.println(i);
	}

	public static int[] twoSum(int[] nums, int target) {
		if (nums == null || nums.length < 2)
			return new int[] { 0, 0 };

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				return new int[] { map.get(nums[i]), i };
			} else {
				map.put(target - nums[i], i);
			}
		}
		return new int[] { 0, 0 };
	}
	
	public static int[] twoSum1(int[] nums, int target){
		for(int i=0;i<nums.length;i++){
			for(int j=i+1;j<nums.length;j++){
				int tmp = nums[i]+nums[j];
				if(tmp == target){
					return new int[]{i,j};
				}
			}
		}
		return new int[] { 0, 0 };
	}
}
