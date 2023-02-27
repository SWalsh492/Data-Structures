package ie.atu.sw;

import java.util.*;
public class Runner {
	public static void main(String[] args) throws Exception {
		System.out.println("---------- SW2 - DSA Lab 2: Lists & Collections ----------");
		Dictionary dictionary = new Dictionary();
		dictionary.load();
		System.out.println("Dictionary contains " + dictionary.size() +  " words.");
		
		String[] words = dictionary.getSortedWords();
		long startTime = System.nanoTime();
		
		//Start writing the lab exercises after this line:
		
		//ArrayList<String> list1 = new ArrayList<String>();
		//ArrayList<String> list2 = new ArrayList<>();
		List<String> list3 = new LinkedList<>();
		for(int i = 0; i < words.length; i++) {
			list3.add(0, words[i]);
		}
		
		/*Collections.shuffle(list3);
		for (int i = 0; i < words.length; i++) {
			list3.remove(0);
		}*/
		
		boolean found = list3.contains("Galway"); 
		System.out.println(found);
		
		System.out.println(list3.indexOf("Galway")); 
		
		System.out.println(list3.get(777));

		
		//Collection<String> col = new ArrayList<>();
		//var list4 = new ArrayList<String>();
		
		System.out.println("Running time (ns): " + (System.nanoTime() - startTime));
	}
}