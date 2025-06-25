public class OnTap_VanDung4 {
    //Tìm các số "Armstrong" 3 chữ số
    public static void main(String[] args) {
        for(int i=100;i<1000;i++){
            int a=i/100;
            int b=(i/10)%10;
            int c=i%10;
            if(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)==a*100+b*10+c*1){
                System.out.println("Số thỏa mãn yêu cầu là: "+i);
            }
        }
    }
}
