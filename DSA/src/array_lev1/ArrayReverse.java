package array_lev1;


import java.util.Arrays;

public class ArrayReverse {
	public static int [] arrayReverse(int arr[]) {
		int start=0;
		int end =arr.length-1;
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
		return arr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,5,7,9,78};
		ArrayReverse.arrayReverse(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
		
		

	}

}
