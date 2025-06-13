package javaproject1;

	import java.util.*;

	public class socialcircleDFS {
	    private Map<String, List<String>> graph;

	    public socialcircleDFS(Map<String, List<String>> graph) {
	        this.graph = graph;
	    }
	    public List<String> findSocialCircle(String person) {
	        List<String> result = new ArrayList<>();
	        Set<String> visited = new HashSet<>();
	        dfsRecursive(person, visited, result);
	        return result;
	    }
	    private void dfsRecursive(String node, Set<String> visited, List<String> result) {
	        if (visited.contains(node)) return;
	        visited.add(node);
	        result.add(node);

	        for (String neighbor : graph.getOrDefault(node, Collections.emptyList())) {
	            dfsRecursive(neighbor, visited, result);
	        }
	    }
	    public List<String> findSocialCircleIterative(String person) {
	        List<String> result = new ArrayList<>();
	        Set<String> visited = new HashSet<>();
	        Deque<String> stack = new ArrayDeque<>();

	        stack.push(person);
	        visited.add(person);

	        while (!stack.isEmpty()) {
	            String node = stack.pop();
	            result.add(node);

	            for (String neighbor : graph.getOrDefault(node, Collections.emptyList())) {
	                if (!visited.contains(neighbor)) {
	                    visited.add(neighbor);
	                    stack.push(neighbor);
	                }
	            }
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        Map<String, List<String>> graph = new HashMap<>();
	        graph.put("Alice", Arrays.asList("Bob", "Carol"));
	        graph.put("Bob", Arrays.asList("Alice", "Dave"));
	        graph.put("Carol", Arrays.asList("Alice"));
	        graph.put("Dave", Arrays.asList("Bob"));
	        graph.put("Eve", Arrays.asList("Frank"));        
	        graph.put("Frank", Arrays.asList("Eve"));

	        socialcircleDFS sc = new socialcircleDFS(graph);

	        System.out.println("Recursive from Alice: " + sc.findSocialCircle("Alice"));
	        System.out.println("Iterative from Alice: " + sc.findSocialCircleIterative("Alice"));
	        System.out.println("Recursive from Eve: "   + sc.findSocialCircle("Eve"));
	        System.out.println("Iterative from Eve: "   + sc.findSocialCircleIterative("Eve"));
	    }
	}
