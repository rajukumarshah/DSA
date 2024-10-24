package array_lev1;

public class MajorityElement {
	public static int majorityElement(int arr []) {
	int n=arr.length;
	// loop to consider each element as a candidate for majority
	
	for(int i=0;i<n;i++) {
		int count=0;
		for(int j=0;j<n;j++) {
			if(arr[i]==arr[j]) {
				count++;
			}
		}
		if(count>n/2) {
			return arr[i];
		}
	}
	return -1;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,5,5,5,5};
		//majorityElement(arr);
		System.out.println(majorityElement(arr));
		

	}

}
