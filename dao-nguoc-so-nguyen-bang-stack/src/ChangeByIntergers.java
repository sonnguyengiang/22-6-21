import java.util.*;

public class ChangeByIntergers {
    public static void change(int[] arr){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++){
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++){
            arr[i] = stack.pop();
        }
        for (int x: arr){
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        int[] x = {7,6,5,4,2,1};
        change(x);
    }
}
