public class Bai17_Break_Continue {
    public static void main(String[] args) {
        // tính tổng các số từ 1-5 bỏ qua số 3
        int tong=0;
        for(int i=0;i<=5;i++){
            if(i==3){
                continue; // bỏ qua
            }
            else {
                tong+=i;
            }
        }
        System.out.println("Tổng= "+tong);
        // break
        int n=0;
        while(n<100){
            System.out.println("n= "+n);
            if(n==15){
                break;
            }
            n++;
        }
    }
}
