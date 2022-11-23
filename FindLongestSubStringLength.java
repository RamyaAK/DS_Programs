import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindLongestSubStringLength {
    public static void main(String[] args) {
        String str = "java";
        int longestSubstringLength = 0;
        String longestSubstring = null;

        Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();

        char[] strArray = str.toCharArray();

        for(int i=0;i<str.length();i++) {
            char ch = strArray[i];
            if (!map.containsKey(ch)) {
                map.put(strArray[i], i);
            } else {
                i = map.get(strArray[i]);
                map.clear();
            }
            if (map.size() > longestSubstringLength) {
                longestSubstringLength = map.size();
                longestSubstring = map.keySet().toString();
            }
        }
        System.out.println(longestSubstringLength);
        System.out.println(longestSubstring);
    }
}
