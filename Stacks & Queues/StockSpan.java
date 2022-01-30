import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 9, 3, 1, 12, 6, 8, 7 };
        int[] span = solve(arr); 
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
    }

    private static int[] solve(int[] arr) {
        int[] span = new int[arr.length];

        Stack<Integer> st = new Stack<>();
        st.push(0);
        span[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] > arr[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                span[i] = i + 1;
            } else {
                span[i] = i - st.peek();
            }
            st.push(i);
        }
        return span;
    }
}

/*
 * NOTES
 * span = index+1 agar sab pop hogya to and khud ko stack mai push kardega
 * pop tab tak hoga jab tak present se bada na dikh jaaye
 * and agar pop nhi karwa paya to stack mai add ho jayega
 * span = index - top wale ka index
 * stack mai indexes store ho rhe hai
 */