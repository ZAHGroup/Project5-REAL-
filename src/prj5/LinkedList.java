package prj5;

/**
 * The LinkedList class that will
 * be used for data storage.
 * 
 * @author Zorian Thornton zorian15
 * @author Ahmad Ayub aayub98
 * @version 2017.04.17
 *
 * @param <T>
 */
public class LinkedList<T> {
    // ~ Fields ................................................................
    /**
     * A reference to the first item on the list.
     */
    Node<T> firstNode;

    /**
     * The size of the list.
     */
    private int size;


    // ~ Constructor ...........................................................
    /**
     * Creates a new LinkedList() object.
     */
    public LinkedList() {
        firstNode = null;
        size = 0;
    }


    // ~ Methods ...............................................................
    /**
     * Returns the size of the list.
     * 
     * @return the size of the list.
     */
    public int getSize() {
        return size;
    }


    /**
     * Returns a boolean explaining if the list is
     * empty or not.
     * 
     * @return the boolean explaining if the list is empty.
     */
    public boolean isEmpty() {
        return (size == 0);
    }


    /**
     * Clears the list by setting the firstNode reference to null,
     * the next reference equal to null, and the size to 0.
     */
    public void clear() {
        firstNode.setNextNode(null);
        firstNode = null;
        size = 0;
    }


    /**
     * Returns the entry of the list at a specified
     * index on the list.
     * 
     * @param index
     *            the index to be returned.
     * @return the entry at the given index.
     */
    public T getEntry(int index) {
        int seekIndex = 0;
        Node<T> curr = firstNode;
        while (seekIndex < index) {
            curr = curr.getNextNode();
            seekIndex++;
        }
        return curr.getData();
    }


    /**
     * Returns the node at that position.
     * 
     * @param givenPostiion
     *            the position
     * @return the node at that position
     */
    private Node<T> getNodeAt(int givenPostiion) {
        Node<T> currentNode = firstNode;
        if ((firstNode != null) && (1 <= givenPostiion)
            && (givenPostiion <= size)) {

            // Traverse the chain to locate the desired node
            // (skipped if givenPosition is 1)
            for (int counter = 1; counter < givenPostiion; counter++) {
                currentNode = currentNode.getNextNode();
            }
        }
        if (currentNode != null) {
            return currentNode;
        }
        else {
            return null;
        }
    }


    /**
     * Adds an entry to the beginning of the list.
     * 
     * @param newEntry
     *            the entry being added
     */
    public void addToFirst(T newEntry) {
        Node<T> newNode = new Node<T>(newEntry);
        newNode.setNextNode(firstNode);
        firstNode = newNode;
    }


    /**
     * Adds a node to the given position.
     * 
     * @param newPosition
     *            the position of the new node
     * @param newEntry
     *            the data of the new node
     */
    public void add(int newPosition, T newEntry) {
        Node<T> newNode = new Node<T>(newEntry);
        Node<T> nodeBefore = getNodeAt(newPosition - 1);
        Node<T> nodeAfter = nodeBefore.getNextNode();
        newNode.setNextNode(nodeAfter);
        nodeBefore.setNextNode(newNode);
    }


    /**
     * Adds a node to the end.
     * 
     * @param newEntry
     *            the data being added
     */
    public void addToLast(T newEntry) {
        Node<T> current = firstNode;
        if (isEmpty()) {
            firstNode = new Node<T>(newEntry);
        }
        else {
            for (int i = 0; i < size - 1; i++) {
                current = current.next;
            }
            current.setNextNode(new Node<T>(newEntry));
        }
        size++;
    }


    private void insertInOrder(Node nodeToInsert, Object arg) {
        Songs item = (Songs)nodeToInsert.getData();
        Node<T> currentNode = firstNode;
        Node<T> previousNode = null;
        // Locate insertion point
        while ((currentNode != null) && (item.compare(currentNode.getData(),
            arg) > 0)) {
            previousNode = currentNode;
            currentNode = currentNode.getNextNode();
        } // end while
          // Make the insertion
        if (previousNode != null) { // Insert between previousNode and
                                    // currentNode
            previousNode.setNextNode(nodeToInsert);
            nodeToInsert.setNextNode(currentNode);
        }
        else // Insert at beginning
        {
            nodeToInsert.setNextNode(firstNode);
            firstNode = nodeToInsert;
        } // end if
    } // end insertInOrder


    public void insertionSort(Object arg) {
        // If zero or one item is in the chain, there is
        // nothing to do
        if (size > 1) {
            assert firstNode != null;
            // Break chain into 2 pieces: sorted and
            // unsorted
            Node<T> unsortedPart = firstNode.getNextNode();
            assert unsortedPart != null;
            firstNode.setNextNode(null);
            while (unsortedPart != null) {
                Node<T> nodeToInsert = unsortedPart;
                unsortedPart = unsortedPart.getNextNode();
                insertInOrder(nodeToInsert, arg);
            } // end while
        } // end if
    } // end insertionSort


    /**
     * The node class to be used in LinkedList.
     * 
     * @author Zorian Thornton zorian15
     * @version 2017.04.18
     * @param <T>
     *            the generic type.
     */
    private static class Node<T> {
        // Data stored in the node.
        private T data;

        // The reference to the next node.
        private Node<T> next;


        /**
         * Creates a new node with data only.
         * This is the default constructor.
         * 
         * @param input
         *            the data to be stored.
         */
        public Node(T input) {
            data = input;
        }


        /**
         * Sets the next node reference.
         * 
         * @param nextNode
         *            the next node to be referenced.
         */
        public void setNextNode(Node<T> nextNode) {
            next = nextNode;
        }


        /**
         * Sets the data of the node.
         * 
         * @param input
         *            the updated data.
         */
        public void setData(T input) {
            data = input;
        }


        /**
         * Retrieves the data from the node.
         * 
         * @return the data stored in the node.
         */
        public T getData() {
            return data;
        }


        /**
         * Retrieves the reference to the next node in
         * the chain.
         * 
         * @return the next node reference.
         */
        public Node<T> getNextNode() {
            return next;
        }
    }
}
