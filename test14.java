class NotTriangle extends Exception {
    public NotTriangle(String message) {
        super(message);
    }
}

class EquilateralTriangle extends Exception {
    public EquilateralTriangle(String message) {
        super(message);
    }
}

class NotEquilateralTriangle extends Exception {
    public NotEquilateralTriangle(String message) {
        super(message);
    }
}

public class test14 {
    public static void main(String[] args) {
        try {
            triangle(3, 3, 3);
        } catch (NotTriangle e) {
            System.out.println("不構成三角形");
        } catch (EquilateralTriangle e) {
            System.out.println("這是正三角形");
        } catch (NotEquilateralTriangle e) {
            System.out.println("這不是正三角形");
        }
    }

    static void triangle(int a, int b, int c) throws NotTriangle, EquilateralTriangle, NotEquilateralTriangle {
        if ((a + b) <= c || (a + c) <= b || (b + c) <= a) {
            throw new NotTriangle("不構成三角形");
        } else if (a == b && b == c) {
            throw new EquilateralTriangle("這是正三角形");
        } else {
            throw new NotEquilateralTriangle("這不是正三角形");
        }
    }
}
