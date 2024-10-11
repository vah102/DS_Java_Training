import java.util.Scanner;
public class StringPool {
        public static void main(String[] args) {

            String str1 = "Hello";
            String str2 = "Hello";

            //đối tượng mới trong heap
            String str3 = new String("Hello");

            //
            System.out.println(str1 == str2); // true, vì cùng tham chiếu đến chuỗi trong String Pool
            System.out.println(str1 == str3); // false, vì str3 là đối tượng mới trong heap
        }
}

