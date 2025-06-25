import java.util.Scanner;

public class Luyentap_for_while {
    public static void main(String[] args) {
        int n ;
        System.out.println("Nhập giá trị số nguyên n: ");
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
        while(n<0){
            System.out.println("Nhập lại giá trị số nguyên lớn hơn 0");
             n=sc.nextInt();
        }
        int giaithua = 1;
        for(int i=0;i<n;i++){
            giaithua *=n-i;
        }
        System.out.println("n!= "+giaithua);
    }
}
