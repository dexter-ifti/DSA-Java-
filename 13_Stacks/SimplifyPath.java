import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;


public class SimplifyPath {
    public static String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        StringBuilder sb = new StringBuilder();
        String[] p = path.split("/");

        for (String str : p) {
            if (!s.isEmpty() && str.equals("..")) {
                s.pop();
            } else if (!str.equals("") && !str.equals(".") ){//&& !str.equals("..")) {
                s.push(str);
            }
        }

        if (s.isEmpty()) {
            return "/";
        }
        while (!s.isEmpty()) {
            sb.insert(0, s.pop()).insert(0, "/");
        }

        return sb.toString();
    }
       
    public static void main(String args[]){
        String path = "/a/./b/../../c/";
        System.out.println(simplifyPath((path)));
    }
}
