import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai20_Luyentap {
    public static void main(String[] args) {
        // Xử lý người dùng nhập sai dữ liệu với Scanner
        int x;
        System.out.println("Nhập số x để kiểm tra: ");
        Scanner sc=new Scanner(System.in);
        try{
            x=sc.nextInt();
            System.out.println("x= "+x);
        }catch(InputMismatchException e){
            System.out.println("Bạn nhập lại phải là số nguyên ");
        }
    }
}
