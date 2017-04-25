package prj5;

import student.TestCase;

/**
 * Test class for the person class.
 * @author Zorian Thornton  zorian15
 * @author Ahmad Ayub aayub98
 * @author Harshitha Narayanan hnar
 * @version 2017.04.16
 *
 */
public class PersonTest extends TestCase
{

    // Person to be tested.
    private Person person1;


    /**
     * sets up every test case
     */
    public void setUp()
    {
        person1 = new Person("soccer", "New England", "CMDA or math");
    }


    /**
     * tests the 3 get methods within Person: getMajor, getHobby, getRegion
     */
    public void testGets()
    {
        assertEquals("soccer", person1.getHobby());
        assertEquals("CMDA or math", person1.getMajor());
        assertEquals("New England", person1.getRegion());
    }


    /**
     * tests toString method
     */
    public void testToString()
    {
        assertEquals("soccer, New England, CMDA or math", person1
            .toString());
    }


    /**
     * tests all the scenarios outlined within the equals method
     */
    public void testEquals()
    {
        // Compare person1 to themselves
        assertTrue(person1.equals(person1));

        // Compare person1 to a string
        String person2 = "this is not a person object";
        assertFalse(person1.equals(person2));

        // Compare person1 to a different hobby
        Person person3 = new Person("writing", "New England", "CMDA or math");
        assertFalse(person1.equals(person3));

        // Compare person1 to a different major.
        Person person4 = new Person("soccer", "New England", "CompSci");
        assertFalse(person1.equals(person4));

        // Compare person1 to a different region.
        Person person5 = new Person("soccer", "South", "CMDA or math");
        assertFalse(person1.equals(person5));

        // Compare person1 to an identical person
        Person person6 = new Person("soccer", "New England", "CMDA or math");
        assertTrue(person1.equals(person6));

        // Compare person1 to null
        Person person7 = null;
        assertFalse(person1.equals(person7));

    }
}
