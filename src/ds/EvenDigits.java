package ds;

public class EvenDigits {
	public static void main(String[] args) {
		int [] arr = {1,0,53,245};
		countEvenDigits(arr);
	}
	static void countEvenDigits(int[] arr) {
		
		int evencount=0;
		for(int i=0;i<arr.length;i++) {
			int countdig=0;
			while(Math.abs(arr[i])>0) {arr
				arr[i]=arr[i]/10;
				countdig++;
			}
			if(countdig%2==0) {
				evencount++;
			}
		}
		System.out.println("Count of Even Digits:"+evencount);
		
	}
}
