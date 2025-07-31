import java.util.Arrays;
import java.util.Scanner;

public class Bai27_Mang {
    public static void main(String[] args) {
       /* // Khai báo mảng
        String[] mangstr;
        float[] mangfl;
        double[] mangdbl;

        //Khởi tạo mạng kèm theo kích thước
        String[] mangstr2 = new String[3];
        int[] mangnguyen =new int[3];
        //Khởi tạo mảng kèm gi trị ban đầu
        String[] mangstr3 = new String[]{"Chí phèo","Thị nở","Ông giáo"};
        int[] mangnguyen2 =new int[]{1,2,3,4,5,6,7};
        // Cách 1
        for (int i = 0; i < mangstr3.length; i++) {
            System.out.println(mangstr3[i]);
            System.out.println(mangstr3.length);
        }
        // Cách 2
        for (int pt :mangnguyen2){
            System.out.println(pt);
        }
    }*/ // buổi 1
        //buổi 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử tối đa của mảng");
        int n = sc.nextInt();
        //tạo mảng có n phần tử(cấp phát bộ nhớ cho mảng)
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        //xuất mảng ra
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        // sắp xếp tăng dần
        int[] b={8,9,7,6,5,10};
        Arrays.sort(b);
        System.out.println("Mảng sau sắp xếp là:");
        System.out.println(Arrays.toString(b));// chuyển số thành chuỗi
        // Đảo ngược chuỗi
        for(int i=0, j=b.length-1;i<j;i++,j--){
            int temp=b[i];
            b[i]=b[j];
            b[j]=temp;
        }
        //xuất mảng đảo ngược chuỗi là
        System.out.println("Mảng đảo ngược chuỗi là: ");
        System.out.println(Arrays.toString(b));
        //phép gán mảng
        // nếu 2 int[] mang10=mang9 thì khi thay đổi của 1 mảng thì mảng còn lại thay đổi
        //do mảng có kiểu tham chiếu , nó sẽ tham chiếu đến 1 vùng nhớ
        //còn nếu mà gán mảng mà khi thay đổi mảng đã tồn tải mà muốn mảng mới không thay đổi ta dùng clone mảng
        // ví dụ
        int [] mang11={1,2,3,4,5};
        int [] mang12=mang11.clone();
        mang11[0]=9;
        System.out.println(Arrays.toString(mang11));
        System.out.println(Arrays.toString(mang12));
    }
}
