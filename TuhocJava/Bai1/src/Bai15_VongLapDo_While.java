public class Bai15_VongLapDo_While {
    public static void main(String[] args) {
        // tính tổng các số 1-5
        int a=1;
        int tong=0;
        do{
            tong+=a;//tong=tong+a;
            a++;
        }while (a<=5);
        System.out.println("tong= "+tong);
    }
}
