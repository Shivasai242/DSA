public class zig_zag {

    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // Add Last
    public void addLast(int data){

        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Print
    public void print(){

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Zig-Zag Linked List
    public void zigZag(){

        // Step 1 : Find Mid
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

        // Step 2 : Reverse 2nd Half
        Node curr = mid.next;
        mid.next = null;

        Node prev = null;
        Node next;

        while(curr != null){

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3 : Alternate Merge
        Node left = head;
        Node right = prev;

        Node nextL, nextR;

        while(left != null && right != null){

            nextL = left.next;
            left.next = right;

            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public static void main(String[] args) {

        zig_zag ll = new zig_zag();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        // 1 -> 2 -> 3 -> 4 -> 5

        System.out.println("Before Zig-Zag:");
        ll.print();

        ll.zigZag();

        System.out.println("After Zig-Zag:");
        ll.print();
    }
}