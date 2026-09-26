// Detecting and Removing the cycle in Linked List
class l3 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // Detects and removes the cycle if present
    public static boolean detectAndRemoveCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        // Step 1: Detect cycle using Floyd’s Algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;         // +1
            fast = fast.next.next;    // +2

            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (!cycle) {
            return false; // No cycle
        }

        // Step 2: Find the start of the cycle
        slow = head;
        Node prev = null;

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: Remove the cycle
        prev.next = null;

        return true;
    }

    // Print the linked list
    public static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next; // Creates cycle: 4 -> 2

        boolean hadCycle = detectAndRemoveCycle();
        System.out.println("Cycle detected and removed? " + hadCycle);

        // Now print the list to show it's linear
        printList();
    }
}
