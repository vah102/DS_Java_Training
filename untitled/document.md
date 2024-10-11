## 1. Cài đặt mội trường ( 1 ngày)  
- JDK
- IntelliJ
## 2. JDK, JRE, JVM (1 ngày)
- JDK:
  - Viết tắt của Java Development Kit là một bộ phần mềm cung cấp môi trường phát triển ứng dụng viết bằng ngôn ngữ Java. JDK bao gồm cả Java Runtime Environment() giúp lập trình viên có thể chạy thử để kiểm tra ứng dụng trong quá trình phát triển ứng dụng.
  - Cho phép tạo các chương trình Java có thể được thực thi và chạy bởi JVM và JRE.
- JRE: khởi tạo JVM và đảm bảo các phụ thuộc có sẵn cho các chương trình.
- JVM (Java Virtual Machine): là máy ảo Java. 
  - Dùng để thực thi các chương trình Java. Mỗi nền tảng/hệ điều hành khác nhau (Windows, IOS, Linux…) lại có một loại JVM khác nhau. Các chương trình Java chạy trên JVM. 
  - Nói Java đa nền tảng, thực chất thì nó được hỗ trợ JVM trên nhiều nền tảng. Chương trình Java chạy được trên Window/Linux/IOS vì nó có JVM chạy được trên các nền tảng đó.
    JVM là thành phần nền tảng Java thực thi các chương trình của bạn.
    
## 3. Kiểu dữ liệu (1 ngày)
- Primitive  (Nguyên thuỷ)
  - byte, short , int , long, float, double, char, boolean
- Non-primitive  (Không nguyên thuỷ)
  - Class, Interface, Array, String
- Wrapper class ( lớp wrapper) cho kiểu dữ liệu primitive. AutoBoxing and AutoUnboxing
  - Java cung cấp các lớp bao bọc (wrapper classes) cho các kiểu dữ liệu primitive, cho phép chúng trở thành đối tượng.
  - **AutoBoxing**: Tự động chuyển đổi từ kiểu primitive sang wrapper class. Ví dụ:
    ```
        int num = 10;
        Integer wrappedNum = num; // AutoBoxing
    ```
  - **AutoUnboxing**: Tự động chuyển đổi từ wrapper class về kiểu primitive. Ví dụ:
    ```
        Integer wrappedNum = 10;
        int num = wrappedNum; // AutoUnboxing
    ```
- Kích thước và khoảng giá trị của các kiểu dữ liệu primitive
  - boolean (true/false)
  - byte
  - short
  - int
  - long
  - float
  - double
  - char
- Double vs BigDecimal
  - **Double**: là kiểu dữ liệu dấu phẩy động nhưng không lưu trữ chính xác các số thập phân khi thực hiện các phép toán, vì nó sử dụng số học dấu phẩy động nhị phân.

  - **BigDecimal**: Là lớp giúp xử lý các phép toán số học với độ chính xác cao. Phù hợp cho các ứng dụng yêu cầu tính toán chính xác. Ví dụ:
      ```
      BigDecimal a1 = new BigDecimal("0.1");
      BigDecimal a2 = new BigDecimal("0.2");
      BigDecimal result = a1.add(a2); // Kết quả chính xác
      ```

## 4. Biến (2 ngày)
- Khai báo và gán giá trị cho biến
- Toán tử
- Các cách so sánh 2 biến
- Type Casting
## 5. Memory (2 ngày)
- Vùng nhớ Heap và Stack
  + Stack: 
    + Vùng nhớ được sử dụng cho biến cục bộ và các phương thức được gọi.
    + Dễ quản lý, tự động giải phóng khi phương thức end.
    + Kích thước: cố định và thường < heap
  + Heap:
    + Là mơi lưu trữ các đối tượng và mảng. Đối tượng được tạo thông qua từ khóa **new**
    + Quản lý phức tạp hơn, cần Garbage Collector để thu hồi bộ nhớ khi không còn sử dụng
    + Kích thước lớn hơn và cho phép chứa nhiều đối tượng hơn
- String Pool (String Inter Pool)
  + Là vùng nhớ đặc biệt trong heap nơi các đối tượng **String** được lưu giữ. Khi tạo chuỗi sử dụng dấu ngoặc kép, Java sẽ check  xem chuỗi đó đã tồn tại trong String pool chưa, nếu có, nó sẽ trả về tham chiếu đến chuỗi đó thay vì tạo đối tượng mới
  + Đặc điểm:
    + Tối ưu hóa bộ nhớ: tạo nhiều đối tượng String giống nhau
    + Phương thức **intern()**: có thể gọi intern() trên một chuỗi để thêm nó vào String Pool. Nếu chuỗi đã tồn tại, nó sẽ trả về tham chiếu đến chuỗi đã có.
    + So sánh: có thể so sánh 2 chuỗi trong Sting Pool bằng cách sử dụng **==**, vì chúng có cùng tham chiếu. Nếu so sánh chuỗi tạo ra bằng **new()** thì sử dụng **equal()**

