public class Bai20_XuLyNgoaiLe {
    public static void main(String[] args) {
        int a=10;
        int b=0;

        try{
            int c=a/b;
            System.out.println("c "+c);
        }
        catch(ArithmeticException e){// nó sẽ ưu tiên bắt lỗi cụ thể trước nếu không bắt được nó mới nhảy catch sau
            System.out.println("Có lỗi toán học rồi thím ơi ");
            e.printStackTrace();
        }
        catch(Exception e){
            System.out.println("Có lỗi rồi thím ơi ");
            e.printStackTrace();
        }
        finally {
            System.out.println("Có lỗi hay không lỗi đều phải làm cái này");
        }

        System.out.println("Đoạn code phía sau");
    }
}
// ArithmeticException ex // dùng nó khi mình biết cụ thể của một lỗi xảy ra
// Exception ex // nên dùng nó hơn khi không đoán ra lỗi cụ thể
//thường dùng 2 lỗi này
// | ❓ **Tên lỗi (Exception)**        | 💥 **Khi nào xảy ra**                              | 📚 **Giải thích / Công dụng**                          | 🧩 **Loại**     |
//| -------------------------------- | -------------------------------------------------- | ------------------------------------------------------ | --------------- |
//| `ArithmeticException`            | Chia cho 0 (`a / 0`)                               | Tránh crash khi tính toán                              | Runtime         |
//| `InputMismatchException`         | Nhập sai kiểu dữ liệu với `Scanner`                | Dùng để yêu cầu nhập lại đúng kiểu                     | Runtime         |
//| `NumberFormatException`          | Dùng `parseInt("abc")` hoặc tương tự               | Kiểm tra chuỗi hợp lệ trước khi ép kiểu                | Runtime         |
//| `ArrayIndexOutOfBoundsException` | Truy cập chỉ số mảng không tồn tại (`a[10]`)       | Giúp kiểm tra logic chỉ số                             | Runtime         |
//| `NullPointerException`           | Gọi `.method()` trên biến `null`                   | Kiểm tra biến đã khởi tạo chưa                         | Runtime         |
//| `FileNotFoundException`          | Mở file không tồn tại                              | Kiểm tra sự tồn tại của file                           | **Checked**     |
//| `IOException`                    | Lỗi khi thao tác đọc/ghi file hoặc I/O             | Dùng để xử lý lỗi file hoặc mạng                       | **Checked**     |
//| `ClassNotFoundException`         | Không tìm thấy class khi dùng `Class.forName()`    | Thường dùng với JDBC, Reflection                       | **Checked**     |
//| `IllegalArgumentException`       | Truy tham số sai vào phương thức (VD: âm, null...) | Dùng để kiểm tra dữ liệu đầu vào                       | Runtime         |
//| `IllegalStateException`          | Gọi sai phương thức trong trạng thái không hợp lệ  | Dùng kiểm tra logic trạng thái                         | Runtime         |
//| `SQLException`                   | Lỗi khi thao tác với cơ sở dữ liệu SQL             | Bắt lỗi kết nối, câu lệnh SQL, v.v.                    | **Checked**     |
//| `RuntimeException`               | Cha của các Runtime Exception ở trên               | Có thể dùng để bắt chung nhiều lỗi                     | Runtime         |
//| `Exception`                      | Tất cả các lỗi có thể bắt                          | Dùng khi không muốn liệt kê cụ thể (cẩn thận khi dùng) | **Checked**     |
//| `Throwable`                      | Cha của Exception và Error                         | Dùng để bắt mọi lỗi kể cả nghiêm trọng (*ít dùng*)     | Gốc của mọi lỗi |