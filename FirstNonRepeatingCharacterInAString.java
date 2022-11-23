public class FirstNonRepeatingCharacterInAString {
    public static void main(String[] args) {
        String str = "ramya a kulkarni";
        for(char i:str.toCharArray()){
            if(str.indexOf(i)==str.lastIndexOf(i)){
                System.out.println("The first non repeating character is: "+i);
                break;
            }
        }
    }
}
