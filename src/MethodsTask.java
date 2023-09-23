import java.util.Scanner;

import static java.lang.Character.isDigit;

public class MethodsTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя и число 2-5 разрядов");
        String text = scanner.nextLine();
        String[] stringArray = text.split(" ");
        char[] checkName = stringArray[0].toCharArray();
        for (char c : checkName){
            if (isDigit(c)) {
                System.out.println("Введите имя буквами");
                System.exit(400);
            }

        }
        char[] checkNum = stringArray[1].toCharArray();
        for (char c : checkNum){
            if (isDigit(c)) {
            }
            else {
                System.out.println("Введите число");
                System.exit(400);
            }
        }
        int num = Integer.parseInt(stringArray[1]);
        if (num >= 10 && num < 100000) {
            sumNumber(num, stringArray);
        }
        else {
            System.out.println("Введите число от 10 до 100000");
        }
    }

    public static void sumNumber(int num, String[] stringArray){
        int sum = 0;
        while (num != 0) {
            //Суммирование цифр числа
            sum += (num % 10);
            num /= 10;
        }
        if (sum > 1 && sum <= 10) {
            String sumWord = String.valueOf(sumToWord(sum));
            System.out.println("Здравствуте, " + stringArray[0] + "! Сумма цифр в числе = " + sumWord);
        }
        else {
            System.out.println("Введите другое число");
        }
    }

    public static String sumToWord(int sum) {
        String sumOne = "";
        if(sum == 2){
            sumOne = "Два";
        }
        else if (sum == 3){
            sumOne = "Три";
        }
        else if (sum == 4){
            sumOne = "Четыре";
        }
        else if (sum == 5){
            sumOne = "Пять";
        }
        else if (sum == 6){
            sumOne = "Шесть";
        }
        else if (sum == 7){
            sumOne = "Семь";
        }
        else if (sum == 8){
            sumOne = "Восемь";
        }
        else if (sum == 9){
            sumOne = "Девять";
        }
        else if (sum == 10){
            sumOne = "Десять";
        }
        return sumOne;
    }
}
