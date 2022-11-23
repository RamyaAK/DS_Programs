public class SplitArrayAddFirstPartToEnd {
    public static void main(String[] args) {
        int arr[] = {12, 10, 5, 6, 52, 36};
        int k = 3;
        int temp[]= new int[arr.length];
        int i,j=0;

        for(i=k;i< arr.length;i++){
           temp[j]=arr[i];
            j++;
        }
        for(i=0;i<k;i++){
            temp[j]=arr[i];
            j++;
        }

        for(i=0;i< arr.length;i++){
           arr[i]=temp[i];
        }

        for(i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
}
