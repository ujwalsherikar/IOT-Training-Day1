package TrainingDay4;

import java.util.Scanner;
public class SimpleCalculator   {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter calculation: ");
	        String s = sc.nextLine();
	        String[] n = s.split("[+\\-*/]");
	        int a = Integer.parseInt(n[0]);
	        int b = Integer.parseInt(n[1]);
	        if (s.contains("+"))
	            System.out.println(a + b);
	        else if (s.contains("-"))
	            System.out.println(a - b);
	        else if (s.contains("*"))
	            System.out.println(a * b);
	        else if (s.contains("/"))
	            System.out.println(a / b);
	    }
	}