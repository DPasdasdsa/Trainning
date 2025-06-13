import java.util.Scanner;

public class bai8_luyentapnhap {
    public static void main(String[] args) {
        System.out.println("Nhập bán kính đường tròn là: ");
        Scanner sc1=new Scanner(System.in);
        float a= sc1.nextFloat();
        // chúng ta dùng thư viện Math để dùng pi và hàm mũ
        float chuvi= (float) (2*Math.PI*a);
        float dientich= (float)(Math.PI*Math.pow(a,2));
        System.out.println("Chu vi đường tròn là: "+chuvi);
        System.out.println("Diện tích đường tròn là: "+dientich);

    }
}
