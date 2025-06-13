import java.util.Scanner;

public class bai9_if_else {
    public static void main(String[] args) {
        // bài toán kiểm tra số nguyên là  chẵn hay lẻ
        System.out.println("Nhập số để kiểm tra: ");
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        if(x%2==0){
            System.out.println("Số bạn vừa nhập là số chẵn");
        }
        else {
            System.out.println("Số bạn vừa nhập là số lẻ");
        }
    }
}
