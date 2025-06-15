import java.util.Scanner;

public class Bai11_luyentap {
    public static void main(String[] args) {
        System.out.println("Mời bấm số để chọn:\n" +
                "1.Tìm theo tên\n" +
                "2.Tìm theo tác giả\n" +
                "3.Tìm theo nhà xuất bản\n" +
                "4.Tìm theo tiêu đề");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch(n){
            case 1:
                System.out.println("Tìm kiếm tên");
                break;
            case 2:
                System.out.println("Tìm kiếm tác giả");
                break;
            case 3:
                System.out.println("Tìm theo nhà xuất bản");
                break;
            case 4:
                System.out.println("Tìm theo tiêu đề");
                break;
            default:
                System.out.println("Phím bấm không hợp lệ");
        }

    }
}
