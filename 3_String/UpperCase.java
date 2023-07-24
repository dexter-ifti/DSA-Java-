// to uppercase the first charracter of each word
public class UpperCase {
    public static void main(String[] args) {
        String str = "hi, i am taha iftihar" ;
        System.out.println(toUpperCase(str));
    }

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder(""); 
    
        // Niche jo toUpperCase use kiya h wo Inbuilt fxn h java ka
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1 ; i < str.length() ; i++){
            if(str.charAt(i) == ' ' && i < str.length()-1){
                sb.append(str.charAt(i));
                i++ ;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }   
}
