import java.util.Scanner;

public class ArrayTwo {
    public static void main(String[] args) {
        int[][] array = new int[3][2];
        int[] result = new int[array.length];
        Scanner scanner = new Scanner(System.in);
        for (int j = 0; j < array[j].length; j++) {
            int total = 0;
            for (int i = 0; i < array.length; i++) {
                array[i][j] = scanner.nextInt();
                System.out.print(array[i][j] + " ");
                total += array[i][j];
            }
            result[j] = total;
            System.out.println();
            System.out.println("Сумма столбца " + j + " = " + total);
        }
    }
}