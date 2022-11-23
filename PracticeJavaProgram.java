import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PracticeJavaProgram {
    public static void main(String[] args) {
        findLongestSubstringAndItsLength();
        System.out.println(findMaxProfitFromOneTimeBuySellStock());
    }
    public static void findLongestSubstringAndItsLength(){
        String str = "java";
        String longestSubstring=null;
        int longestSubstringLength=0;

        Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();

        char strArray[] = str.toCharArray();

        for(int i=0;i<str.length();i++){
            if(!map.containsKey(strArray[i])){
                map.put(strArray[i],i);
            }
            else {
                i=map.get(strArray[i]);
                map.clear();
            }
            if(map.size()>longestSubstringLength){
                longestSubstringLength = map.size();
                longestSubstring = map.keySet().toString();
            }
        }
        System.out.println("Length of longest substring is :"+longestSubstringLength);
        System.out.println("Longest substring is: "+longestSubstring);
    }

    public static int findMaxProfitFromOneTimeBuySellStock(){
        int arr[]={2,7,1,8,4,3,6,2,10};
        int maxprofit = 0;
        int minSofar = arr[0];

        for(int i=0;i<arr.length;i++){
            minSofar = Math.min(arr[i],minSofar);
            int profit = arr[i]-minSofar;
            maxprofit = Math.max(profit,maxprofit);
        }

        return maxprofit;
    }
}
