import java.util.Scanner;

public class Bai26_Luyentap {
    public static void main(String[] args) {
        //Nhập 1 chuỗi từ bàn phím
        //đếm xem có bao nhiêu ký tự thường
        //bao nhiêu in hoa
        //bao nhiêu số
        // bao nhiêu space
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời nhập vào 1 chuỗi: ");
        String str=sc.nextLine();
        // gán biến đếm
        int demso=0;
        int deminthuong=0;
        int deminhoa=0;
        int demspcae=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);// lấy được giá trị từ index của ký tự đó ra
            if(Character.isLowerCase(ch)){
                deminthuong++;
            }
            else if(Character.isUpperCase(ch)){
                deminhoa++;
            }
            else if(Character.isDigit(ch)){
                demso++;
            }
            else if(Character.isWhitespace(ch)){
                demspcae++;
            }
        }
        System.out.println("Số lượng ký tự thường"+deminthuong+" đếm in hoa"+deminhoa+" dem so"+demso+" đếm khoảng trắng"+demspcae);
    }
}
