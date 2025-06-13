import java.util.Scanner;

public class Bai9_luyentapif_else_baikho {
    public static void main(String[] args) {
        // Giải phương trình bậc 1 ax+b=0
        System.out.println("Giải phương trình bậc nhất");
        double x;
        System.out.println("Nhập hệ số a: ");
        double a= new Scanner(System.in).nextDouble();
        System.out.println("Nhập hệ số b: ");
        double b= new Scanner(System.in).nextDouble();
        if (a==0&& b!=0){
            System.out.println("Phương trình bậc nhất vô nghiệm");
        } else if (a==0&&b==0) {
            System.out.println("Phương trình bậc nhất vô số nghiệm");
        }else{
            x=-b/a;
            System.out.println("Phương trình bậc nhất có nghiệm duy nhất là: "+x);
        }
    }
}
