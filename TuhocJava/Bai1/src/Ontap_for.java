public class Ontap_for {
    public static void main(String[] args) {
        //Tính tổng S=1+2!+3!+...+10!
        int Tong=0;
        for(int i=1;i<=10;i++){
            int giaithua=1;
            for(int j=i;j>0;j--){
               giaithua=giaithua*j;
            }
            Tong=Tong+giaithua;
        }
        System.out.println("Tong="+Tong);
    }
}
