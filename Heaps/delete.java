import java.util.ArrayList;

public class delete {
        static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            //add at last idx
            arr.add(data);

            int x = arr.size()-1; //a is child
            int par = (x-1)/2;  //par index

            while(arr.get(x) < arr.get(par)){  //O(log n)
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
            }
        }
        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;

            if(left < arr.size() && arr.get(minIdx))


        }
        public int peek(){
            return arr.get(0);
        }
        public int remove(){
            int data = arr.get(0);

            //step1 --swap first & last
            in temp = arr.get(0);
            arr.set(0, arr.size() - 1);
            arr.set(arr.size()-1, temp);

            //step2 --delete last
            arr.remove(arr.size()-1);

            //step3 --heapify
        }

    }
    public static void main(String[] args) {
        
    }
    
}
