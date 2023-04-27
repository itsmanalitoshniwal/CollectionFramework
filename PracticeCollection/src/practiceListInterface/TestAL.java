package practiceListInterface;
import java.util.*;

public class TestAL {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(44);
		list.add(22);
		list.add(11);
		list.add(33);
		list.sort((x,y)-> Integer.compare(x,y));
		
		list.forEach(i -> System.out.println(i));
		
		String[] arr= {"DAC","DMC","DESD"};
		Arrays.sort(arr, (x,y)-> x.compareTo(y));
		
		System.out.println(Arrays.toString(arr));
	}

}
