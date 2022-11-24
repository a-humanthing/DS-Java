package ds;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		int [] a = {1,3,4,6,7,20};
		System.out.println("Enter the target to found:");
		Scanner in = new Scanner(System.in);
		int target=in.nextInt();
		int pos = search(target,a);
		if(pos<0) {
			System.out.println("Target NOt Found");
		}
		else {
			
			System.out.println(a[pos]+" found at"+pos+1);
		}
	}
	static int search(int target,int [] a) {
		
		int mid,start=0,end=a.length-1;
		while(start<=end) {
			mid=start+(end-start)/2;
			if(a[mid]>target) {
				end=mid-1;
			}
			else if(a[mid]<target) {
				start=mid+1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
}
