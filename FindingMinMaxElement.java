public class FindingMinMaxElement {
    public static void main(String[] args) {
        int a[] = {0, 3, 1, 8, 48, 93, 10};

        int max = a[0];
        int min = a[0];
        for (int i = 0; i < a.length; i++) {

            if (a[i] < min) {
                int temp = a[i];
                a[i] = min;
                min = temp;
            }
        }
        System.out.println("smallest item is : "+min);

        for(int i=0;i<a.length;i++){
            if(a[i]>max){
               int temp = a[i];
               a[i]=max;
               max=temp;
            }
        }
        System.out.println("largest item is : "+max);
    }
}
