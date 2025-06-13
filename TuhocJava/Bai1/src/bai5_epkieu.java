public class bai5_epkieu {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        // ep tu so theo kieu int-> double va ep mau so theo kieu int-> double
        double kq = (double) a/ (double) b;
        System.out.println(kq);
        // ep kieu hep ep nguoc lai
        int c=128;
        byte d=(byte) c;
        System.out.println(c);
        System.out.println(d);
        // do byte no nho hon int nen la gia tri cua no bi sai
    }
}
