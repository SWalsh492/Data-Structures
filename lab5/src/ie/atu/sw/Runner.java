package ie.atu.sw;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Runner {
	public void go() throws Exception {
		//Declare the list and list methods here
		
		List<Ninja> list = new ArrayList<>();
		fillList(list, 100);
		System.out.println("List contains " + list.size() + " Ninjas");
		
		Ninja n1 = getRandom(list);
		Ninja n2 = (Ninja) n1.clone();
		
		//Check the object IDs
		System.out.println(System.identityHashCode(n1) + "<===>" +
		System.identityHashCode(n2));
		
		//Check them in hex
		System.out.println(Integer.toHexString(System.identityHashCode(n1)) +
		"<===>" + Integer.toHexString(System.identityHashCode(n2)));
		
		boolean result = list.contains(n1);
		System.out.println("Found " + n1 + ": " + result);
		
		result = list.contains(n2);
		System.out.println("Found " + n2 + ": " + result);
		
		result = list.remove(n1);
		System.out.println("Deleted " + n1 + ": " + result);
	}
	
	/*
	 * Adds n instances of Ninja to a list. Each instance
	 * will be added to the end, which is a constant time
	 * operation. For n Ninjas, the total running time is
	 * (n * 1) = O(n), i.e. linear time. 
	 */

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public void fillList(List<Ninja> list, int n) {
		var rand = ThreadLocalRandom.current(); //Get a randomiser
		String[] names = {"Joe", "Pat", "Anne", "Tom", "Kathy", "Cloe", "Jim"};
		for (int i = 0; i < n; i++) {
			list.add(new Ninja(							//Add a new Ninja
				rand.nextLong(), 						//Generate a random long
				names[rand.nextInt(0, names.length)],	//Pick a random name
				LocalDate.now(),						//Use the current date
				rand.nextInt(1, 10)						//Set the expertise level
			));
		}
	}
	
	
	//Returns a random element from the list 
	public Ninja getRandom(List<Ninja> ninjas) {
		return ninjas.get(ThreadLocalRandom.current()
				                           .nextInt(0, ninjas.size()));
	}
	
	//Start the ball running
	public static void main(String[] args) throws Exception {
		new Runner().go();
	}
}