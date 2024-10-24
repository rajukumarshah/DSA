package array_lev1;

public class BubbleSort {
	
	public static int partition(int [] arr,int low, int high) {
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				//swap
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		i++;
		int temp=arr[i];
		arr[i]=pivot;
		arr[high]=temp;
		return i;
	}
	private static void quickSort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		if(low<high) {
			int pidx=partition(arr,low,high);
			quickSort(arr, low, pidx-1);
			quickSort(arr, pidx+1, high);
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,4,9,5,8,3};
		int low =0;
		int high=arr.length;
		quickSort(arr,low,high-1);
		for(int i=0;i<high;i++) {
			System.out.println(arr[i]+" ");
		}
		

	}
	
}
