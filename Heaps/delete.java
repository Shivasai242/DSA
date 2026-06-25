import java.util.ArrayList;

public class delete {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // Add at last index
            arr.add(data);

            int x = arr.size() - 1; // child index
            int par = (x - 1) / 2;  // parent index

            while (x > 0 && arr.get(x) < arr.get(par)) {
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }
        }

        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            if (left < arr.size() && arr.get(left) < arr.get(minIdx)) {
                minIdx = left;
            }

            if (right < arr.size() && arr.get(right) < arr.get(minIdx)) {
                minIdx = right;
            }

            if (minIdx != i) {
                // swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int peek() {
            return arr.get(0);
        }

        public int remove() {
            int data = arr.get(0);

            // Step 1: Swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // Step 2: Remove last
            arr.remove(arr.size() - 1);

            // Step 3: Heapify
            if (!arr.isEmpty()) {
                heapify(0);
            }

            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap pq = new Heap();

        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(5);

        while (!pq.isEmpty()) {   //heap sort -O(nlogn)
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
