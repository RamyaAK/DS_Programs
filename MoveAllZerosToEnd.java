public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int[] a = {5, 6, 0, 4, 6, 0, 9, 0, 8};
        int temp[] = new int[a.length];
        int n = a.length;
        int i, j = 0;
        int count = 0;
        for (i = 0; i < n; i++) {
            if (a[i] == 0) {
                count = count + 1;
            }
        }
        for (i = 0; i < n; i++) {
            if (a[i] != 0) {
                temp[j] = a[i];
                j = j + 1;
            }
        }
        for (i = 0; i < n; i++) {
            System.out.println(temp[i]);
        }
       // System.out.println(count);
    }
    }

