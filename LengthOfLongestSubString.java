import java.util.LinkedHashMap;
import java.util.Map;

public class LengthOfLongestSubString {
    public static void main(String[] args) {
        String str = "java";
        String longestSubstring=null;
        int longestSubstringLength=0;

        Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();

        char strArray[] = str.toCharArray();

        for(int i=0;i<str.length();i++){
            //char ch = strArray[i];
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
}
