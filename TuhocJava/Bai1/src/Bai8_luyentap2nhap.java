import java.util.Scanner;

public class Bai8_luyentap2nhap {
    public static void main(String[] args) {
        float x,y;
        do {
            System.out.println("Nhập chiều dài hình chữ nhật là: ");
            Scanner sc = new Scanner(System.in);
             x = sc.nextFloat();
            System.out.println("Nhập chiều rộng hình chữ nhật là: ");
             y = sc.nextFloat();
             /*double chuvi=(x+y)*2;
             double dientich=x*y;
            System.out.println("Chu vi hình chữ nhật là: "+chuvi);
            System.out.println("Diện tích hình chữ nhật là: "+dientich);*/
            if (x <= 0 || y <= 0) {
                System.out.println("Chiều dài và chiều rộng phải là số dương. Vui lòng nhập lại.\n");
            }
        } while (x<=0 || y<=0);
        double chuvi=(x+y)*2;
        double dientich=x*y;
        System.out.println("Chu vi hình chữ nhật là: "+chuvi);
        System.out.println("Diện tích hình chữ nhật là: "+dientich);
    }
}
