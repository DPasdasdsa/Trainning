import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Bai22_luyentap_datetime {
    //Cách 1
    /*public static void main(String[] args) {
        //Viết chương trình nhập vào ngày tháng năm sinh
        //cho biết số tuổi in ra màn hình
        Calendar cal = Calendar.getInstance();
        System.out.println("Nhập ngày sinh: ");
        Scanner sc = new Scanner(System.in);
        int ngay=sc.nextInt();
        System.out.println("Nhập vào tháng sinh: ");
        int thang=sc.nextInt();
        System.out.println("Nhập vào năm sinh: ");
        int namsinh=sc.nextInt();
        cal.set(Calendar.YEAR,namsinh);
        cal.set(Calendar.MONTH,thang-1);
        cal.set(Calendar.DAY_OF_MONTH,ngay);
        int ngaysinh=cal.get(Calendar.DAY_OF_MONTH);
        int thangsinh=cal.get(Calendar.MONTH);
        int namsinh2=cal.get(Calendar.YEAR);
        System.out.println("Tôi sinh ngày: "+ngaysinh+" tháng: "+(thangsinh+1)+" năm: "+namsinh2);
        //tính tuổi
        Calendar now = Calendar.getInstance();
        int namhientai=now.get(Calendar.YEAR);
        //tính
        int tuoi=namhientai-namsinh;
        System.out.println("Tuổi của người vừa nhập là: "+tuoi);

    }*/
    //Cách 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
        String input = sc.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false); // không cho phép ngày tháng không hợp lệ như 32/13/2023

        try {
            Date ngaySinh = sdf.parse(input); // chuyển từ chuỗi sang Date

            // Tạo Calendar từ ngày sinh
            Calendar calNgaySinh = Calendar.getInstance();
            calNgaySinh.setTime(ngaySinh);

            // Lấy ngày hiện tại
            Calendar calHienTai = Calendar.getInstance();

            // Tính tuổi: năm hiện tại - năm sinh
            int tuoi = calHienTai.get(Calendar.YEAR) - calNgaySinh.get(Calendar.YEAR);

            // Kiểm tra nếu chưa tới sinh nhật năm nay thì trừ đi 1 tuổi
            if (
                    calHienTai.get(Calendar.MONTH) < calNgaySinh.get(Calendar.MONTH) ||
                            (calHienTai.get(Calendar.MONTH) == calNgaySinh.get(Calendar.MONTH) &&
                                    calHienTai.get(Calendar.DAY_OF_MONTH) < calNgaySinh.get(Calendar.DAY_OF_MONTH))
            ) {
                tuoi--;
            }

            System.out.println("Tuổi hiện tại là: " + tuoi);

        } catch (ParseException e) {
            System.out.println("Sai định dạng ngày! Vui lòng nhập theo dd/MM/yyyy");
        }
    }
}
