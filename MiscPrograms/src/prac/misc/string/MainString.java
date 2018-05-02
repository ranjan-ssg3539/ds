package prac.misc.string;

public class MainString {

	public static void main(String[] args) {
		String str = "abc";
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0 ; i --) {
			sb.append(str.substring(i,i+1));
		}
		
		System.out.println(sb);
		Integer i;

	}

}
