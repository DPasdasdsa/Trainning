public class Ontap_Vandung2 {
    public static void main(String[] args) {
        //In số đối xứng có 3 chữ số ví dụ 121,232,999,...
        for(int i=100;i<1000;i++){
           int hangtram=i/100;
           int hangdonvi=i%10;
           if(hangtram==hangdonvi){
               System.out.println("Số đối xứng có 3 chữ số là: "+i);
           }
        }
    }
}
