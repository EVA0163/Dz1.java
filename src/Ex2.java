import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        System.out.print("Введите n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1;
        for (int a = 1; a<=n; a++){
            result = result * a;
        }
        System.out.println(result);
    }
}