package prj5;

import student.TestCase;

public class LinkedListTest extends TestCase
{

    /**
     * LinkedList<String> list
     */
    private LinkedList<String> list;


    /**
     * Sets up the LinkedList that will be used in all the test casesF
     */
    public void setUp()
    {
        list = new LinkedList<String>();
        list.addToLast("test string");


    }


    public void testAdd()
    {
        assertEquals(1, list.getSize());

        list.addToLast("string1");
        assertEquals(2, list.getSize());

        list.add(1, "insert string");
        assertTrue(list.getEntry(1).equals("insert string"));
        assertEquals("string1", list.getEntry(2));
    }


    public void testGetAt()
    {
        assertTrue(list.getEntry(0).equals("test string"));
    }


    public void testSize()
    {
        assertEquals(1, list.getSize());
    }


    public void testIsEmpty()
    {
        assertFalse(list.isEmpty());
        LinkedList<String> emptyList = new LinkedList<String>();
        assertTrue(emptyList.isEmpty());
    }

}
