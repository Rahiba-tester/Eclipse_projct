package assignments;

public class Add_matrix {

	public static void main(String[] args) {
		int a[][]= {{5,6,8},{2,9,6},{6,3,7}};
		int b[][]= {{9,5,2},{1,8,6},{10,6,4}};
		
		int c[][]=new int[3][3];
		System.out.println("The sum of 2 matrix is:");
		
		for(int i=0;i<3;i++)
		{
			for (int j=0; j<3; j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
