package array;


import java.util.Arrays;

public class ArrayEx3 {

	public static void main(String[] args) {
		Integer arr[]={10,20,50,60,41,21,12,52,63,1,4,2};
		
		/*  for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		*/
		//for each loop
		for (int x : arr)
		{
			System.out.println(x);
		}
	
		Arrays.sort(arr);
		System.out.println("after soring ");
		for (int x : arr)
		{
			System.out.println(x);
		}
	
	
		

	}

}
