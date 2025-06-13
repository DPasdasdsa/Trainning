import java.util.Scanner;

public class bai8_nhapscanner {
    public static void main(String[] args) {
        // khởi tạo 1 đối tượng scanner
        Scanner sc=new Scanner(System.in);

        //cho phép nhập chuỗi
        System.out.println("Mời nhập vào mâật khẩu cấp 1: ");
        String mk1 =sc.nextLine();
        System.out.println("mk cap 1 là: "+mk1);
        System.out.println();
        // cho phép nhập số nguyên
        System.out.println("Mời nhập vào 1 số nguyên: ");
        int a=sc.nextInt();
        System.out.println("a=  "+a);
        // nhập số float
        System.out.println("Mời nhập vào 1 số thực x: ");
        float x=sc.nextFloat();
        System.out.println("x= "+x);
        // nếu mà nhập chuỗi xong và nhập số tiếp và nhập chuỗi tiếp thì nó báo lỗi
        // nếu gặp trường hợp này ta nên khai báo từng đối tượng scanner
        // ví dụ như String m = new Scanner(System.in).nextLine();
    }
}
