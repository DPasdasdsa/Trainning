import java.util.Scanner;

public class Bai14_luyentap2 {
    public static void main(String[] args) {
        //Nhập vào một số nguyên dương.Đếm xem số đó có bao nhiêu chữ số
        //ví dụ nh nhập 1234 thì kết quả là 4 chữ số
        System.out.println("Nhập vào một số nguyên dương: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dem=0;
        while(n>0){
            n=n/10;
            dem++;
        }
        System.out.println("Số vừa nhập có "+dem+" chữ số");
    }
}
