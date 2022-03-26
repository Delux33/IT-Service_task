package task_1;

import task_1.tools.ArrayTools;

import java.util.Arrays;
import java.util.List;

public class ITServiceTask1 {

    public static void main(String[] args) {
        String[] array1 = {"arp", "live", "strong"};
        String[] array2 = {"lively", "alive", "harp", "sharp", "armstrong"};
        String[] array3 = {"tarp", "mice", "bull"};

        List<String> uniqueSubstrings1 = ArrayTools.getUniqueSubstringsAsList(array1, array2);
        List<String> uniqueSubstrings2 = ArrayTools.getUniqueSubstringsAsList(array3, array2);

        String[] result1 = ArrayTools.getSortedArray(uniqueSubstrings1);
        String[] result2 = ArrayTools.getSortedArray(uniqueSubstrings2);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}