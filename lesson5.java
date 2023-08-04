import java.util.HashMap;
import java.util.Map;

public class lesson5 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		String passnum = "asdasdas";
		String lastnum = "sdsfdsfd";
		add(passnum, lastnum, map);
		getValue(passnum, map);

		StringBuilder stringbuilder = new StringBuilder();
		for (Map.Entry entry : map.entrySet()) {
			if (entry.getValue().equals(lastnum)) {
				stringbuilder.append(entry.getKey());
				stringbuilder.append(":");
				stringbuilder.append(lastnum);
				stringbuilder.append("\n");
			}
		}
		System.out.println(stringbuilder.toString());
	}

	public static void add(String passnum, String lastnum, Map map) {
		map.put(passnum, lastnum);
		System.out.println(map);
	}

	public static String getValue(String passnum, Map map) {
		System.out.println(map.get(passnum));
		return passnum + ":" + map.get(passnum);
	}

	public static String getAll(String passnum, Map map) {
		return map.toString();
	}

}