## 6. Câu lệnh điều kiện (1 ngày)
- If...else if...else
- Switch Case : 
   + Cho phép thực hiện nhiều lựa chọn khác nhau dựa trên giá trị của một biến
   + dễ đọc và quản lý hơn so với nhiều câu lệnh **if-else**.
      
## 7. Vòng lặp (1 ngày)
- while
  + Cách kết thúc:
    + break: Sử dụng break để thoát khỏi vòng lặp khi điều kiện nhất định được thỏa mãn.
    + continue: Sử dụng continue để bỏ qua phần còn lại của vòng lặp hiện tại và quay lại kiểm tra điều kiện ở đầu vòng lặp.
    ```
    while (condition) {
    // Run when condition is true
    }
    ```         
- do...while: 
  + Trong **do** sẽ luôn được thực thi ít nhất một lần
  + Khác với **while**: Sự khác biệt chính giữa **do...while** và **while** là **do...while** sẽ luôn thực thi ít nhất một lần, trong khi **while** có thể không thực thi nếu điều kiện ban đầu là false.
    ```
    do {
    // Code
    } while (condition);
    ```
- for: 
  + Lặp với số lần lặp được xác định trước
    ```
    for (initialization; condition; update) {
    // Code
    }
    ```
## 8. Arrays (1 ngày)
- Mảng 1 chiều (one-dimensional array)
  + Là một cấu trúc dữ liệu dùng để lưu trữ nhiều giá trị của cùng một kiểu dữ liệu trong một biến duy nhất. Mảng có kích thước cố định và chỉ có thể chứa các phần tử cùng kiểu (ví dụ: số nguyên, chuỗi, đối tượng,...).
    ```
    int[] array;       // Khai báo mảng
    array = new int[5]; // Khởi tạo mảng với kích thước 5
    
    int[] array = new int[5]; // Khai báo và khởi tạo mảng với kích thước 5
    
    int[] array = {1, 2, 3, 4, 5}; // Khởi tạo mảng với các giá trị ban đầu

    ```
- Mảng 2 chiều
  + Là mảng chứa các mảng 1 chiều
    ```
    int[][] array;          // Khai báo mảng 2 chiều
    array = new int[3][4];  // Khởi tạo mảng với 3 hàng và 4 cột
    
    int[][] array = new int[3][4];  // Cách khai báo khác
    
    int[][] array = {
    {1, 2, 3, 4},
    {5, 6, 7, 8},
    {9, 10, 11, 12} }; //Khởi tạo với giá trị cụ thể
    
    //Truy cập và thay đổi giá trị của phần tử trong mảng hai chiều
    array[0][1] = 20;  // Thay đổi giá trị tại hàng 0, cột 1 thành 20
    int value = array[2][3];  // Lấy giá trị của phần tử tại hàng 2, cột 3
    System.out.println(value);  // In giá trị ra màn hình
    
    //Duyệt sử dụng for
    for (int i = 0; i < array.length; i++) {           // Duyệt hàng
        for (int j = 0; j < array[i].length; j++) {    // Duyệt cột
            System.out.print(array[i][j] + " ");       // In giá trị của mỗi phần tử
    }
    
    //Duyệt sử dụng for-each
    for (int[] row : array) {          // Duyệt từng hàng
            for (int element : row) {      // Duyệt từng phần tử trong mỗi hàng
                System.out.print(element + " ");
    }
    ```
- Lặp qua 1 mảng
  + for
  + for-each
  + while

## 9. Methods (3 ngày)
- Sự khác nhau khi truyền giá trị Primitive vs Object
    + Khi truyền giá trị Primitive
        + Bao gồm các kiểu giá trị như: **int, char, boolean, float, double, byte, short, long**
        + Java sẽ tạo bản sao của giá trị đó
    + Khi truyền kiểu dữ liệu Object
        + Kiểu dữ liệu object bao gồm tất cả các lớp (classes), bao gồm cả các kiểu dữ liệu được định nghĩa bởi người dùng.
        + Java truyền tham chiếu đến object đó (không phải bản sao của object). Do đó, bất kỳ thay đổi nào được thực hiện trên object trong phương thức sẽ ảnh hưởng đến object ban đầu.
