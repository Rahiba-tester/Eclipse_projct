package assignments;

public class SortAscending_Array {

	public static void main(String[] args) {
		int arr[]=new int[] {8 ,2, 5, 3, 7 };
		System.out.println("the given values are: ");
		
		for(int i=0; i<arr.length; i++ )
		{
			System.out.print(arr[i]+" ");
		}
		
		
		int temp=0;
		for(int i=0;i<arr.length; i++)
		{
			for(int j=i+1;j<arr.length; j++)
			{
				
		     	if (arr[i]>arr[j])
		        	{
		     		temp=arr[i];
		        	 arr[i]=arr[j];
		        	 arr[j]=temp;
		        	}
			}
		}
				
	    System.out.println();
	    System.out.println("The ascending order of given values is:");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
