package arriyList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<Integer> score = new HashSet<>();
		HashSet<String> animal1 = new HashSet<String>();
		HashSet<String> animal2 = new HashSet<>();
		HashSet<String> animal3 = new HashSet<>(10);
		HashSet<String> animal4 = new HashSet<>(animal1);
		HashSet<String> animal5 = new HashSet<>(Arrays.asList("tiger", "lion", "fox"));

		animal1.add("human");
		System.out.println(animal5);
		System.out.println(animal1);
		System.out.println(animal2);

		HashSet<Integer> scoreHash1 = new HashSet<>();
		HashSet<Integer> scoreHash = new HashSet<>(Arrays.asList(83, 90, 75));
		System.out.println(scoreHash);
		System.out.println(scoreHash.add(60));
		System.out.println(scoreHash.size());
		scoreHash.remove(60);
		System.out.println(scoreHash);
		System.out.println(scoreHash.contains(75));

		Iterator iteratorHash = scoreHash.iterator();
		System.out.println("여기");

		while (iteratorHash.hasNext()) {
			System.out.print(iteratorHash.next() + " ");
		}
		
	}
}
