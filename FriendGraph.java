package javaproject1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FriendGraph {

	public static void main(String[] args) {
		Map<String,List<String>>graph=new HashMap<>();
		graph.put("alice",Arrays.asList("bob"));
		graph.put("bob",Arrays.asList("alice","charlie"));
		graph.put("charlie",Arrays.asList("bob"));
		for(String person:graph.keySet()) {
			System.out.println(person+"is friends with"+graph.get(person));
		}
		
		// TODO Auto-generated method stub

	}

}
