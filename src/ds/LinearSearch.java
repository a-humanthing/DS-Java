package ds;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr= {2,3,5,2,1};
		int target =10;
		int pos = linearSearch(arr, target);
		System.out.println("index at:"+pos);
	}
	static int linearSearch(int[] arr,int target) {
		System.out.println("Array length="+arr.length);
		for(int i =0; i < arr.length; i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
}
