import java.util.Scanner;

public class LuyenTap_Ham {
    public static String GiaiPTB2(double a, double b, double c) {
        // nếu a=0 thì pt trở thành ptbn bx+c=0
        if (a == 0) {
            if (b == 0 && c == 0) {
                return "PT Bậc nhất vô số nghiệm";
            } else if (b == 0 && c != 0) {
                return "PT Bậc nhất vô nghiệm";
            } else {
                return "PT bâậc nhất có nghiệm" + (-c / b);
            }
        } else {
            //giải ptb2
            double delta = (b * b) - 4 * a * c;
            if (delta < 0) {
                return "PT bậc 2 VN";
            } else if (delta == 0) {
                double x = -b / (2 * a);
                return "pt bậc 2 có nghiệm kép x =" + x;
            } else if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                return "PT bậc 2 có 2 nghiệm phân biệt x1=" + x1 + " ; x2= " + x2;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String kq=GiaiPTB2(1, 2, 3);
        System.out.println("Kết quả là: "+kq);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập vào số b: ");
        double b = sc.nextDouble();
        System.out.println("Nhập vào số c: ");
        double c = sc.nextDouble();
        String kq2 = GiaiPTB2(a, b, c);
        System.out.println("Kết quả vừa nhập các hệ số của PT bậc 2 là: "+kq2);

    }
}
