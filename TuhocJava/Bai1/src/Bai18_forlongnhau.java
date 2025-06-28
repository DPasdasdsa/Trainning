public class Bai18_forlongnhau {
    public static void main(String[] args) {
        for (int i=1;i<=7;i++){
            for (int j=1;j<=7;j++){
                System.out.print(i+""+j+"\t");
            }
            System.out.println("");
        }


        System.out.println("");
        System.out.println("");
        System.out.println("");
        // vẽ chữ n
        for (int i=1;i<=7;i++){
            for (int j=1;j<=7;j++){
                if(i==j||j==1||j==7){
                    System.out.print(i+""+j+"\t");
                }
                else{
                    System.out.print(" "+"\t");
                }
            }
            System.out.println("");
        }
    }
}
