package practiceListInterface;
import java.util.*;

public class TestUser {

	public static void main(String[] args) {
		List<User> list= new ArrayList<>();
		list.add(new User(11, "john", "john@gmail.com", "123"));
		list.add(new User(22, "bill", "bill@gmail.com", "123"));
		list.add(new User(33, "steve", "steve@gmail.com", "123"));
		list.add(new User(44, "millar", "millar@gmail.com", "123"));
		list.add(new User(55, "turner", "turner@gmail.com", "123"));
		list.add(new User(66, "king", "king@gmail.com", "123"));
		
		list.forEach(u -> System.out.println(u));
		
		int keyUserId = 44;
		User key = new User();
		key.setId(keyUserId);
		int index = list.indexOf(key);
		
		if(index == -1)
			System.out.println("User not found");
		else
		{
			System.out.println("user found at index: "+index);
		
			User u= list.get(index);
			System.out.println(u);
		}
		
		String keyEmail= "king@gmail.com";
		for(User u:list) {
			if(u.getEmail().equals(keyEmail)) {
				System.out.println("found : "+u);
				break;
			}
		}
		
}
}
