import java.util.Scanner;

public class Bai9_luyentapif_else {
    public static void main(String[] args) {
        // tìm số lớn nhất trong 2 số nguyên
        System.out.println("Nhập số thứ nhất là: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Nhập số thứ hai là");
        int y = new Scanner(System.in).nextInt();
        if (x > y) {
            System.out.println("Số thứ nhất lớn nhất trong hai số");
        } else if (x<y) {
            System.out.println("Số thứ hai lớn nhất trong hai số");
        } else{
            System.out.println("Hai số bằng nhau");
        }
    }
}
