import java.util.*;
class Example{
	public static void main(String args[]){
		int[] arr = {1,5,7,2,9,6};
		
		for(int j=0; j<arr.length-1; j++){
			for(int i=0; i<arr.length-1-j; i++){
				if(arr[i]>arr[i+1]){
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			try{Thread.sleep(2000);}catch(Exception e){}
			System.out.println(Arrays.toString(arr));
			}
		System.out.println("============");
		}
	}
}