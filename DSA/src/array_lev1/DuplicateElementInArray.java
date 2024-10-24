package array_lev1;

public class DuplicateElementInArray {
	public static void duplicateElementInArray(int [] arr) {
		
		
		for( int m=0;m<arr.length;m++) {
			for(int j=m+1;j<arr.length;j++)
			if(arr[m]==arr[j]) {
				//System.out.println("Hello");
				System.out.println(arr[m]);
				
			}
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,4,3,1} ;
		duplicateElementInArray(arr);
		

	}

}
