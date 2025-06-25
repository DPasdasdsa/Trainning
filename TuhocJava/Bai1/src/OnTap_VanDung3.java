public class OnTap_VanDung3 {
    //Tìm số nhỏ nhất n sao cho 1+2+...+n>1000
    public static void main(String[] args) {
        int Tong=0;
        for (int i=1;;i++){
            Tong+=i;
            if(Tong>1000){
                System.out.println(i);
                break;
            }
        }
    }
}
