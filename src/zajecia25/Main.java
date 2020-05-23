package zajecia25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// maps();
		// sets();
		excercise();
	}

	static void maps() {
		Map<String, Integer> hashMap = new HashMap<>();
		Map<String, Integer> treeMap = new TreeMap<>();
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

		addToMap(hashMap);
		addToMap(treeMap);
		addToMap(linkedHashMap);

		printMap(hashMap);
		printMap(treeMap);
		printMap(linkedHashMap);

		System.out.println(linkedHashMap.get("BMW"));

		linkedHashMap.remove("BMW");
		printMap(linkedHashMap);

		System.out.println(linkedHashMap.get("BMW"));

		System.out.println(linkedHashMap.isEmpty());

		System.out.println(linkedHashMap.size());
		System.out.println(linkedHashMap.keySet());
		System.out.println(linkedHashMap.values());

		linkedHashMap.remove("Mercedes");
		linkedHashMap.remove("Audi");

		System.out.println(linkedHashMap.isEmpty());
	}

	static void addToMap(Map<String, Integer> map) {
		map.put("BMW", 361);
		map.put("Mercedes", 321);
		map.put("Audi", 456);
	}

	static void printMap(Map<String, Integer> map) {
		System.out.println("{");

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("\t\"" + entry.getKey() + "\" : " + entry.getValue() + ",");
		}

		System.out.println("}");
	}

	static void sets() {
		Set<String> hashSet = new HashSet<>();
		Set<String> treeSet = new TreeSet<>();
		Set<String> linkedHashSet = new LinkedHashSet<>();

		addToSet(hashSet);
		addToSet(treeSet);
		addToSet(linkedHashSet);

		printSet(hashSet);
		printSet(treeSet);
		printSet(linkedHashSet);

		System.out.println(linkedHashSet.isEmpty());

		int size = linkedHashSet.size();
		System.out.println(size);

		linkedHashSet.remove("Ford");
		printSet(linkedHashSet);

		System.out.println(linkedHashSet.contains("BMW"));
	}

	static void addToSet(Set<String> set) {
		set.add("BMW");
		set.add("Mercedes");
		set.add("Fiat");
		set.add("Ford");
		set.add("Ferrari");
	}

	static void printSet(Set<String> set) {
		int number = 1;

		for (String s : set) {
			System.out.println((number++) + ": " + s);
		}
	}

	static void excercise() {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 10000; i++) {
			Random rnd = new Random();

			list.add(rnd.nextInt(1000000 + 1));
		}

		System.out.println("Rozmiar listy = " + list.size());

		int[] result = countDistinct(list);

		for (int i = 0; i < result.length; i++) {
			System.out.println(i + ": " + result[i]);
		}
	}

	static int[] countDistinct(List<Integer> list) {
		if (list == null || list.isEmpty()) {
			return new int[] { 0, 0, 0 };
		}

		Set<Integer> set = new TreeSet<>(list);
		Object[] array = set.toArray();

		if (set.size() == 1) {
			return new int[] { set.size(), (int) array[0], (int) array[0] };
		}

		int smallest = (int) array[0];
		int biggest = (int) array[array.length - 1];

		return new int[] { set.size(), smallest, biggest };
	}
}
