package com.shristi.arrays;

public class OneDimArray {
	public static void main(String[] args) {
	
		int[] nums = new int[4];
		System.out.println(nums.length);
		//populate
		nums[0]=90;
		nums[1]=80;
		nums[2]=40;
		nums[3]=50;
//		nums[4]=60;   // ArrayIndexOutOfBoundsException
		
		System.out.println(nums[0]);
		
		
		System.out.println("Printing values");
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		// find the sum
		System.out.println("Finding sum");
		int sum = 0;
		for(int i=0;i<nums.length;i++) {
			sum=sum+nums[i];
			System.out.println(sum);
			  //0+90
			 //90+80 = 170
			//170+40 =210
			//210+50 =260
		}
		System.out.println("Sum "+sum);
		
		sum = 0;
		//using for each
		System.out.println("printing sum");
		
		// print the square of each number val*val 
        for(int val:nums)
//        	sum = sum+val;
        	sum+=val;
		System.out.println(sum);
		
		// create another array of names of size 3
		// iterate and print the names in upper case
		// do this in a separate file -  StringArrDemo
		
	}

}







