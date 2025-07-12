public class Bai23_Math_java {
    public static void main(String[] args) {
        System.out.println("Pi: "+Math.PI);
        //trị tuyệt đối
        int a=-8;
        System.out.println(Math.abs(a));
        //max,min
        System.out.println(Math.max(7,8));
        System.out.println(Math.min(8,9));
        //căn bậc 2
        System.out.println(Math.sqrt(8));
        //lũy thừa
        System.out.println(Math.pow(2,3));
        //sin,cos,tan
        int goc=90;
        double sin=Math.sin(Math.PI*goc/180);//quy đổi radian sang góc
        double cos=Math.cos(Math.PI*goc/180);
        double tan =Math.tan(Math.PI*goc/180);
        System.out.println("Sin 90= "+sin);
        System.out.println("Cos= "+cos);
        System.out.println("Tan= "+tan);
    }
}
