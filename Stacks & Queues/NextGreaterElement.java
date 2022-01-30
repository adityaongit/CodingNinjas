import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {

    }

    public static int[] solve(int[] arr) {
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        int lastElement = arr[arr.length - 1];
        nge[lastElement] = -1;
        st.push(lastElement);

        for (int i = arr.length - 2; i >= 0; i--) {
            // pop, answers, pushes
            // pop till this condition
            while (st.size() > 0 && arr[i] > st.peek()) {
                st.pop();
            }
            if (st.size() == 0) {
                nge[i] = -1;
            } else {                    // this will only apply when arr[i] is not greater than st.peek()
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }

        return nge;
    }
}
