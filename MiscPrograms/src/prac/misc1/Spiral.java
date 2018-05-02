package prac.misc1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

final class C {
	private final int i; private final String s; private final List<String> list;
	public C(int i, String s, List<String> list) {
		this.i= i ;
		this.s= s;
		this.list = list;
	}
	public int getI() {
		return i;
	}
	public String getS() {
		return s;
	}
	public List<String> getList() {
		//return Collections.unmodifiableList(list); // -> throws java.lang.UnsupportedOperationException
		//return list;
		return new ArrayList<String>(this.list);
	}
	
	
	//no setter
}

public class Spiral {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("aa");ar.add("bb");
		C c = new C(1, "A", ar);
		System.out.println(c.getI());
		System.out.println(c.getS());
		
		c.getList().add("cc");
		for(String s : c.getList()) {
			System.out.println(s);
		}
		
		
		HashSet f;
		TreeSet ts;
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
