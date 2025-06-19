import java.util.Scanner;

public class Bai16_In_tamgiaccan {
    public static void main(String[] args) {
        //Nhập n, vẽ hình để tạo hình kim tự tháp đối xứng giống tam giác cân
      /*  System.out.println("Nhập n là số hàng để vẽ kim tự tháp là: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<2*n-1;j++){
                if(i==n-1||j==i+n-1||j==n-1-i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();*/
        //code trên là code về tam giác cân  rỗng
       // còn code dưới đây là code về tam giác cân đặc
        System.out.print("Nhập n là số hàng để vẽ kim tự tháp: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                if (j >= n - 1 - i && j <= n - 1 + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
