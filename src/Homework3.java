import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        // размер масива
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива чисел: ");
        int age = in.nextInt();
        int[] a;
        a = new int[age];
        for (int i = 0; i < a.length; i++){
            System.out.println("Введите элемент масива : ");
            a[i] = in.nextInt();
                    }
        for (int i=0; i < a.length; i++) {
            System.out.print("Элемент массива - " + a[i] + ", ");

            System.out.println("Индекс массива - " + a[i]);
        }
        // Минимальное значение
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) min = a[i];
        }
        System.out.println("Минимальное значение: " + min);

        // Максимальное значение
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) max = a[i];
        }
        System.out.println("Максимальное значение: " + max);

        // вывод количества повторений числа 5

        int [] b = new int[]{2,5,4,3,7,5,5,4,7,5,5,8,5,5};

        int c = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] == 5) c++;
        }
        System.out.println("Колличество повторений " +  c);

      }
}
