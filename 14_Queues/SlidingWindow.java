import java.util.*;

public class SlindingWindow {
  static void printmax(int arr[], int N, int k){
    Deque<Integer> Qi = new LinkedList<>();
    int i;
    for (i = 0; i < k; ++i) {
      while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) {
        Qi.removeLast();
      }
      Qi.addLast(i);
    }

    for (; i < N; ++i) {
      System.out.print(arr[Qi.peek()] + " ");

      while ((!Qi.isEmpty()) && Qi.peek() <= i - k) {
        Qi.removeFirst();
      }
      while ((!Qi.isEmpty()) && arr[i] >= arr[Qi.peekLast()]) {
        Qi.removeLast();
      }
      Qi.addLast(i);
    }
    System.out.print(arr[Qi.peek()]);
  }
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
    int k = 3;

    printmax(arr, arr.length, k);
  }
}
