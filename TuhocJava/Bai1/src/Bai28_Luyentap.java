import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Bai28_Luyentap {
    public static void main(String[] args) {
        //Viết chương trình tạo ra 1 list có n phần tử,n nhập từ bàn phím
        //Các phần tử là số ngẫu nhiên từ (1,100)
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập 1 list có n phần tử là: ");
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>(n);
        Random rand=new Random();
        for(int i=0;i<n;i++){
            int randomnumber=rand.nextInt(100)+1;//do nó khởi tạo từ 0 lên 99 nên ta phải cộng 1 nó sẽ thành từ 1 đến 100 thỏa mãn đề bài
            list.add(randomnumber);
        }
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println(" ");
        ArrayList<Integer> list2=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            list2.add(list.get(i)*list.get(i));
        }
        System.out.println("1 list các phần tử bình phương là: "+list2);
        //in ra có bao nhiêu số nhỏ hn 80 và in ra in ra vị trí index các số đó
        ArrayList<Integer> list3=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list.get(i)<80){
                System.out.println("Những số nhỏ hơn 80 là: "+list.get(i));
                System.out.println("Và vị trí của số đó là: "+i);
            }
        }
        sc.close();
    }
}
