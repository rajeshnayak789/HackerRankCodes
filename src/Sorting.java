import java.util.*;


public class Sorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        int endP = a.length - 1;
        int numberOfSwaps = 0;
        while (endP > 0) {
            int swapPosition = 0;
            for (int i = 0; i < endP; i++) {
                if (a[i] > a[i + 1]) {
                    int tmp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                    numberOfSwaps++;
                    swapPosition = i;
                }
            }
            endP = swapPosition;
        }
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.\n"
                + "First Element: " + a[0] + "\n"
                + "Last Element: " + a[n - 1] + "\n");
    }
}