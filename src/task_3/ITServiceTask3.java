package task_3;

import task_3.tools.ArrayTools;

import java.util.Arrays;

public class ITServiceTask3 {

    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int temporary;
        int random;

        ArrayTools.toFillArray(array);

        do {
            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 3; y++) {
                    random = (int) ((1 + Math.random() * 10) % 9);
                    temporary = array[random / 3][random / 3];
                    array[random / 3][random / 3] = array[x][y];
                    array[x][y] = temporary;
                }
            }
        } while (!ArrayTools.isSemiMagicArray(array));

        Arrays.stream(array)
                .map(Arrays::toString)
                .forEach(System.out::println);
    }
}