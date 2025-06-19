public class Bai16_VongLapFor {
    public static void main(String[] args) {
        for(int i=2;i<12;i+=2){
            System.out.println("i= "+i);
        }
        // tính tổng các số chẵn từ 0-10
        int tong =0;
        for(int i=0;i<=10;i+=2){
            tong+=i;
        }
        System.out.println("tong= "+tong);
    }
}
