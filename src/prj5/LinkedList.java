package prj5;

/**
 * The LinkedList class that will
 * be used for data storage.
 * 
 * @author Zorian Thornton zorian15
 * @version 2017.04.17
 *
 * @param <T>
 */
public class LinkedList<T>
{
    // The head reference
    Node<T> head;

    // The size of the list
    private int size;


    /**
     * Creates a new LinedList() object.
     */
    public LinkedList()
    {
        head = null;
        size = 0;
    }


    /**
     * Returns the size of the list.
     * 
     * @return the size of the list.
     */
    public int getSize()
    {
        return size;
    }


    /**
     * Returns a boolean explaining if the list is
     * empty or not.
     * 
     * @return the boolean explaining if the list is empty.
     */
    public boolean isEmpty()
    {
        return (size == 0);
    }


    /**
     * Clears the list by setting the head reference to null,
     * the next reference equal to null, and the size to 0.
     */
    public void clear()
    {
        head.next = null;
        head = null;
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
    public T getEntry(int index)
    {
        int seekIndex = 0;
        Node<T> curr = head;
        T entry = null;
        while (seekIndex < index)
        {
            curr = curr.next;
            seekIndex++;
        }
        return curr.getData();
    }


    /**
     * The node class to be used in LinkedList.
     * 
     * @author Zorian Thornton zorian15
     * @version 2017.04.18
     * @param <T>
     *            the generic type.
     */
    private static class Node<T>
    {
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
        public Node(T input)
        {
            data = input;
        }


        /**
         * Creates a node with data and a next reference.
         * 
         * @param input
         *            the data to be stored.
         * @param nextNode
         *            the next reference
         */
        public Node(T input, Node<T> nextNode)
        {
            data = input;
            next = nextNode;
        }


        /**
         * Sets the next node reference.
         * 
         * @param nextNode
         *            the next node to be referenced.
         */
        public void setNextNode(Node<T> nextNode)
        {
            next = nextNode;
        }


        /**
         * Sets the data of the node.
         * 
         * @param input
         *            the updated data.
         */
        public void setData(T input)
        {
            data = input;
        }


        /**
         * Retrieves the data from the node.
         * 
         * @return the data stored in the node.
         */
        public T getData()
        {
            return data;
        }


        /**
         * Retrieves the reference to the next node in
         * the chain.
         * 
         * @return the next node reference.
         */
        public Node<T> getNextNode()
        {
            return next;
        }

    }

}
