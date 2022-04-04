package a18_컬렉션;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<String, String>(); //K key V value
		hashMap.put("가", "일번");
		hashMap.put("나", "이번");
		hashMap.put("다", "삼번");
		hashMap.put("라", "사번");
		hashMap.put("마", "오번");
		
		System.out.println(hashMap);
		System.out.println();
		System.out.println(hashMap.get("다"));
		System.out.println(hashMap.containsValue("사번"));
		System.out.println(hashMap.remove("라"));
		System.out.println(hashMap);
		System.out.println(hashMap.replace("마", "육번"));
		System.out.println(hashMap);
	}

}
