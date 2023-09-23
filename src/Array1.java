
import java.util.Arrays;
import java.util.Collections;

public class Array1 {
    public static void main(String[] args) {

        int[] array = {3, 22, 1, 13, 4, 6, 16, 5};

        for(int i = 0;i<array.length;i++){
            if(array[i]%2==0) System.out.print(array[i]+" ");
        }

        System.out.println();

        for(int i = 0;i<array.length;i++){
            if(array[i]>=10) System.out.print(array[i]+" ");
        }

        System.out.println();


        int maxNum = array[0];

        for (int j : array) {
            if (j > maxNum) {
                maxNum = j;
            }
        }
        System.out.println("Max number = " + maxNum);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);

        Collections.reverse(Arrays.asList(array));
        System.out.println(Arrays.toString(array));

    }

}
