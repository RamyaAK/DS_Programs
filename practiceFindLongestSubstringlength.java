import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class practiceFindLongestSubstringlength {
    public static void main(String[] args) {
        String str = "java";
        int longestSubstringlength = 0;
        String longestSubstring = null;

        char strArray[] = str.toCharArray();

        HashMap<Character,Integer> map= new LinkedHashMap<Character,Integer>();

        for(int i=0;i<str.length();i++){
            if(!map.containsKey(strArray[i])){
                map.put(strArray[i],i);
            }
            else{
                i= map.get(strArray[i]);
                map.clear();
            }
            if(map.size()>longestSubstringlength){
                longestSubstringlength = map.size();
                longestSubstring = map.keySet().toString();
            }
        }
        System.out.println(longestSubstringlength);
        System.out.println(longestSubstring);

    }
}
