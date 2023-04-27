package practiceListInterface;
import java.util.*;

public class TestLL {

	public static void main(String[] args) {
		List<String> list= new LinkedList<>();
		list.add("DAC");
		list.add("DMC");
		list.add("DBDA");
		list.add("DITISS");
		list.add("DAC"); //duplicates are allowed
		
		if(list.isEmpty()) 
			System.out.println("Empty List");
		else
			System.out.println("List is not Empty");
		
		System.out.println("\nSize: "+list.size());
		System.out.println(list.toString());
		
		System.out.println("\nTraversal using for-each loop");
		for(String ele: list)
			System.out.println(ele);
		
		System.out.println("\nTraversal using Iterator");
		Iterator<String> itr= list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("\nTraversal using ListIterator");
		//iterator moves in forward direction and listiterator can traverse from any index in both dirn
		ListIterator<String> litr= list.listIterator(list.size());
		while(litr.hasPrevious())
			System.out.println(litr.previous());
		
		System.out.println("\nTraversal using foreach()");
		list.forEach(ele -> System.out.println(ele));
		
		//random access
		int index =  3;
		System.out.println("\nelement at index "+index+" is: "+list.get(index));
		
		list.set(index, "PG-DBDA");
		System.out.println("\nAfter Set(): "+list);
		
		list.remove(4);
		System.out.println("\nAfter remove(): "+list);
		
		
		System.out.println("Searching:");
		String key="DESD";
		
		list.set(index, key);
		
		if(list.contains(key))
			System.out.println(key+" is in list at index: "+list.indexOf(key));
		else
			System.out.println(key+" is not in list");
		
		list.remove(key);
		System.out.println("after deleting "+key+"\n"+list);
		
		list.removeIf(e -> e.length()>3);
		System.out.println("after removeIf() "+list);
		
		list.clear();
		System.out.println("deleted all... "+list);
		
		}

}
