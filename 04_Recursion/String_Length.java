public class String_Length {
    public static void main(String[] args) {
        String str = "abcde" ;
        System.out.println(length(str));
    }
    public static int length(String str) {
        if (str.length() == 0) {
            return 0;
        }
        return length(str.substring(1)) + 1 ;
    }
}
