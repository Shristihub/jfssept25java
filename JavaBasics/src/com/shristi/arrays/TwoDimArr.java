package com.shristi.arrays;

public class TwoDimArr {

	public static void main(String[] args) {
		int[][] nums = new int[3][4];
		nums[0][0] = 1;
		nums[0][1] = 2;
		nums[0][2] = 3;
		nums[0][3] = 4;

		nums[1][0] = 5;
		nums[1][1] = 6;
		nums[1][2] = 7;
		nums[1][3] = 8;

		nums[2][0] = 9;
		nums[2][1] = 10;
		nums[2][2] = 11;
		nums[2][3] = 12;

		for (int i = 0; i < nums.length; i++) {
			// iterate through each row
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			// comes out after completing this row
			System.out.println();

		}
		
		for (int[] onearr : nums) {
			for (int val : onearr)
				System.out.println(Math.pow(val,2));
		}

	}
}
