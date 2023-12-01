// Ex13_7
public class test07 {
    public static void main(String args[]) {
        try {
            int[] arr = {4, 12, 87, 21, 6, 18};
            int[] den = {2, 0, 7, 0, 61, 0};
            double sum = 0.0;

            for (int i = 0; i <= 6; i++) {
                try {
                    sum += (double) arr[i] / den[i];
                } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                    System.out.println("捕捉到例外了");
                }
            }

            System.out.println("sum=" + sum);
        } catch (Exception e) {
            System.out.println("捕捉到例外了");
        }
    }
}
