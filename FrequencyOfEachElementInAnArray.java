import java.util.HashMap;

public class FrequencyOfEachElementInAnArray {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 1, 2, 9, 2, 2, 2, 3, 3, 4, 1, 8, 8};
        int n = arr.length;
        countFreq(arr, n);
    }
        static void countFreq(int arr[], int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
              map.put(arr[i], map.get(arr[i]+1));
            } else {
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);
    }
}
