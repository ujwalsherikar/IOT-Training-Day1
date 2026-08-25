package TrainingDay4;

public class Electricity  {
	    public static void main(String[] args) {
	        int[] units = {10, 15, 12, 20, 18, 14, 16};
	        int total = 0;
	        for (int i = 0; i < units.length; i++) {
	            total = total + units[i];
	        }
	        System.out.println("Total consumption = " + total + " units");
	 }
}

