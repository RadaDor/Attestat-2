import java.util.Scanner;

public class Attest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два разных целых числа");
        int number = sc.nextInt();
        int number1 = sc.nextInt();

        //сумма чисел
        int sum = number + number1;
        System.out.println("Сумма введенных чисел равна " + sum);
        //разница чисел
        int diff = Math.abs(number - number1);
        System.out.println("Разница между введенными числами составляет " + diff);
        //от мин к макс
        int min = Math.min(number, number1);
        int max = Math.max(number, number1);
        System.out.println ("Ряд чисел между минимальным числом " + min + " и до максимального числа " + max + ":");
        for (int i = min; i <= max; i++) {
            System.out.print(i + " ");
        }
    }
}
