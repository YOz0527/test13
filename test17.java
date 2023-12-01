import java.util.Scanner;

class IntegerLessThanZero extends Exception {
    public IntegerLessThanZero(String message) {
        super(message);
    }
}

class IntegerGreaterThanZero extends Exception {
    public IntegerGreaterThanZero(String message) {
        super(message);
    }
}

class IntegerEqualToZero extends Exception {
    public IntegerEqualToZero(String message) {
        super(message);
    }
}

public class test17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("請輸入一個整數: ");
            int userInput = scanner.nextInt();

            checkInteger(userInput);
        } catch (IntegerLessThanZero e) {
            System.out.println("您輸入的整數的值小於0");
        } catch (IntegerGreaterThanZero e) {
            System.out.println("您輸入的整數的值大於0");
        } catch (IntegerEqualToZero e) {
            System.out.println("您輸入的整數的值為0");
        } catch (Exception e) {
            System.out.println("輸入錯誤：" + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    static void checkInteger(int value) throws IntegerLessThanZero, IntegerGreaterThanZero, IntegerEqualToZero {
        if (value < 0) {
            throw new IntegerLessThanZero("整數小於0");
        } else if (value > 0) {
            throw new IntegerGreaterThanZero("整數大於0");
        } else {
            throw new IntegerEqualToZero("整數等於0");
        }
    }
}
