package array_lev1;

import java.util.Arrays;

public class RotateArrayInCylindricalOrder {
	static int arr[]= new int[]{1,2,3,4,5,6,7,8};
	// method array rotate
	static void rotate() {
		int last_ele=arr[arr.length-1],i;
		for(i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
			arr[0]=last_ele;
		}
	}
	static void rotate1() {
		int i=0;
		int j=arr.length-1;
		while(i!=j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before Rotated");
		System.out.println(Arrays.toString(arr) );
		rotate1();
		System.out.println("-----Rotated Array is");
		System.out.println(Arrays.toString(arr));

	}

}
