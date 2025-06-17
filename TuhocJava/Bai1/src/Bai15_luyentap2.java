import java.util.Scanner;

public class Bai15_luyentap2 {
    public static void main(String[] args) {
        //Cho người dùng nhập nhiều số.Mỗi số kiểm tra xem
        //chỉ phải số nguyên tố không.Chỉ thoát chương trình nếu người dùng chọn."Không muốn kiểm tra nữa"
        Scanner sc = new Scanner(System.in);
        int luachon;

        do {
            // In menu
            System.out.println("====== MENU ======");
            System.out.println("1. Kiểm tra số nguyên tố");
            System.out.println("0. Thoát");
            System.out.print("Mời bạn chọn: ");
            luachon = sc.nextInt();

            switch (luachon) {
                case 1:
                    System.out.print("Nhập số nguyên cần kiểm tra: ");
                    int n = sc.nextInt();

                    if (n < 2) {
                        System.out.println(n + " không phải là số nguyên tố.");
                    } else {
                        boolean laNguyenTo = true;
                        for (int i = 2; i <= Math.sqrt(n); i++) {
                            if (n % i == 0) {
                                laNguyenTo = false;
                                break;
                            }
                        }
                        if (laNguyenTo) {
                            System.out.println(n + " là số nguyên tố.");
                        } else {
                            System.out.println(n + " không phải là số nguyên tố.");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Bạn đã thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
            }

            System.out.println(); // Xuống dòng cho dễ nhìn
        } while (luachon != 0);
    }
    }

