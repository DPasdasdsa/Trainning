import java.util.Scanner;

public class Bai15_Luyentap {
    public static void main(String[] args) {
        //Nhập số nguyên dương .Nếu nhập sai thì báo lỗi và bắt nhập lại
        Scanner sc = new Scanner(System.in);
       int n;
        do{
            System.out.print("Nhập một số nguyên dương: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Lỗi: Bạn phải nhập một số nguyên dương. Vui lòng thử lại.");
            }

        }while(n<=0);
        System.out.println("Bạn đã nhập số hợp lệ: "+n);
    }
}
