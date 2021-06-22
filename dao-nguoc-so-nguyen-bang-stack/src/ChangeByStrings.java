import java.util.*;

public class ChangeByStrings {

    public static void main(String[] args) {
        String s1="asd asd wa da awwa";
        String[] words=s1.split("\\s");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < words.length; i++){
            stack.push(words[i]);
        }
        for (int i = 0; i < words.length; i++){
            words[i] = stack.pop();
        }
        for (String a: words){
            System.out.println(a);
        }
    }
}
