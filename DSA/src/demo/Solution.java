package demo;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> sortBinaryArray(ArrayList<Integer> arr, int n) {
		//	Write your code here.
		ArrayList<Integer> arrayList= new ArrayList<>();
		for (Integer integer : arr) {
			if(integer!=0){
				arrayList.add(integer);
			}
			
		}
		//System.out.println(arrayList.toString());
		int s=arr.size()-arrayList.size();
	
		for(int i=0;i<s;i++){
			arr.set(i, 0);
		}
		
		int t=0;
		for(int i=s;i<arr.size();i++){
			arr.set(i, arrayList.get(t));
			t++;
		}
		return arr;
	}
	public static void main(String[] args) {
		//Solution solution= new Solution();
		ArrayList<Integer> arrayList= new ArrayList<Integer>();
		arrayList.add(0);
		arrayList.add(1);
		arrayList.add(0);
		
		ArrayList<Integer> list= sortBinaryArray(arrayList, arrayList.size());
		System.out.println("OUTPUT-->"+list.toString());
		
	}
}
