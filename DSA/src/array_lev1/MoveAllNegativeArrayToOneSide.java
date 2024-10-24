package array_lev1;

public class MoveAllNegativeArrayToOneSide {
public static void quickSort(int arr[]) {
	int l=arr.length;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,-5,-3,-6,0,4,456,-534,-789};
		quickSort(arr);
		for(int i:arr) {
			System.out.println(i);
		}
				

	}

}
