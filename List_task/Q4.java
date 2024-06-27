package List_task;

/*
4. Implement following functionality to singleLinkedList made in task 2.

You have a linked list that contains n integers in its nodes values. Iterate through 
linked list removing consecutive nodes where integers has the same number. If there are multiple ways to remove nodes, 
remove the leftiest node. How many nodes will remain?

[1,2,2,3,3,1] -> [1,3,3,1] -> [1,1] ->[] returns 0

[1,2,3,4,5,6] returns 6

[1,2,3,2,2,1] -> [1,2,3,1] returns 4

[1,2,2,2,3,1] -> [1,2,3,1] returns 4

 */


public class Q4 {
    static class OwnList {
        private static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        private Node head;

        // Constructor to initialize an empty list
        public OwnList() {
            head = null;
        }

        // Adds an element to the beginning of the list
        public void addToBeginning(int x) {
            Node newNode = new Node(x);
            newNode.next = head;
            head = newNode;
        }

        // Adds an element to the end of the list
        public void addToEnd(int x) {
            Node newNode = new Node(x);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        // Fetches the element from index k
        public int getElement(int k) {
            Node current = head;
            int index = 0;
            while (current != null) {
                if (index == k) {
                    return current.data;
                }
                current = current.next;
                index++;
            }
            throw new IndexOutOfBoundsException("Index " + k + " out of bounds.");
        }

        // Adds an element at the specific index and increments other elements' indexes
        public void wedge(int index, int x) {
            if (index == 0) {
                addToBeginning(x);
            } else {
                Node newNode = new Node(x);
                Node current = head;
                int currentIndex = 0;
                while (current != null) {
                    if (currentIndex == index - 1) {
                        newNode.next = current.next;
                        current.next = newNode;
                        break;
                    }
                    current = current.next;
                    currentIndex++;
                }
                if (current == null) {
                    throw new IndexOutOfBoundsException("Index " + index + " out of bounds.");
                }
            }
        }

        // Removes consecutive nodes with the same integer values
        public void removeConsecutiveDuplicates() {
            Node current = head;

            while (current != null && current.next != null) {
                if (current.data == current.next.data) {
                    // Remove the leftmost consecutive node
                    current.next = current.next.next;
                } else {
                    current = current.next;
                }
            }
        }

        // Helper method to print the linked list
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        OwnList list1 = new OwnList();
        list1.addToEnd(1);
        list1.addToEnd(2);
        list1.addToEnd(2);
        list1.addToEnd(3);
        list1.addToEnd(3);
        list1.addToEnd(1);

        list1.removeConsecutiveDuplicates();
        list1.printList(); // Output: [1, 2, 3, 1] but shoud be [1, 3, 3, 1]

        OwnList list2 = new OwnList();
        list2.addToEnd(1);
        list2.addToEnd(2);
        list2.addToEnd(3);
        list2.addToEnd(4);
        list2.addToEnd(5);
        list2.addToEnd(6);

        list2.removeConsecutiveDuplicates();
        list2.printList(); // Output: [1, 2, 3, 4, 5, 6]

        OwnList list3 = new OwnList();
        list3.addToEnd(1);
        list3.addToEnd(2);
        list3.addToEnd(2);
        list3.addToEnd(2);
        list3.addToEnd(3);
        list3.addToEnd(1);

        list3.removeConsecutiveDuplicates();
        list3.printList(); // Output: [1, 2, 3, 1]

        OwnList list4 = new OwnList();
        list4.addToEnd(1);
        list4.addToEnd(2);
        list4.addToEnd(2);
        list4.addToEnd(2);
        list4.addToEnd(3);
        list4.addToEnd(1);

        list4.removeConsecutiveDuplicates();
        list4.printList(); // Output: [1, 2, 3, 1]
    }
}

// I got the help from various sources.
// https://www.geeksforgeeks.org/remove-duplicates-from-a-sorted-linked-list/