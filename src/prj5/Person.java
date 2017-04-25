package prj5;


/**
 * This person class that stores the information
 * of each person that took the survey.
 * @author Zorian Thornton  zorian15
 * @author Ahmad Ayub aayub98
 * @author Harshitha Narayanan hnar
 * @version 2017.04.17
 *
 */
public class Person 
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
    
    /**
     * Strings together hobby, region, and major of the person
     * 
     * @return the hobby, major and region of this person as a string
     */
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append(hobby);
        builder.append(", ");
        builder.append(region);
        builder.append(", ");
        builder.append(major);

        return builder.toString();
    }
    
    /**
     * Determines if this Person object is the same at the argument passed by
     * checking for a null argument, a non-Person argument, and comparing the
     * characteristics of the person argument
     * 
     * @param obj
     *            the object that will be compared
     * @return true if the object passed is a person with the same information
     */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Person compPerson = (Person) obj;
        return this.hobby.equals(compPerson.hobby)
                && this.major.equals(compPerson.major)
                && this.region.equals(compPerson.region);
    }

}
