public class IteratingThroughArrays {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        // Vòng lặp for
        System.out.println("Use for:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // Vòng lặp for-each
        System.out.println("Use for-each:");
        for (int element : array) {
            System.out.println(element);
        }

        // Vòng lặp while
        System.out.println("Use while:");
        int j = 0;
        while (j < array.length) {
            System.out.println(array[j]);
            j++;
        }

        // Vòng lặp do-while
        System.out.println("Use do-while:");
        int k = 0;
        do {
            System.out.println(array[k]);
            k++;
        } while (k < array.length);
    }
}

