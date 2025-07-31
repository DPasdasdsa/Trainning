public class bai26_timhieuve_string {
    public static void main(String[] args) {
        String s="Hồi đó tôi chê mồm em rộng+ " +
                "\n Không tin hai đứa";;
                System.out.println(s);
                // khai báo đối tượng st
                StringBuilder sb=new StringBuilder();//Là 1 lớp dùng để quản lý một chuỗi có thể thay đổi kích thước và nội dung
                // append thêm vào cuối chuỗi
                sb.append("xin chào");
                sb.append("Minh mới học lập trình");
                System.out.println(sb);
                // insert (vị trí index,chuỗi cần chèn)
                sb.insert(2,"obama");
                System.out.println(sb);
                // delete(start,end)
                sb.delete(2,7);// xóa bắt đâu từ 2 đến 6 thôi đó là end-1
                System.out.println(sb);
                System.out.println(sb.length());

                String s7="tôi đi tìm tôi";
                System.out.println(s7.indexOf("tôi"));//tìm vị trí ở ký tự đầu tiên hay được gọi là đưa ra  ở vị trí đầu tiên của chuỗi
                // trả về -1 nếu không tìm thấy
                System.out.println(s7.lastIndexOf("tôi"));// đưa ra vị trí cuối cùng của chuỗi
                // contains: kiểm tra chuỗi con
                String s9=".mp3";
                String s10="tuhoc.mp3";
                //kiểm tra s10 có chứa cụm string của s9 không
                boolean check=s10.contains(s9);
                if(check==true){
                    System.out.println("có .mp3 trong chuỗi");
                }
                else {
                    System.out.println("không tìm thấy ");
                }
                String s11="abcdefgh";
                String s12=s11.substring(4);// lấy tự vị trí thứ 4 của s11 đến hết nếu có 2 đối số thì đối số thứ 2 lấy end-1
                System.out.println(s11);
                System.out.println(s12);
                //repalce thay thế toàn bộ chữ muốn đổi thành chữ khác
                String s13="học học học nữa học mãi";
                String s14=s13.replace("học","ngủ");
                System.out.println(s14);
                //repalcefirst thay thế từ đầu tiên ma muốn thay thế
                String s15=s13.replaceFirst("học","ngủ");
                System.out.println(s15);
                //trim() xóa toàn bộ khoảng trắng ở đầu và cuỗi
                String s17="              Phạm Đại Phúc           ";
                String s18=s17.trim();
                System.out.println(s18);
                //trong java không hộ trợ xóa cuối va đầu riêng rẽ thì ta dùng biểu thức chính quy như sau
                // \s+ đại diện cho 1 hoặc nhiêu khoảng trắng liên tiếp
                //$ đại diện cho kết thúc dòng
                // \s+$ đại diện cho 1 hoặc nhiều khoảng trắng liên tiếp ngay trước kết thúc dòng
                // \ là ký tựu đặc biệt nên trong java cần thêm 1 dấu \ trước nó nữa
                // ví dụ muốn xóa đầu dòng ta làm như sau
                String s19=s17.replaceAll("\\s+$","");
                System.out.println(s19);
                //xóa ở cuối chuỗi
                String s21="              Phạm Đại Phúc           ";
                while (s21.endsWith(" ")){
                    s21=s21.substring(0,s21.length()-1);
                }
                System.out.println(s21);
                //xóa toàn bộ khoảng trắng ở đầu
                String s22=s21.replaceFirst("^\\s+","");
                System.out.println(s22);
                // compareTo() so sánh 2 chuỗi , compareTolgnoreCase bỏ qua phân biệt hoa thường
                // đảo ngược chuỗi trong stringbuider đối tượng là reverse()
                // buổi 3
            //spit tách chuỗi
            String s38="Hello, World";
            String [] mang =s38.split(",");
            for (int i=0;i<mang.length;i++){
                    System.out.println(mang[i]);
            }
            // toLowerCase() && toUpperCase()
            String s39="Hello World";
            String s40=s39.toLowerCase();//chuyển hết chữ thường
            System.out.println(s40);
            String s41=s39.toUpperCase();// chuyển hết chữ hoa
            System.out.println(s41);
            //toCharArray() tách chuỗi thành ký tự, cho vào mảng
            String s42="abcdef123@";
            char [] mang2 =s42.toCharArray();
            //duyệt mảng
            for (int i=0;i<mang2.length;i++){
                    System.out.println(mang2[i]);
            }
    }
}
