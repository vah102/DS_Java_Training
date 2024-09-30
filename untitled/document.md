1. Cài đặt mội trường ( 1 ngày)
    - JDK
    - IntelliJ
2. JDK, JRE, JVM (1 ngày)
    - JDK: 
        - viết tắt của Java Development Kit là một bộ phần mềm cung cấp môi trường phát triển ứng dụng viết bằng ngôn ngữ Java. JDK bao gồm cả Java Runtime Environment() giúp lập trình viên có thể chạy thử để kiểm tra ứng dụng trong quá trình phát triển ứng dụng.
        - cho phép tạo các chương trình Java có thể được thực thi và chạy bởi JVM và JRE.
    - JRE: khởi tạo JVM và đảm bảo các phụ thuộc có sẵn cho các chương trình.
    - JVM (Java Virtual Machine): là máy ảo Java. 
      - Dùng để thực thi các chương trình Java. Mỗi nền tảng/hệ điều hành khác nhau (Windows, IOS, Linux…) lại có một loại JVM khác nhau. Các chương trình Java chạy trên JVM. 
      - Nói Java đa nền tảng, thực chất thì nó được hỗ trợ JVM trên nhiều nền tảng. Chương trình Java chạy được trên Window/Linux/IOS vì nó có JVM chạy được trên các nền tảng đó.
        JVM là thành phần nền tảng Java thực thi các chương trình của bạn.
    
3. Kiểu dữ liệu (1 ngày)
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
    - Double vs BigDecimal
        - **Double**: là kiểu dữ liệu dấu phẩy động nhưng không lưu trữ chính xác các số thập phân khi thực hiện các phép toán, vì nó sử dụng số học dấu phẩy động nhị phân.

        - **BigDecimal**: Là lớp giúp xử lý các phép toán số học với độ chính xác cao. Phù hợp cho các ứng dụng yêu cầu tính toán chính xác. Ví dụ:
            ```
            BigDecimal a1 = new BigDecimal("0.1");
            BigDecimal a2 = new BigDecimal("0.2");
            BigDecimal result = a1.add(a2); // Kết quả chính xác
            ```

4. Biến (2 ngày)
    - Khai báo và gán giá trị cho biến
    - Toán tử
    - Các cách so sánh 2 biến
    - Type Casting
5. Memory (2 ngày)
    - Vùng nhớ Heap và Stack
    - String Pool
6. Câu lệnh điều kiện (1 ngày)
    - If...else if...else
    - Switch Case
7. Vòng lặp (1 ngày)
    - while, do...while
    - for
8. Arrays (1 ngày)
    - Mảng 1 chiều
    - Mảng 2 chiều
    - Lặp qua 1 mảng
9. Methods (3 ngày)
    - Sự khác nhau khi truyền giá trị Primitive vs Object
    - Method Overloading
    - Variable Argument
    - Method signature
10.  Class (7 ngày)
     - class Attributes
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