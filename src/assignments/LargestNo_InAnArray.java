package assignments;

public class LargestNo_InAnArray {

	public static void main(String[] args) {
	
		int arr[]=new int[] {1,9,5,4,6,34};
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			
		}
		System.out.println("the larges number in the given array is: "+max);
	}

}
