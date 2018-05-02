package misc.prac.passbyvalue;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class PvPr {

	public static void main(String[] args) {
		Student s = new Student();
		Integer i = new Integer(100);
		List l;
		ArrayList al;
		Date d;
		System.out.println(s.getId());
		change(s);
		System.out.println(s.getId());
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put(null, "abc");
		String speedHump = "";
		
		System.out.println(1 << 4);

	}
	
	public static void change(Student s) {
		s.setId(100);
		s.setName("Ranjan");
	}

}
