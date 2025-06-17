import java.util.Scanner;

public class bai14_luyentap {
    public static void main(String[] args) {
        System.out.println("Nhập vào một số: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n<1||n>99){
            System.out.println("Nhập lại n, n chỉ được phép từ 1-99");
            n = sc.nextInt();
        }
        System.out.println("Bạn đã nhập xong n= "+n);
    }
}
