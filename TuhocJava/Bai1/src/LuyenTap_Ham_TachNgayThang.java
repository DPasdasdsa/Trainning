import java.util.Scanner;

public class LuyenTap_Ham_TachNgayThang {
    public static void tachNgay(String ngayThang) {
        String[] parts = ngayThang.split("/");  // Tách chuỗi theo dấu "/"

        if (parts.length == 3) {
            String ngay = parts[0];
            String thang = parts[1];
            String nam = parts[2];

            System.out.println("Ngày: " + ngay);
            System.out.println("Tháng: " + thang);
            System.out.println("Năm: " + nam);
        } else {
            System.out.println("Chuỗi không đúng định dạng dd/MM/yyyy");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập vào ngày/tháng/năm đúng định dạng: ");
        Scanner sc = new Scanner(System.in);
        String kq= sc.nextLine();
        tachNgay(kq);
    }
}
