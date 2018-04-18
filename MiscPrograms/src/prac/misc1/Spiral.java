package prac.misc1;

public class Spiral {

	public static void main(String[] args) {
		int xLength = 5, yLength = 5;
		int arr[][] = new int[xLength][yLength];
		arr[0][0] =  0;arr[0][1] =  1;arr[0][2] =  2;arr[0][3] =  3;arr[0][4] =  4;
		arr[1][0] = 10;arr[1][1] = 11;arr[1][2] = 12;arr[1][3] = 13;arr[1][4] = 14;
		arr[2][0] = 20;arr[2][1] = 21;arr[2][2] = 22;arr[2][3] = 23;arr[2][4] = 24;
		arr[3][0] = 30;arr[3][1] = 31;arr[3][2] = 32;arr[3][3] = 33;arr[3][4] = 34;
		arr[4][0] = 40;arr[4][1] = 41;arr[4][2] = 42;arr[4][3] = 43;arr[4][4] = 44;
		
		boolean direction[] = new boolean[4];
		direction[0] = true;direction[1] = false;direction[2] = false;direction[3] = false;
		int count = 0;	int jlength = 5;	int ilength = 5;
		
		while (count < 25) {
			System.out.println();
			int i = 0;
			int j = 0;
			if (direction[0]) {
				while (j < jlength) {
					System.out.print(arr[i][j] + " ");
					j++;count++;
				}
				j--;
				jlength--;
				direction[1] = true;
			}
			System.out.println();
			if (direction[1]) {
				while (i < ilength) {
					System.out.print(arr[i][j] + " ");
					i++;count++;
				}
				i--;ilength--;
				direction[2] = true;
			}
			if (direction[2]) {
				
			}
			
		}
			
		
		
		
		
	}

}
