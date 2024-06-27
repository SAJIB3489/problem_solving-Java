package List_task;


/*

2. Create a list structure where you can add elements to the beginning of list and to the end of list and get element 
from spesific location. Write your implementation based on LinkedList. You are not allowed to use Javas List structures.

List is empty in the beginning. When you add elements, they are indexed from 0,1,2,3,4...

Create class OwnList with methods:
void addToBeginning(int x) // adds x to the beginning
void addToEnd(int x) // adds x to end
int getElement(int k) // fetches element from index k
void wedge(int index, int x) // Add element to spesific index and increments other elements indexes  

 */


public class Q2 {
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
        OwnList list = new OwnList();
        list.addToBeginning(1);
        list.addToBeginning(2);
        list.addToEnd(3);
        list.addToEnd(44);
        list.wedge(1, 5);
        list.printList();

        int elementAtIndex2 = list.getElement(2);
        System.out.println("Element at index 2: " + elementAtIndex2);
    }
}




// I followed this examples
// https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/