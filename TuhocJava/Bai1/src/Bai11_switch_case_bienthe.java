import java.util.Scanner;

public class Bai11_switch_case_bienthe {
    public static void main(String[] args) {
        System.out.println("Nhập vào 1 tháng: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch(n){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng có 31 ngày");
                break;
                case 4:
                case 6:
                case 9:
                case 11:
                         System.out.println("Tháng có 30 ngày");
                         break;
                case 2:
                                    System.out.println("Tháng có 28 hoặc 29 ngày");
                                    break;
                default:
                                        System.out.println("Không có tháng đó");
                                        break;

        }
    }
}
