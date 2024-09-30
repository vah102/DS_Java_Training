 import java.util.Scanner;

    public class test {
        public static void main(String[] args) {
            // Tạo đối tượng Scanner để nhận đầu vào từ bàn phím
            Scanner scanner = new Scanner(System.in);

            // Yêu cầu người dùng nhập số thứ nhất
            System.out.print("Nhập số thứ nhất: ");
            int number1 = scanner.nextInt();

            // Yêu cầu người dùng nhập số thứ hai
            System.out.print("Nhập số thứ hai: ");
            int number2 = scanner.nextInt();

            // So sánh hai số và in ra kết quả
            if (number1 > number2) {
                System.out.println(number1 + " lớn hơn " + number2);
            } else if (number1 < number2) {
                System.out.println(number1 + " nhỏ hơn " + number2);
            } else {
                System.out.println(number1 + " bằng " + number2);
            }

            // Đóng Scanner để tránh lãng phí tài nguyên
            scanner.close();
        }
    }


