package array_lev1;



public class Solution {

    public static int secondLargest(int arr[], int n){
       int largest =arr[0];
       int sLargest =-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                sLargest=largest;
                largest=arr[i];
                
            }
            else if(arr[i]<largest&& arr[i]>sLargest){
                sLargest=arr[i];
            }
        }
        return sLargest;


    }

    public static int secondSmallest(int arr[], int n){
        int smallest=arr[0];
        int sSmallest=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                sSmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]>smallest&&arr[i]>sSmallest){
                sSmallest=arr[i];
            }
        }
        return sSmallest;





    }
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int sLargest=secondLargest(a,n);
        int sSmallest=secondSmallest(a,n);
        int arr[]=new int[2];
        arr[0]=sLargest;
        arr[1]=sSmallest;
        return arr;
    }
}
