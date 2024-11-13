public class C4 {
    static int even(int[] array) {
        int counter = 0;
        for (int i=0; i<array.length; i++) {
            if (array[i] % 2 == 0) {
                counter += 1;
            }
        }
        return counter;
    }

    static int positiveOdd(int[] array) {
        int counter = 0;
        for (int i=0; i<array.length; i++) {
            if (array[i] % 2 != 0 && array[i] > 0) {
                counter += 1;
            }
        }
        return counter;
    }
}
