import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bai28_Collection {
    public static void main(String[] args) {
        // Khai báo list
        ArrayList<Integer> lst=new ArrayList<>();
        // khai báo với số lượng phần tử ban đầu
        ArrayList<Integer> lst2=new ArrayList<>(5);// với 5 phần tử
        // khởi tạo list với các pt ban đầu
        ArrayList<Integer> lst3=new ArrayList<>(List.of(8,9,7,6,5,10));
        // xuất list
        System.out.println(lst);
        System.out.println(lst2);
        System.out.println(lst3);
        // thêm phần tử
        ArrayList<Integer> lst4=new ArrayList<>();
        //add pt
        lst4.add(8);
        lst4.add(9);// in vào cuối tương tự
        lst4.add(7);
        lst4.add(6);
        System.out.println("lst4 vừa mới thêm vào"+lst4);
        //add vị trí chỉ định
        lst4.add(0,99);
        System.out.println(lst4);
        //size trả về s phần tử
        System.out.println("Số phần tử của lst4 là: "+lst4.size());
        //get trả về giá trị list tại vị trí index
        System.out.println(lst4.get(4));
        //xóa remove tại 1 vị trí index
        lst4.remove(2);
        System.out.println(lst4);
        //xóa giá trị chỉ định
        ArrayList<Integer> lst5=new ArrayList<>(List.of(8,9,7,6,5,10));
        System.out.println("lst5: "+lst5);
        lst5.remove(Integer.valueOf(6));
        System.out.println(lst5);
        //set thay đổi thông tin (index,giá trị)
        ArrayList<Integer> lst6=new ArrayList<>(List.of(8,9,7,6,5,10));
        lst6.set(0,99);
        System.out.println(lst6);
        //contains() kiểm tra xem collection có chứa phần t nào hay không
        ArrayList<Integer> lst7=new ArrayList<>(List.of(8,9,7,6,5,10));
        boolean ktra=lst7.contains(8);
        System.out.println(ktra);
        //sort sắp xếp tăng dần
        ArrayList<Integer> lst8=new ArrayList<>(List.of(8,9,7,6,5,10));
        Collections.sort(lst8);
        System.out.println(lst8);
        //indexOf(): tìm vị trí đầu tiên của element trong list
        //nếu 0 tồn tại trả về -1
        ArrayList<Integer> lst9=new ArrayList<>(List.of(8,9,7,6,5,10));
        System.out.println(lst9.indexOf(9));
        // nó sẽ trả về 1 do vị trí
        //Duyệt list
        ArrayList<Integer> lst10=new ArrayList<>(List.of(8,9,7,6,5,10));
        System.out.println("lst10 duyệt for");
        for (int vl:lst10){
            System.out.println(vl);
        }
        //cách 2
        for (int i=0;i<lst10.size();i++){
            System.out.println(lst10.get(i));
        }
    }
}
