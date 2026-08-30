package TrainingDay9;

import java.util.*;
public class lexicalAnalysisNos {
    public static void main(String[] args) {
        long[] numbers = {
            9876543210L,
            8765432109L,
            9123456780L,
            9988776655L
        };
        long search = 9123456780L;
        ArrayList<Long> result = new ArrayList<>();
        for (long number : numbers) {
            if (number == search) {
                result.add(number);
            }
        }
        System.out.println("Search results:");
        for (long number : result) {
            System.out.println(number);
        }
    }
}