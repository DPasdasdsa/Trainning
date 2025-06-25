import java.util.Scanner;

public class OnTap_VanDung5 {
    // Vẽ tam giác sao ngược
    public static void main(String[] args) {
        System.out.println("Nhập độ dài n để vẽ tam giác sao ngược là: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>0;i--){
            for(int j=1;j<=n;j++){
                if(j>=n+1-i){
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
