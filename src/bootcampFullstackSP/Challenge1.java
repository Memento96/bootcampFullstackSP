package bootcampFullstackSP;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Challenge1 {	
	public static void main(String[] args) {
		System.out.println(randomGeneratedByCode("Tipo C"));
		
		List <String> list = new ArrayList<>();
		list.add("Santiago");
		list.add("Juan");
		list.add("Sebastian");
		
		System.out.println(verifyList(list, "Santiago"));
		
	}
	
	private static String getRandomNum (String initialData) {
		Random random = new Random();
		StringBuffer sb = new StringBuffer(initialData);
		int max = 10;
		for (int i = 0; i < 8; i++) {
			int randomized = random.nextInt(max);
			sb.append(randomized);
		}
		
		return sb.toString();
	}
	
	public static String randomGeneratedByCode(String type) {
		if (type == "Tipo A") {
			return getRandomNum("54");
		} else if (type == "Tipo B") {
				return getRandomNum("08");
		}
		return "Not supported type";
	}
	
	public static boolean verifyList (List<String> data, String value) {
		return !data.contains(value);
	}
	
	 
	
}
