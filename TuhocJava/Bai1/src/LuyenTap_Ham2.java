import java.util.Scanner;

public class LuyenTap_Ham2 {
    public static String Kiemtra(double a,double b){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào phép tính (+,-,*,/)");
        String kq;
        kq = sc.nextLine();
        if(kq.equals("+")){
            return "Kết quả phép cộng là: "+(a+b);
        }else if(kq.equals("-")){
            return "Kết quả phép trừ là: "+(a-b);
        }else if(kq.equals("*")){
            return"Kết quả phép nhân là: "+(a*b);
        }else if(kq.equals("/")){
            return "Kết quả phép chia là: "+(a/b);
        }
        return kq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a là: ");
        double a = sc.nextDouble();
        System.out.println("Nhập số b là: ");
        double b = sc.nextDouble();
        String kq = Kiemtra(a,b);
        System.out.println("Kết quả mà bạn chọn là: "+kq);
    }
}
