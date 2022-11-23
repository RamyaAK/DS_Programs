import java.util.Arrays;
import java.util.Collections;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String str = "getting good at coding needs a lot of practice";

        String reversibleString[] = str.split(" ");
        Collections.reverse(Arrays.asList(reversibleString));

        System.out.println(String.join(" ",reversibleString));

    }
}
