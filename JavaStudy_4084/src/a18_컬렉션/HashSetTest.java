package a18_컬렉션;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> strSet = new HashSet<String>();
		strSet.add("일번이");
		strSet.add("이번이");
		strSet.add("삼번이");
		strSet.add("사번이");
		
		System.out.println(strSet);
	
		strSet.remove("삼번이");
		
		System.out.println(strSet);
		
		Iterator<String> ir = strSet.iterator();
		while(ir.hasNext())	{ // 다음이 있니? --> 있으면 계속 true
			String str = ir.next(); // --> 꺼내는중  Bof ---> Eof(순회한다)
			if(str.equals("사번이")) { //--> 원하는거만 찾겠다.
			System.out.println(str);
			}
		}
	}

}
