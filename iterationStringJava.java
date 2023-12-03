import java.util.*;

public class iterationStringJava {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> array = new ArrayList<>();
		HashSet<String> hs = new HashSet<>();
		HashMap<String, Integer> hm = new HashMap<>();
		for (int i = 0; i < 10; i++) {
			String temp = sc.next();
			array.add(temp);
			hs.add(temp);
			if (hm.containsKey(temp)) {
				int value = hm.get(temp);
				hm.put(temp, value + 1);
			} else {
				hm.put(temp, 1);
			}
		}
		System.out.println("List Contains:");
		for (int i = 0; i < 10; i++) {
			System.out.println(array.get(i));
		}
		System.out.println();

		System.out.println("Set Contains :");
		for (String temp : hs) {
			System.out.println(temp);
		}
		System.out.println();

		System.out.println("Frequency of the words:");
		for (Map.Entry<String, Integer> entry : hm.entrySet()) {
			System.out.println("Word = " + entry.getKey() + ",Frequency = " + entry.getValue());
		}

	}
}
