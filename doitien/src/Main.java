import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ứng dụng đổi tiền");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào Dollar : ");
        double dollar = scanner.nextDouble();
        double rate = dollar * 23000;

        System.out.printf("%2.0f dollar = %2.0f Vnđ", dollar, rate);
    }
}
