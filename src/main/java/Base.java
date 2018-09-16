import java.util.Scanner;

/**
 * @author Khaustovich E.
 */

public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите вариант выполнения: 1 - калькулятор, 2 - массив строк");
        int task = scanner.nextInt();
        //калькулятор
        if (task == 1) {
            System.out.println("Выберите операцию: 1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление");
            int i = scanner.nextInt();
            System.out.println("Введите 1 число");
            double m = scanner.nextDouble();
            System.out.println("Введите 2 число");
            double n = scanner.nextDouble();
            double result = 0;
            if (i == 1) {
                result = m + n; //сложение
                System.out.printf("Результат вычисления: %.4f", result);
            } else if (i == 2) {
                result = m - n; //вычитание
                System.out.printf("Результат вычисления: %.4f", result);
            } else if (i == 3) {
                result = m * n; //умножение
                System.out.printf("Результат вычисления: %.4f", result);
            } else if (i == 4) {
                result = m / n; //деление
                System.out.printf("Результат вычисления: %.4f", result);
            } else System.err.println("Неправильно выбрана операция");
        }
        //длина строки
        if (task == 2) {
            System.out.println("Введите размерность массива");
            int razm = scanner.nextInt();
            String[] array1 = new String[razm];
            int[] array2 = new int[razm];
            System.out.println("Введите строки массива");
            for (int k = 0; k < array1.length; k++)
                array1[k] = scanner.next();
            //считаем количество символов в каждом элементе array1
            for (int k = 0; k < array1.length; k++) {
                int p = 0;
                for (int kol = 0; kol < array1[k].length(); kol++) {
                    p++;
                }
                array2[k] = p;
            }
            //ищем максимум
            int max = array2[0];
            for (int k = 1; k < array2.length; k++) {
                if (max < array2[k]) {
                    max = array2[k];
                }
            }
            //выводим строки с максимальной длиной
            for (int k = 0; k < array2.length; k++) {
                if (max == array2[k]) {
                    System.out.println("Строка с максимальной длиной: " + array1[k]);
                }
            }


        }


        scanner.close();


    }
}

