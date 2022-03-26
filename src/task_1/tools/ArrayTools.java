package task_1.tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTools {

    public static List<String> getUniqueSubstringsAsList(String[] firstArray, String[] secondArray) {
        List<String> substrings = new ArrayList<>();

        for (String stringFromSecondArray : secondArray) {
            for (String stringFromFirstArray : firstArray) {
                if (stringFromSecondArray.contains(stringFromFirstArray)) {

                    substrings.add(stringFromFirstArray);
                }
            }
        }
        return substrings.stream().distinct().toList();
    }

    public static String[] getSortedArray(List<String> uniqueSubstrings) {
        String[] array = uniqueSubstrings.toArray(new String[0]);
        Arrays.sort(array);

        return array;
    }
}