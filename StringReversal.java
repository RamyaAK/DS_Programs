public class StringReversal {
    public static void main(String[] args) {
        String str = "Ramya A Kulkarni";
        char[] ch = str.toCharArray();
        System.out.println(str.length());
        System.out.println("Before reverse operation");
        for(int i=0;i<= str.length()-1;i++){
            System.out.print(ch[i]);
        }

        System.out.println("\nAfter reverse operation:");
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }
}
