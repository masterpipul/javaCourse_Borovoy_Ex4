import java.util.Scanner;

public class ArrayFour {
    public static void main(String[] args) {
        int[][] array = new int[2][3];
        int[] result = new int[array.length];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            int total = 0;
            int count = 0;
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
                System.out.print(array[i][j] + " ");
                total += array[i][j];
                count++;
            }
            result[i] = total;
            System.out.println();
            System.out.println("Среднее арифметическое строки " + i + " = " + total/count);
        }
    }
}
