import java.util.Scanner;

public class OnTap_VanDung {
    public static void main(String[] args) {
        // Tính tổng S = 1 + 1/2 + 1/3 + ... + 1/n
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n để tính tổng: ");
        n = sc.nextInt();

        float Tong = 0;
        for (int i = 1; i <= n; i++) {
            Tong += 1.0 / i;
        }

        System.out.printf("Tổng: %.2f\n", Tong);
    }
}
