//Задача 1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int a=0; a<=n; a++){
            sum = sum + a;

        }
        System.out.println(sum);
    }
}