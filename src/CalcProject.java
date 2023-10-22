import java.util.Scanner;

public class CalcProject {
    public static int result = 0;
    public static void printMenu(String[] options){
        for (String option : options){
            System.out.println(option);
        }
        System.out.print("Выберите, что хотите сделать: ");
    }
    public static void main(String[] args) {
        String[] options = {"1. Ввести пример.",
                "2. Продолжить работать с предыдущим ответом.",
                "3. Выход.",
        };
        String[] operations = { "1. Сложение.",
                "2. Вычитание.",
                "3. Умножение.",
                "4. Деление.",
                "5. Факториал.",
                "6. Возведение в степень.",
                "7. Сравнение.",
                "0. Вернуться назад."
        };
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        while (true){
            printMenu(options);
            option = scanner.nextInt();
                if (option == 1) {
                    printMenu(operations);
                    option = scanner.nextInt();
                    result = 0;
                    if (option == 1){
                        result = summ();
                    }
                    else if (option == 2){
                        result = subtraction();
                    }
                    else if (option == 3){
                        result = multiplication();
                    }
                    else if (option == 4){
                        result = division();
                    }
                    else if (option == 5){
                        result = factorial();
                    }
                    else if (option == 6){
                        exponentiation();
                        result = exponentiation();
                    }
                    else if (option == 7){
                        comparison();
                    }
                    else if (option == 0){
                        printMenu(options);
                        option = scanner.nextInt();
                    }
                }
                else if (option == 2){
                    if (result == 0) {
                        System.out.println("Решите пример, где результат будет != 0");
                    }
                    else {
                        printMenu(operations);
                        option = scanner.nextInt();
                        if (option == 1){
                            result = summ();
                        }
                        else if (option == 2){
                            result = subtraction();
                        }
                        else if (option == 3){
                            result = multiplication();
                        }
                        else if (option == 4){
                            result = division();
                        }
                        else if (option == 5){
                            result = factorial();
                        }
                        else if (option == 6){
                            exponentiation();
                            result = exponentiation();
                        }
                        else if (option == 7){
                            comparison();
                        }
                        else if (option == 0){
                            printMenu(options);
                            option = scanner.nextInt();
                        }
                    }
                }
                else if (option == 3){
                    System.exit(0);
                }

        }
    }

    public static int summ (){
        if (result != 0) {
            Scanner scanner = new Scanner(System.in);
            int a = result;
            System.out.println("Предыдущий результат = " + result);
            System.out.println("Введите второе число: ");
            int b = scanner.nextInt();
            int sum = a + b;
            System.out.println(" \"+\" " + a + " + " + b + " = " + sum);
            return sum;
        }
        else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число: ");
            int a = scanner.nextInt();
            System.out.println("Введите второе число: ");
            int b = scanner.nextInt();
            int sum = a + b;
            System.out.println(" \"+\" " + a + " + " + b + " = " + sum);
            return sum;
        }
    }

    public static int subtraction (){
        if (result != 0) {
            Scanner scanner = new Scanner(System.in);
            int a = result;
            System.out.println("Предыдущий результат = " + result);
            System.out.println("Введите второе число: ");
            int b = scanner.nextInt();
            int sub = a - b;
            System.out.println(" \"-\" " + a + " - " + b + " = " + sub);
            return sub;
        }
        else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число: ");
            int a = scanner.nextInt();
            System.out.println("Введите второе число: ");
            int b = scanner.nextInt();
            int sub = a - b;
            System.out.println(" \"-\" " + a + " - " + b + " = " + sub);
            return sub;
        }
    }

    public static int multiplication (){
        if (result != 0) {
            Scanner scanner = new Scanner(System.in);
            int a = result;
            System.out.println("Предыдущий результат =" + result);
            System.out.println("Введите второе число: ");
            int b = scanner.nextInt();
            int mul = a * b;
            System.out.println(" \"*\" " + a + " * " + b + " = " + mul);
            return mul;
        }
        else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число: ");
            int a = scanner.nextInt();
            System.out.println("Введите второе число: ");
            int b = scanner.nextInt();
            int mul = a * b;
            System.out.println(" \"*\" " + a + " * " + b + " = " + mul);
            return mul;
        }
    }

    public static int division (){
        if (result != 0) {
            Scanner scanner = new Scanner(System.in);
            int a = result;
            System.out.println("Предыдущий результат = " + result);
            System.out.println("Введите второе число: ");
            int b = scanner.nextInt();
            int div = a / b;
            System.out.println(" \"/\" " + a + " / " + b + " = " + div);
            return div;
        }
        else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число: ");
            int a = scanner.nextInt();
            System.out.println("Введите второе число: ");
            int b = scanner.nextInt();
            int div = a / b;
            System.out.println(" \"/\" " + a + " / " + b + " = " + div);
            return div;
        }
    }

    public static int factorial (){
        if (result != 0) {
            Scanner scanner = new Scanner(System.in);
            int a = result;
            System.out.println("Предыдущий результат = " + result);
            int result = 1;
            for (int i = 1; i <= a; ++i) {
                result = result * i;
            }
            System.out.println(" \"!\" " + a + "! = " + result);
            return result;
        }
        else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число: ");
            int a = scanner.nextInt();
            int result = 1;
            for (int i = 1; i <= a; ++i) {
                result = result * i;
            }
            System.out.println(" \"!\" " + a + "! = " + result);
            return result;
        }
    }

    public static int exponentiation (){
        if (result != 0) {
            Scanner scanner = new Scanner(System.in);
            int a = result;
            System.out.println("Предыдущий результат = " + result);
            System.out.println("Введите степень: ");
            int b = scanner.nextInt();
            int exp = (int) Math.pow(a, b);
            System.out.println(" \"^\" " + a + " ^ " + b + " = " + exp);
            return exp;
        }
        else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число, возводимое в степень: ");
            int a = scanner.nextInt();
            System.out.println("Введите степень: ");
            int b = scanner.nextInt();
            int exp = (int) Math.pow(a, b);
            System.out.println(" \"^\" " + a + " ^ " + b + " = " + exp);
            return exp;
        }
    }

    public static void comparison (){
        if (result != 0) {
            System.out.println("Действие невозможно");
        }
        else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число: ");
            int a = scanner.nextInt();
            System.out.println("Введите второе число: ");
            int b = scanner.nextInt();
            if (a > b) {
                System.out.println(" \"?\" " + a + " ? " + b + " = " + a + " > " + b);
            } else {
                System.out.println(" \"?\" " + a + " ? " + b + " = " + a + " < " + b);
            }
        }
    }
}
