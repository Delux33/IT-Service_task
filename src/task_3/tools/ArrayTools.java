package task_3.tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTools {

    public static void toFillArray(int[][] array) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = i * 3 + j + 1;
            }
        }
    }

    public static boolean isSemiMagicArray(int[][] array) {
        int arrayCost = getCostArray(array);
        boolean isLowestArrayCost = (arrayCost == 24);
        boolean allArrayIsEqual = compareArray(array);

        if (isLowestArrayCost && allArrayIsEqual) {
            System.out.println("Array cost: " + arrayCost);
            return true;
        }
        return false;
    }

    private static int getCostArray(int[][] array) {
        int[][] defaultArray = new int[3][3];
        toFillArray(defaultArray);

        int sum = 0;

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                sum += Math.abs(defaultArray[x][y] - array[x][y]);
            }
        }
        return sum;
    }

    private static boolean compareArray(int[][] array) {
        List<Integer> sum = new ArrayList<>(array.length);
        boolean stringsAreEqual = compareStrings(array, sum);
        sum.clear();
        boolean columnsAreEqual = compareColumns(array, sum);

        if (stringsAreEqual) {
            return columnsAreEqual;
        }
        return false;
    }

    private static boolean compareStrings(int[][] array, List<Integer> sumStrings) {

        for (int x = 0; x < 3; x++) {
            int sumString = 0;
            for (int y = 0; y < 3; y++) {
                sumString += array[x][y];
            }
            sumStrings.add(sumString);
        }
        return sumStrings.stream().allMatch(sumStrings.get(0)::equals);
    }

    private static boolean compareColumns(int[][] array, List<Integer> sumColumns) {

        for (int x = 0; x < 3; x++) {
            int sumColumn = 0;
            for (int y = 0; y < 3; y++) {
                sumColumn += array[y][x];
            }
            sumColumns.add(sumColumn);
        }

        return sumColumns.stream().allMatch(sumColumns.get(0)::equals);
    }
}
