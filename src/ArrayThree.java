import java.util.Arrays;
import java.util.Scanner;

public class ArrayThree {
    public static void main(String[] args) {
        int[][] array = new int[2][3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
                if (array[i][j] % 2 != 0) {
                    array[i][j] = 0;
                    System.out.print(array[i][j] + " ");
                } else {
                    array[i][j] = 1;
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
