public class ClassAttributesProtected {
    //superclass
    public static class Animal {
        protected String name;

        protected void makeSound() {
            System.out.println("Animal sound");
        }
    }

    // subclass
    public static class Dog extends Animal {
        public void bark() {
            System.out.println(name + " says: Woof!");
        }
    }

//    public class Main {
//        public void main(String[] args) {
//            Dog dog = new Dog();
//            dog.name = "Buddy";
//            dog.bark();
//            dog.makeSound();
//        }
//    }

}
