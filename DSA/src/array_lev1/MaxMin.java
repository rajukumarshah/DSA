package array_lev1;

public class MaxMin {
	public static int Max(int arr[]) {

		int l = arr.length;

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < l; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		return max;

	}
	public static int Min(int arr[]) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
			
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 4, 2, 344, 2, 346, 2, 4, 2, 34, 2, 4 };
		int max = MaxMin.Max(arr);
		System.out.println(max);
		int min = MaxMin.Min(arr);
		System.out.println("min"+min);

	}

}
