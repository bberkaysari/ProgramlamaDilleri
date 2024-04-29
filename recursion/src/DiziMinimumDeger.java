import java.util.Stack;

public class DiziMinimumDeger {
    public static void main(String[] args) {
        int[] dizi = {5, 3, 8, 1, 9, 4, 7};
        int minDeger = minimumDegeriBul(dizi);
        System.out.println("Dolu dizinin minimum değeri: " + minDeger);
    }
    public static int minimumDegeriBul(int[] dizi) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        for (int eleman : dizi) {
            stack1.push(eleman);
        }
        int minDeger = Integer.MAX_VALUE;

        while (!stack1.isEmpty()) {
            int eleman = stack1.pop();
            minDeger = Math.min(minDeger, eleman);
            stack2.push(eleman);
        }
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return minDeger;
    }
}
