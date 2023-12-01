// Ex13 1,例外訊息的擷取
 public class test03 {
     public static void main(String[] args) {
         int num = 12, den = 0;
         
         try {
             int ans = num / den;
             System.out.println("結果: " + ans);
         } catch (ArithmeticException e) {
             System.out.println("除數為0");
         } finally {
             System.out.println("無論如何都會執行的區塊");
         }
         
         System.out.println("end of main()!!");
     } }
