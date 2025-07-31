import java.util.HashMap;
import java.util.Scanner;

public class Bia29_Luyentap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vao dict chứa 10 username và password");
        HashMap<String, String> map = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            System.out.print("Nhập username: ");
            String username = sc.next();  // key

            System.out.print("Nhập password: ");
            String password = sc.next();  // value

            map.put(username, password);
        }
        System.out.println("Thông tin vừa nhập là: ");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
