public class RemovePunctuationFromString {
    public static void main(String[] args) {
        String str = "Welcome???@@##$ to#$% Geeks%$^for$%^&Geeks";
        String newString = str.replaceAll("\\p{Punct}","");
        System.out.println(newString);
    }
}
