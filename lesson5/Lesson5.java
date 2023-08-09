package lesson5;

import java.util.HashMap;
import java.util.Map;

public class Lesson5 {
	private Map<String, String> map = new HashMap<>();

	public void add(String pasnum, String passname) {
		map.put(pasnum, passname);
	}

	public String getbyPassnum(String pasnum) {
		return map.get(pasnum);
	}

	public String getbyPassname(String passname) {
		StringBuilder stringbuilder = new StringBuilder();
		for (Map.Entry entry : map.entrySet()) {
			if (entry.getValue().equals(passname)) {
				stringbuilder.append(entry.getKey());
				stringbuilder.append(" : ");
				stringbuilder.append(passname);
				stringbuilder.append("\n");
			}
		}
		return stringbuilder.toString();
	}

	public String getAll() {
		return map.toString();
	}

}