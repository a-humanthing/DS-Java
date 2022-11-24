package ds;

import java.util.Arrays;

public class MultiArray {
	public static void main(String[] args) {
		int [][] arr = {
				{
					1,2,3
				},
				{
					4,5
				},
				{
					7,8,9,8
				}
		};
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<3;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		for(int []a:arr) {
			System.out.println(Arrays.toString(a)); 
		}
	}
}
