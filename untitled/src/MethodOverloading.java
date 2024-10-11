public class MethodOverloading {

    // Phương thức tính tổng với 2 số nguyên
    public int sum(int a, int b) {
        return a + b;
    }

    // Phương thức tính tổng với 3 số nguyên
    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Phương thức tính tổng với 2 số thực
    public double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Main obj = new Main();

        // Gọi các phương thức nạp chồng
        System.out.println("Tổng của 2 số nguyên: " + obj.sum(10, 20, 30)); // 30
        System.out.println("Tổng của 3 số nguyên: " + obj.sum(10, 20, 30)); // 60
        System.out.println("Tổng của 2 số thực: " + obj.sum(10.5, 20.5, 30)); //
    }
}

