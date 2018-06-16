package collections;

import java.util.HashMap;
import java.util.Map;

public class CollectionHashMap {

	public static void main(String[] args) {
		Map<Integer, String> Blazers = new HashMap<>();

		Blazers.put(0, "Damian Lillard");
		Blazers.put(3, "C.J. McCollum");
		Blazers.put(6, "Shabazz Napier");
		Blazers.put(27, "Jusuf Nurkic");
		Blazers.put(8, "Al-Farouq Aminu");
		Blazers.put(17, "Ed Davis");
		Blazers.put(5, "Pat Connaughton");
		Blazers.put(1, "Evan Turner");
		Blazers.put(10, "Jake Layman");
                Blazers.put(11, "Meyers Leonard");
		Blazers.put(4, "Maurice Harkless");
		Blazers.put(33, "Zach Collins");
		Blazers.put(50, "Caleb Swanigan");
		Blazers.put(2, "Wade Baldwin");
                Blazers.put(19, "Georgios Papagiannis");

		// Print out total number of Blazers
		System.out.println("Total Blazers: " + Blazers.size());
		System.out.println();
		System.out.println();

		Map<String, Integer> Starting = new HashMap<>();

		Starting.put("Damian Lillard", 0);
		Starting.put("C.J. McCollum", 3);
		Starting.put("Al-Farouq Aminu", 8);
		Starting.put("Jusuf Nurkic", 27);
		Starting.put("Maurice Harkless", 4);

		System.out.println("Portland Trail Blazers Starting Lineup: " + Starting.size());

            Starting.keySet().forEach((key) -> {
                System.out.println(key + " - Jersey Number: " + Starting.get(key));
            });
		System.out.println();

	}

}
