import java.util.Random;

public class Bai24_Random {
    public static void main(String[] args) {
        //khởi tạo 1 đối tượng ngẫu nhiên
        Random rand = new Random();
        // lấy ngẫu nhiên 1 số
        int songuyen=rand.nextInt(-50,51);//chạy từ -50 đến nhỏ hơn 51
        System.out.println("songuyen="+songuyen);
        //trường hợp 2
        int songuyen2=rand.nextInt(50);//chạy từ 0 đến 50
        //chạy ngẫu nhiên số thực
        double x=rand.nextDouble(-100,100);
        // nó tương tự số nguyên
        System.out.println("x="+x);

    }
}
