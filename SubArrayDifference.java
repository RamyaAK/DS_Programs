public class SubArrayDifference {
    public static void main(String[] args) {
        //sub array difference meaning the difference of largest and smallest item in the array.

        int a[] = {20, 3, 18, 8, 13};
        int min, max;
        int n = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        min = a[0];
        max = a[n];

        int subArraySum = max-min;
        System.out.println(subArraySum);
    }
}
