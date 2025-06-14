import java.util.Scanner;

public class bai10_toan_tu_ba_ngoi {
    public static void main(String[] args) {
        // nhập vào bàn phím 1 số kiểm tra chẵn hay lẻ
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số nguyên n: ");
        int n = sc.nextInt();
        String traloi=(n%2==0)?"chẵn":"lẻ";
        System.out.println("Số vừa nhập là số: "+traloi);
    }
}
