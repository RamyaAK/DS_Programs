import java.util.LinkedHashSet;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        int a[]={0,2,1,0,3,9,4,3,3,1,0,5};
        String str = "Raaammmyyaaaa";

        LinkedHashSet<Integer> intSet = new LinkedHashSet<>();
        LinkedHashSet<Character> charSet = new LinkedHashSet<>();

        for(int i=0;i<str.length();i++){
            charSet.add(str.charAt(i));
        }

        for(int i=0;i<a.length;i++){
            intSet.add(a[i]);
        }

        System.out.println(charSet);
        System.out.println(intSet);
    }
}
