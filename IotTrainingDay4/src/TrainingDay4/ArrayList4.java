package TrainingDay4;

import java.util.ArrayList;
public class ArrayList4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Initial size: " + list.size());
        System.out.println("Is empty: " + list.isEmpty());
        System.out.println("Contents: " + list);
        list.add("C");
        list.add("A");
        list.add("E");
        list.add("D");
        list.add("F");
        list.add("A");
        list.add(null);
        System.out.println("Size after adding: " + list.size());
        System.out.println("Is empty: " + list.isEmpty());
        System.out.println("Contents: " + list);
        boolean b1 = list.contains("E");
        System.out.println("E is present: " + b1);
        boolean b2 = list.contains("R");
        System.out.println("R is present: " + b2);
        list.remove("B");
        System.out.println("Size after deletion: " + list.size());
        System.out.println("Contents after deletion: " + list);
        list.clear();
        System.out.println("Size after clearing: " + list.size());
        System.out.println("Contents after clearing: " + list);
    }
}