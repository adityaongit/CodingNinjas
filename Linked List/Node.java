public class Node<T> {

    T data;                     // T is used as generics so that any datatype is used.
    Node<T> next;

    Node(T data) {
        this.data = data;
        // next = null; default is NULL, not to set it manually
    }
}
