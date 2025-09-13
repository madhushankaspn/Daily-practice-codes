import java.util.*;
class Example{
	public static void increment(int arr[]){
		arr[0]++;		
		arr[1]++;
		arr[2]++;
	}
	 
	public static void main(String args[]){
		int[] arr = {1,5,8};
		System.out.println(Arrays.toString(arr));

		increment(arr);
		System.out.println(Arrays.toString(arr));				
		
		
	}
}
	   	