- Method Overloading: định nghĩa nhiều phương thức cùng tên trong cùng 1 lớp
    + Tất cả Method Overloading đều có cùng tên
    + Các phương thức khác nhau vế số lượng tham số hoặc kiểu tham số. Nếu chỉ thay đổi kiểu dữ liệu mà không thay đổi số lượng tham số thì đó không phải là nạp chồng.
    + Phương thức có thể có kiểu trả về khác nhau 
## 10.  Class (7 ngày)
- Class Attributes
    + Là các biến (fields) được định nghĩa bên trong một lớp, dùng để lưu trữ trạng thái của các đối tượng (objects) được tạo ra từ lớp đó. Những thuộc tính này có thể được truy cập và thay đổi thông qua các phương thức của lớp.
    + Thường được khai báo trong các mức truy cập (access modifiers):
      + private: bảo vệ dữ liệu, ngăn chặn truy cập trực tiếp từ bên ngoài lớp
      + protected: được sử dụng để kiểm soát khả năng truy cập của các thuộc tính (fields) và phương thức (methods) trong một lớp.
        + Cho phép truy cập từ các lớp trong cùng một package và từ các lớp con.
        + Nên sử dụng khi **Kế thừa**: Khi muốn cho phép các lớp con truy cập đến các thuộc tính và phương thức mà không cần phải sử dụng phương thức getter và setter.
      + public
      + mặc định là package-private
- Class Methods
- Constructors
- Classes vs Objects
- Package
- Access Modifier
- Static members, Static blocks
- Final members
- Kế thừa (Inheritance)
- Constructors trong kế thừa
- this vs super
- Method Overloading và Overriding
- Dynamic method dispatch (Polymorphism)
- Cơ chế Upcasting và Downcasting
- Abstract class
- Interface
- Inheritance vs implement Interface
- Interface vs Abstract class
- Anonymous Class
- Singelton Class
- Enum
11. Exception Handling (3 ngày)
    - Error vs Exception
    - Checked Exception and Unchecked Exception
    - try...catch...finally
    - throw vs throws
    - try with resources
12. Multithreading (7 ngày)
    - Thread class
    - Runnable interface
    - Thread lifecycle
    - Thread priority
    - Các method trong Thread class
    - Thread safe
    - Thread synchronization
    - Inter-Thread Communication
    - Deadlock
    - Thread pool
    - Executors
13. Annotations (3 ngày)
    - Annotations là gì
    - Built-in annotations
    - Custom annotations
    - 14.Lambda Expressions (2 ngày)
    - Lambda Expressions là gì
    - Variables scope và Capturing Variables
    - Method Reference
14. Java IO Streams (5 ngày)
    - InputStream, OutputStream
    - Reader, Writer
    - FileInputStream vs FileReader
    - FileOuputStream vs FileWriter
    - BufferedInputStream vs BufferedReader
    - BufferedOutputStream vs BufferedWriter
    - InputStreamReader
    - File handling: Create, Read, Write, Delete
    - Serialization
    - DataInputStream, DataOutputStream
    - ObjectInputStream, ObjectOutputStream
    - PipedInputStream, PipedOutputStream
15. Generics (4 ngày)
    - Generics là gì
    - Generic Class
    - Multiple parameter
    - Subtypes
    - Bounded types
    - Generic Method
    - WildCard
    - Lower Bound
    - Upper Bound
16. Collection (4 ngày)
    - List: ArrayList, LinkedList, Vector, Stack
    - Map: HashMap, LinkedHashMap, HashTable, TreeMap
    - Queue: PriorityQueue, ArrayQueue
    - Set: HashSet, LinkedHashSet, TreeSet
    - Iterator
    - Comparable
    - Comparator
    - StringTokenizer
    - Properties
17. Date and Time (3 ngày)
    - Date class
    - LocalDate, LocalTime, LocalDateTime
    - TimeZone, ZonedDateTime
    - Period, Duration
    - Date Formatter
18. Networking (4 ngày)
    - URL
    - URLConnection
    - InetAddress
    - Socket
    - ServerSocket
    - DatagramSocket
    - DatagramPacket
    - MulticastSocket
19. JDBC (7 ngày)
    - JDBC là gì
    - Kết nối db và thực thi query:
    - DriverManager, Driver, Connection, Statement, ResultSet
    - Connection pool
    - DataSource
    - PreparedStatement
    - CallableStatement
    - Transactions
    - Savepoint
    - Batch Processing
20. Bonus (5 ngày)
    - String vs String Buffer vs String Builder
    - java.util.Date vs java.sql.Date
    - Dependency Injection
    - JavaBeans