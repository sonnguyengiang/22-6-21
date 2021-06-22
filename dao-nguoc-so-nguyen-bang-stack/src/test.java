import java.util.*;

public class test {
    public static void change(String[] arr){
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++){
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++){
            arr[i] = stack.pop();
        }
        for (String x: arr){
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        String[] x = {"x","y","z"};
        change(x);
    }
}
