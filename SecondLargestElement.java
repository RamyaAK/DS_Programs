public class SecondLargestElement {
    public static void main(String[] args) {
        int a[]={3,8,9,0,1,4,89,23,45,29};

        // sort in descending order and then print the 2nd item from the list.

        for(int i = 0;i<a.length;i++){
            for(int j =0;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Sorted array is: ");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        System.out.println("The second Largest element is:"+a[1]);
    }
}
