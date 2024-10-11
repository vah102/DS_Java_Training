public class IfElse {
    public static void main(String[] args){
        int age = 0;
        boolean hasTicket = true;

        if (age >= 18 && hasTicket) {
            System.out.println("You can enter the concert.");
        } else {
            System.out.println("You cannot enter the concert.");
        }
    }
}
