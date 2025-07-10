import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Bai22_date_time {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);// in toàn bộ thông tin của đối tượng của cal này và tháng chạy từ 0-11
       // System.out.println(cal.get(Calendar.YEAR));
        //lấy thông tin ngày tháng năm
        int nam=cal.get(Calendar.YEAR);
        int thang=cal.get(Calendar.MONTH)+1;// do tháng nó chạy từ 0-11 nên phải cộng với 1 mới đúng
        int ngay=cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("Hôm nay là ngày: "+ngay+" tháng: "+thang+" năm: "+nam);
        // set ngày tháng năm theo ý muốn hay còn gọi là gán đó
        cal.set(Calendar.YEAR,2003);
        cal.set(Calendar.MONTH,02);// nếu mà set up cho người dùng nhập thì phải tháng-1 còn lấy ra thì +1
        cal.set(Calendar.DAY_OF_MONTH,02);
        int namsinh=cal.get(Calendar.YEAR);
        int thangsinh=cal.get(Calendar.MONTH)+1;
        int ngaysinh=cal.get(Calendar.DAY_OF_MONTH);
        //kiểm tra ngày tháng sau khi thay đổi
        System.out.println("Tôi sinh ngày: "+ngaysinh+" tháng: "+thangsinh+" năm: "+namsinh);

        //xuất theo định dạng
        SimpleDateFormat dinhdang = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");//khai báo đối tượng để định dạng muốn in ra màn hình
        //tạo 1 đối tượng date để gettime trong đối tượng cal
        Date d =cal.getTime();
        String s=dinhdang.format(d);// ép nó về định dạng mong muốn
        System.out.println(s);
    }
}
