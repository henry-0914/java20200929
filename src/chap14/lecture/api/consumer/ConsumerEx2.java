package chap14.lecture.api.consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ConsumerEx2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("java", 9);
		map.put("html", 3);
		map.put("css", 5);
		map.put("jap", 2);
		map.put("servlet", 3);
		map.put("jquery", 3);
		
		map.forEach((k, v) -> System.out.println(k + ":" + v));
		
		System.out.println("======== key set use=============");
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
				
	}
}
