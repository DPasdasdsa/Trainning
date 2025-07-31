import java.util.Scanner;

public class Bai26_luyentap3 {
    public static void main(String[] args) {
        /* Viết chương trình kiểm tra tính hợp lệ của mật khẩu:aaaaaAAAAA
                mật khẩu hợp lệ khi có ít nhất 6 ký tự
                chứa ít nất 1 chữ cái (chữ cái thường hoặc hoa đều được)
                chứa ít nhất 1 chữ số
                2. cho người dùng nhập vào mật khẩu để login/sosanh , nếu đúng mở cửa
                sai quá 5 lần khóa đăng nhập,thoát chương trình*/
        Scanner sc = new Scanner(System.in);
        String password="";
        //mời thiết lập mật khẩu và kiểm tra tính hợp lệ
        while (true){
            // Nhập mật khẩu từ người dùng
            System.out.println("Mời thiết lập mật khẩu: ");
            System.out.println("Mật khẩu ít nhất 6 ký tự, ít nhất 1 cữ cái, ít nhất 1 số");
            String newPassword = sc.nextLine();
            //Kiểm tra tính hợp l của mật khẩu mới
            if (checkMK(newPassword)==true){
                password = newPassword;
                System.out.println("Mật khẩu mới đã được thiết lập");
                break;
            }
            else {
                System.out.println("Mật khẩu không hợp lệ, xin vui lòng nhập lại");
            }
        }
        // Cho người dùng nhập mk để login
        // Số lần người dùng nhập sai mật khẩu
        int count=0;
        String login="";
        while (true){
            System.out.println("Nhập vào mật khẩu để login: ");
            login = sc.nextLine();
            //kiểm tra hợp lệ hay không
            if (login.equals(password)){
                System.out.println("Đăng nhập thành công");
                break;
            } else{
                System.out.println("Nhập lại mật khẩu do đã nhập sai mật khẩu: ");
                count++;
            }
            if (count==5){
                System.out.println("Bạn đã nhập sai mật khẩu quá 5 lần , đăng nhập bị khóa");
                break;
            }
        }
    }
    // hàm kiểm tra tính hợp lệ của mật khẩu
    public static boolean checkMK(String password){
        // kiểm tra độ dài
        if (password.length()<6){
            return false;
        }
        // kiểm tra xem mật khẩu có chứa ít nhất 1 chữ cái hay không
        boolean hasLetter=false;
        for(char c:password.toCharArray()){// chạy từng ký tự nghĩa là nó đẩy về mảng chứa từng ký tự một
            if (Character.isLetter(c)){
                hasLetter=true;
                break;
            }
            }
        if(hasLetter==false){
            return false;
        }
        boolean hasNumber=false;
        for(char c:password.toCharArray()){
            if (Character.isDigit(c)){
                hasNumber=true;
                break;
            }
        }
        if(hasNumber==false){
            return false;
        }
        return true;// nếu đúng tất cả return về true
    }
}
