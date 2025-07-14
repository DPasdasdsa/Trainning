import java.util.Scanner;

public class Bai26_Timhieu_char {
    public static void main(String[] args) {
        //char là viết 1 ký tự
        //khai báo
        char ch='a'; // khai báo char dùng nháy đơn thôi
        char ch2=66;// dùng mã ascii cũng được
        System.out.println(ch2);
        char ch3;//khai báo
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào 1 ký tự: ");
        String str=sc.nextLine();
        char ch4=str.charAt(0);//lấy ký t tại vị trí 0
        System.out.println("Ký tự vừa nhập là: "+ch4);
        // compareTo: So sánh 2 ký tự =>trả về 1 số nguyên ký t 1 >ký tự 2 thì tra dương ngược lại tóm lại mã ascii chữ cái đầu trừ đi mã ascii mã sau dùng lớp Character
        System.out.println(Character.compare('b','b'));
        System.out.println(Character.compare('a','b'));
        System.out.println(Character.compare('b','a'));
        //| **Tên phương thức**        | **Mục đích**                                                  |
        //| -------------------------- | ------------------------------------------------------------- |
        //| `isLetter(char ch)`        | Kiểm tra ký tự có phải là **chữ cái**                         |
        //| `isDigit(char ch)`         | Kiểm tra ký tự có phải là **chữ số**                          |
        //| `isLetterOrDigit(char ch)` | Kiểm tra có phải **chữ cái hoặc chữ số**                      |
        //| `isUpperCase(char ch)`     | Kiểm tra có phải **chữ in hoa**                               |
        //| `isLowerCase(char ch)`     | Kiểm tra có phải **chữ thường**                               |
        //| `isWhitespace(char ch)`    | Kiểm tra có phải **khoảng trắng**                             |
        //| `toUpperCase(char ch)`     | Chuyển ký tự thành **chữ in hoa**                             |
        //| `toLowerCase(char ch)`     | Chuyển ký tự thành **chữ thường**                             |
        //| `isDefined(char ch)`       | Kiểm tra ký tự có nằm trong **Unicode**                       |
        //| `isSpaceChar(char ch)`     | Kiểm tra có phải ký tự **space** Unicode                      |
        //| `getNumericValue(char ch)` | Lấy giá trị số nếu ký tự là **số**                            |
        //| `charValue()`              | Trả về giá trị **char nguyên thủy** của đối tượng `Character` |
        //| `compare(char x, char y)`  | So sánh 2 ký tự                                               |
        //| `equals(Object obj)`       | So sánh đối tượng `Character`                                 |
        //| `hashCode()`               | Trả về hash code của đối tượng `Character`                    |
        //| `toString(char ch)`        | Chuyển ký tự thành chuỗi **String**                           |

    }
}
