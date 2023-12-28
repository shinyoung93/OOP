package arriyList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArryaListTest {

	public static void main(String[] args) {

		ArrayList<Integer> integers1 = new ArrayList<Integer>();
		ArrayList<Integer> integers2 = new ArrayList<>();
		ArrayList<Integer> integers3 = new ArrayList<>(10);
		ArrayList<Integer> integers4 = new ArrayList<>(integers1);
		ArrayList<Integer> integers5 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		List list = new ArrayList<>(integers1);

		int[] c = new int[] { 1, 2, 3 };

		ArrayList<Integer> scoreList = new ArrayList<>();

		scoreList.add(83);
		scoreList.add(90);
		scoreList.add(2, 75);
		scoreList.add(75);
		//scoreList.set(0, 100);

		System.out.println(scoreList);

		// int removedscore = scoreList.remove(0);
		// System.out.println(removedscore);
		// scoreList.remove(0);
		// scoreList.clear();
		System.out.println(scoreList);

		for (Integer score1 : scoreList) {
			System.out.println(score1 + ", ");
		}
		
		for(int i =0 ; i < scoreList.size(); ++i) {
			System.out.print(scoreList.get(i) + " ");		
		}
		System.out.println("마무리");
		
		Iterator<Integer> iterator2 = scoreList.iterator();
		while(iterator2.hasNext()) {
			System.out.print(iterator2.next() + " ");
		}
		System.out.println("마무리");
		
		ListIterator<Integer> listIterator = scoreList.listIterator(scoreList.size());
		while (listIterator.hasPrevious()) {
			System.out.print(listIterator.previous() + ", ");
		}
		System.out.println("마무리");
		
		boolean isContain = scoreList.contains(90);
		System.out.println(isContain);
		
		int index = scoreList.indexOf(75);
		System.out.println(index);

		
		
	}
	
}
