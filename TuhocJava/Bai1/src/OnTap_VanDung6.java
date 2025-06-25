import java.util.Scanner;

public class OnTap_VanDung6 {
    //Vẽ hình thoi dùng vòng lồng lặp for
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài hình thoi (số lẻ): ");
        int n = sc.nextInt();

        // Phần trên của hình thoi (bao gồm dòng giữa)
        for (int i = 1; i <= n / 2 + 1; i++) {
            for (int j = 1; j <= n / 2 + 1 - i; j++) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.println("*");
            } else {
                System.out.print("*");
                for (int k = 1; k <= 2 * i - 3; k++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }

        // Phần dưới của hình thoi
        for (int i = n / 2; i >= 1; i--) {
            for (int j = 1; j <= n / 2 + 1 - i; j++) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.println("*");
            } else {
                System.out.print("*");
                for (int k = 1; k <= 2 * i - 3; k++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}
