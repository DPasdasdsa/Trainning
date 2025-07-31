import java.util.HashMap;

public class Bai29_Hasmap {
    public static void main(String[] args) {
        // khai báo
        HashMap<Integer,Integer> map = new HashMap<>();
        //thêm phần tử (key,value) và key là duy nhất
        map.put(1, 1);
        map.put(2, 2);
        //lấy giá trị của nó
        //Integer value =map.get(1);
        System.out.println(map.get(1));
        //xóa phần tử khỏi hasmap
        map.remove(1);
        System.out.println(map.get(1));
        // Kiểm tra xem một phần tử có tồn tại trong map hay không kiểm tra key
        boolean check=map.containsKey(2);
        System.out.println(check);
        // Kiểm tra xem một giá trị có tồn tại trong map hay không kiểm tra value
        boolean check2=map.containsValue(2);
        System.out.println(check2);
        // Kiểm tra hashmap có rỗng hay không
        boolean check3=map.isEmpty();
        System.out.println(check3);
        //Lấy số lượng phần tử trong hashmap
        System.out.println("Số lượng phần tử trong map là: "+map.size());
        //Duyệt từng phần tử
        for (int key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
