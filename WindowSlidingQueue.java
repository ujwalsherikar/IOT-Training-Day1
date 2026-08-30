package Day8;
import java.util.Queue;
import java.util.LinkedList;
public class WindowSlidingQueue {
	    public static void main(String[] args) {
	    	        int[] numbers = {2, 3, 4, 5, 6};
	    	        int k = 3;

	    	        Queue<Integer> q = new LinkedList<>();

	    	        for (int i = 0; i < numbers.length; i++) {

	    	            q.add(numbers[i]);

	    	            if (q.size() == k) {

	    	                int greater = 0;

	    	                for (int x : q) {
	    	                    if (x > greater)
	    	                        greater = x;
	    	                }

	    	                System.out.println("Window: " + q);
	    	                System.out.println("Greater: " + greater);

	    	                q.remove();
	    	            
	    	        }
	  
	    	        }
	    }
}
