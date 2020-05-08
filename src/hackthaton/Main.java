package hackthaton;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  /**
   * Iterate through each line of input.
   * 
   * 
   */
	
	
	private int add() {
		return 1;
	}
	
	int result(){ 
		return new Main().add();
	};
	
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line = "4\n" + 
    		"1 0\n" + 
    		"2 0\n" + 
    		"3 1 2 ";
    String line1 = "1 0";
      int number = Integer.parseInt(line.split("\\R")[0]);
      System.out.println(number);
      List<List<Integer>> list = new ArrayList<>();
      list.add(Stream.of(line1.split(" ")).flatMap(Stream::of).mapToInt(Integer::valueOf).boxed()
              .collect(Collectors.toList()));
      System.out.println(list);
      System.out.println(canFinish(number, list));
      System.out.println(new Main().result()*2);
  }
  
  public static LinkedList<Integer> canFinish(int numCourses, List<List<Integer>> prerequisites) {
	    if(prerequisites == null){
	        throw new IllegalArgumentException("illegal prerequisites array");
	    }
	 
	    int len = prerequisites.size();
	 
	    if(numCourses == 0 || len == 0){
	        return null;
	    }
	 
	    // counter for number of prerequisites
	    int[] pCounter = new int[numCourses];
	    for(int i=0; i<len; i++){
	    	pCounter[prerequisites.get(i).get(0)]++;
	    }
	 
	    //store courses that have no prerequisites
	    LinkedList<Integer> queue = new LinkedList<Integer>();
	    for(int i=0; i<numCourses; i++){
	        if(pCounter[i]==0){
	            queue.add(i);
	        }
	    }
	 
	    // number of courses that have no prerequisites
	    int numNoPre = queue.size();
	 
	    while(!queue.isEmpty()){
	        int top = queue.remove();
	        for(int i=0; i<len; i++){
	            // if a course's prerequisite can be satisfied by a course in queue
	            if(prerequisites.get(i).get(1)==top){
	                pCounter[prerequisites.get(i).get(0)]--;
	                if(pCounter[prerequisites.get(i).get(0)]==0){
	                    numNoPre++;
	                    queue.add(prerequisites.get(i).get(0));
	                }
	            }
	        }
	    }
	    return queue;
	    //return numNoPre == numCourses;
	}
}