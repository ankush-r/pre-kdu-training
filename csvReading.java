import java.io.*;
import java.util.*;

public class csvReading {
	public static class obj implements Comparable<obj> {
		String word;
		int count;

		public obj(String s, int i) {
			word = s;
			count = i;
		}

		public int compareTo(obj o2) {
			return this.count - o2.count;
		}
	}

	public static void main(String[] args) throws Exception {
		// Set the path to your CSV file
		String filePath = "givendata.csv";
		BufferedReader br = new BufferedReader(new FileReader(filePath));

		String samp = br.readLine();
		String[] arr = samp.split(", ");

		int l = arr.length;

		HashMap<String, Integer> hm = new HashMap<>();
		for (int i = 0; i < l; i++) {
			String temp = arr[i];
			if (hm.containsKey(temp)) {
				int val = hm.get(temp);
				hm.put(temp, val + 1);
			} else {
				hm.put(temp, 1);
			}
		}
		PriorityQueue<obj> pq = new PriorityQueue<>();

		for (Map.Entry<String, Integer> entry : hm.entrySet()) {
			String s = entry.getKey();
			int i = entry.getValue();
			pq.add(new obj(s, i));
			while (pq.size() > 3) {
				pq.remove();
			}
		}

		while (pq.size() != 0) {
			System.out.println(pq.remove().word);
		}
		br.close();

	}
}
