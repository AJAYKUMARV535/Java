import java.util.Scanner;

class Maxpool{
	public static void main(String [ ] args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt( );
		int n = sc.nextInt( );
		int[][] image = new int[m][n];
		for(int i = 0;i<m;i++)
		for(int j = 0;j<n;j++)
		image[i][j] = sc.nextInt( );

		int[ ][ ] maxpool = new int[m-1][n-1];

		for(int i = 0;i<m-1;i++)
		for(int z = 0;z<n-1;z++){
		int max = image[i][z];
		for(int j = i;j<i+2;j++)
		for(int k = z;k<z+2;k++)
		if(image[j][k]>max)
			max = image[j][k];
		maxpool[i][z] = max;
		}

		for(int i = 0;i<m-1;i++){
		for(int z = 0;z<n-1;z++)
		System.out.print(maxpool[i][z]+" ");
		System.out.println( );
		}
	}
}
		
		
