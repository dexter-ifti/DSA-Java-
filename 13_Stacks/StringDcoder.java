import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class StringDecoder {
    public static String decode(String str) {
        Stack<Integer> integerStack = new Stack<>();
        Stack<Character> stringStack = new Stack<>();
        String temp = "", result = "";

        for (int i = 0; i < str.length(); i++) {
           
            int count = 0;
            if (Character.isDigit(str.charAt(i))) {
                while (Character.isDigit(str.charAt(i))) {
                    count = count * 10 + str.charAt(i) - '0';
                    i++;
                }

                i--;
                integerStack.push(count);
            }
            
            else if (str.charAt(i) == ']') {
                temp = "";
                count = 0;

                if (!integerStack.isEmpty()) {
                    count = integerStack.peek();
                    integerStack.pop();
                }

                while (!stringStack.isEmpty() && stringStack.peek() != '[') {
                    temp = stringStack.peek() + temp;;
                    stringStack.pop();
                }

                if (!stringStack.empty() && stringStack.peek() == '[') {
                    stringStack.pop();
                }

                for (int j = 0; j < count; j++) {
                    result = result + temp ;
                }

                for (int j = 0; j < result.length(); j++) {
                    stringStack.push(result.charAt(j));
                }

                result = "";
            }

            else if (str.charAt(i) == '[') {
                if (Character.isDigit(str.charAt(i-1))) {
                    stringStack.push(str.charAt(i));
                }
                else {
                    stringStack.push(str.charAt(i));;
                    integerStack.push(1);
                }
            }

            else {
                stringStack.push(str.charAt(i));
            }
            
        }

        while (!stringStack.isEmpty()) {
            result = stringStack.peek() + result;
            stringStack.pop();
        }
        return result;
        
    }

    public static void main(String args[]) {
        String path = "3[b2[v]]";
        System.out.println(decode(path));
    }
}
