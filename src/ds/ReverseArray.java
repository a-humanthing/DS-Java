package ds;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size = in.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements:");
		for(int i = 0;i<size;i++) {
			arr[i]=in.nextInt();
		}
		System.out.println("Displaying Enterd Array");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		};
		System.out.println("Reversed Array:");
		int start=0;
		int end = size-1;
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
