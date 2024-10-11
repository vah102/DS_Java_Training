public class ClassAttributes {
    // Thuộc tính của lớp
    private String name;      // Thuộc tính private
    private int age;         // Thuộc tính private

    // Constructor để khởi tạo đối tượng
    public void Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // method get name
    public String getName() {
        return name;
    }

    // creat name
    public void setName(String name) {
        this.name = name;
    }

    // get age
    public int getAge() {
        return age;
    }

    // create age
    public void setAge(int age) {
        if (age > 0) { // check
            this.age = age;
        }
    }
}

//public class Main {
//    public static void main(String[] args) {
//        // Create object person
//        Person person = new Person("abc", 30);
//
//        //
//        System.out.println("Name: " + person.getName());
//        System.out.println("Age: " + person.getAge());
//
//        // Change attributes
//        person.setName("dfd");
//        person.setAge(35);
//
//        //
//        System.out.println("Name after change: " + person.getName()); //
//        System.out.println("Age after change: " + person.getAge()); //
//    }
//}

