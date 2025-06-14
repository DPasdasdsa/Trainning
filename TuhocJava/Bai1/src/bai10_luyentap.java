import java.util.Scanner;

public class bai10_luyentap {
    public static void main(String[] args) {
        //Viết chương trình nhập vào điểm trung bình, và kết quả xếp loại của học sinh
        //theo tiêu chuẩn sau:(dùng toán tử 3 ngôi)
        //Giỏi: Nếu điểm>=8
        //Khá: Nếu 8>Điểm>=6.5
        //Trung bình: Nếu 6.5>Điểm>=5
        //Yếu:Nếu Điểm<5
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào điểm trung bình của thí sinh: ");
        double n = sc.nextDouble();
        String xeploai=(n>=8)?"Giỏi":
                        (n>=6.5&&n<8)?"Khá":
                        (n>=5 &&n<6.5)?"Trung bình":"Yếu";
        System.out.println("Xếp loại "+xeploai);

    }
}
