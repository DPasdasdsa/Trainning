import java.util.Scanner;

public class Bai16_Luyentap {
    public static void main(String[] args) {
        //Cho số nguyên n, in ra hình vuông rỗng cạnh n bằng dẫu *
        System.out.println("Nhập cạnh hình vuông có độ dài n= ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||i==n-1||j==0||j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
