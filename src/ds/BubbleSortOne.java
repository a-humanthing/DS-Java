package ds;

import java.util.Scanner;

public class BubbleSortOne {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] nums = new int[4];
		System.out.println("Enter Array:");
		for(int i=0;i<4;i++) {
			nums[i]=in.nextInt();
		}
		System.out.println("Entered Array:");
		for(int i=0;i<4;i++) {
			System.out.print(nums[i]+" ");
		}
		bSort(nums);
	}
	static void bSort(int [] nums) {
		int n=nums.length;
		for(int i=0;i<n;i++) {
			for(int j=1;j<n-i;j++) {
				if(nums[j-1]>nums[j]) {
					int temp=nums[j-1];
					nums[j-1]=nums[j];
					nums[j]=temp;
				}
			}
		}
		System.out.println("Sorted");
		for(int i=0;i<4;i++) {
			System.out.print(nums[i]+" ");
		}
	}
}
