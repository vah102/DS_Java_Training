public class TwoDimensionalArray {
    public static void main(String[] args) {
        // Khởi tạo mảng 2 chiều
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        // Thay đổi giá trị của một phần tử
        array[0][0] = 100;

        // Duyệt qua mảng 2 chiều
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // Duyệt qua mảng 2 chiều bằng for-each
        System.out.println("Sử dụng for-each:");
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

