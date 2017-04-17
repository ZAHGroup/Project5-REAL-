package prj5;

import java.util.Comparator;

/**
 * This person class that stores the information
 * of each person that took the survey.
 * @author Zorian Thornton  zorian15
 * @version 2017.04.17
 *
 */
public class Person implements Comparator
{
    // Hobby of the person
    private String hobby;
    
    // Region the person is from
    private String region;
    
    // The major the student is in.
    private String major;
    
    /**
     * Creates a new Person() object.
     * @param   hobby   hobby of the person.
     * @param   region  region of the person.
     * @param   major   the major of the student.
     */
    public Person(String hobby, String region, String major)
    {
        this.hobby = hobby;
        this.region = region;
        this.major = major;
    }
    
    /**
     * Returns the hobby of the person.
     * @return  the hobby of the Person.
     */
    public String getHobby()
    {
        return hobby;
    }
    
    /**
     * Returns the region where the person is from.
     * @return  the region the person is from.
     */
    public String getRegion()
    {
        return region;
    }
    
    /**
     * Returns the major of the person.
     * @return  the major of the person.
     */
    public String getMajor()
    {
        return major;
    }

    public int compare(Object arg0, Object arg1)
    {
        // TODO Auto-generated method stub
        return 0;
    }

}
