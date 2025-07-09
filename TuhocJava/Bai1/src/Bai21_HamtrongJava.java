public class Bai21_HamtrongJava {
    // Hàm có kiểu trả về return
    public static int cong(int a,int b){
        return a+b;
    }
    //Hàm không có kiểu trả về void
    public static void XinChao(String gioitinh){
        if(gioitinh.equals("female")){
            System.out.println("Xin chào tôi là nhân viên nữ");
        } else if(gioitinh.equals("male")){
            System.out.println("Xin chào tôi là nhân viên nam");
        } else{
            System.out.println("Bạn đã nhập sai giới tính");
        }
    }
    public static void main(String[] args) {
        int kq=cong(1,2);
        System.out.println("Kết quả phép cộng "+kq);
        //Gọi hàm xin chào do là kiểu void nên không được gán
        XinChao("female");
    }

}
