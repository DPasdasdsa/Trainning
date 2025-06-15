import java.util.Scanner;

public class Bai11_switch_case {
    public static void main(String[] args) {
        System.out.println("Nhập vào 1 số: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //kiểm tra số dư a cho 2
        int  div=n%2;
        switch(div){
            case 0:
                System.out.println(n+ " là số chẵn");
                break;
            default:
                System.out.println(n+ " là số lẻ");
                break;
        }
    }
}
