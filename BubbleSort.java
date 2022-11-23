public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {4, 6, 1, 9, 10, 2};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Sorted list in ascending order is:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
