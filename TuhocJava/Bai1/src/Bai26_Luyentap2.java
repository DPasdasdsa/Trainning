public class Bai26_Luyentap2 {
    public static void main(String[] args) {
        String str1="English = 78 Science =83 Math=68 History=65";
        //tính tổng các số trong chuỗi trên
        //tính trung bình cộng
        int demso=0;
        int tong=0;
        for (int j=0;j<str1.length();j++){
            char c=str1.charAt(j);
            if (Character.isDigit(c)){
                demso++;
                tong+=c-'0';
            }
        }
        System.out.println("Tổng các số trong chuỗi trên là: "+tong);
        float tbc=tong/(float)demso;
        System.out.println("Trung bình cộng các số trong chuỗi trên là: "+tbc);
    }
}
