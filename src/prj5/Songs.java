package prj5;

import java.util.Comparator;

/**
 * Organizes the music in different ways.
 * @author Zorian Thornton  zorian15
 * @author Ahmad Ayub aayub98
 * @version 2017.04.17
 *
 */
public class Songs implements Comparator
{
    /**
     * field for array for the hobbys that have heard a song the hobbys starting
     * at [0] are Read, Art, Sports, and Music respectively
     */
    private int[] hobbyHeard = { 0, 0, 0, 0 };
    /**
     * field for array for the majors that have heard a song the majors starting
     * at [0] are Math or CMDA, Computer Science, Other Engineering, and Other
     * respectively
     */
    private int[] majorHeard = { 0, 0, 0, 0 };
    /**
     * field for array for the regions that have heard a song the regions in the
     * array starting at [0] are Northeast US, Southeast US, the rest of US,
     * Outside of United States
     */
    private int[] regionHeard = { 0, 0, 0, 0 };
    /**
     * field for array for the hobbys that have liked a song the hobbys starting
     * at [0] are Read, Art, Sports, and Music respectively
     */
    private int[] hobbyLikes = { 0, 0, 0, 0 };
    /**
     * field for array for the majors that have heard a song the majors starting
     * at [0] are Math or CMDA, Computer Science, Other Engineering, and Other
     * respectively
     */
    private int[] majorLikes = { 0, 0, 0, 0 };
    /**
     * field for array for the regions that have heard a song the regions in the
     * array starting at [0] are Northeast US, Southeast US, the rest of US,
     * Outside of United States
     */
    private int[] regionLikes = { 0, 0, 0, 0 };
    // Song title
    private String title;
    
    // Song artist
    private String artist;
    
    // Song release year
    private String year;
    
    // Song genre
    private String genre;
    
    /**
     * Creates a new song object.
     * @param   title   the song title
     * @param   artist  the song artist
     * @param   year    the release year
     * @param   genre   the genre of the song.
     */
    public Songs(String title, String artist, String year, String genre)
    {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.genre = genre;
    }
    
    /**
     * Returns the title of the song.
     * @return  The song name.
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Returns the artist's name.
     * @return  The artists name.
     */
    public String getArtist()
    {
        return artist;
    }
    
    /**
     * Returns the year the song was released.
     * @return  the year the song was released.
     */
    public String getYear()
    {
        return year;
    }
    
    /**
     * Returns the genre of the song.
     */
    public String getGenre()
    {
        return genre;
    }
    

    public int compare(Object o1, Object o2)
    {
        // TODO Auto-generated method stub
        return 0;
    }
    
    /**
     * returns the number of that heard for the hobby
     * 
     * @param heard
     *            -the hobby you want
     * @return hobbyHeard for the specified hobby
     */
    public int getHobbyHeard(int heard) {
        return hobbyHeard[heard];
    }

    /**
     * returns the number of that heard for the major
     * 
     * @param heard
     *            -the major you want
     * @return majorHeard for the specified major
     */
    public int getMajorHeard(int heard) {
        return majorHeard[heard];
    }

    /**
     * returns the number of people that heard for the region
     * 
     * @param heard
     *            -the region you want
     * @return regionHeard for the specified region
     */
    public int getRegionHeard(int heard) {
        return regionHeard[heard];
    }

    /**
     * returns the number of likes for the hobby
     * 
     * @param like
     *            -the hobby you want
     * @return hobbyLikes for the specified hobby
     */
    public int getHobbyLiked(int like) {
        return hobbyLikes[like];
    }

    /**
     * returns the number of likes for the major
     * 
     * @param like
     *            -the major you want
     * @return majorLikes for the specified major
     */
    public int getMajorLiked(int like) {
        return majorLikes[like];
    }

    /**
     * returns the number of likes for the region
     * 
     * @param like
     *            -the region you want
     * @return regionLikes for the specified region
     */
    public int getRegionLiked(int like) {
        return regionLikes[like];
    }

    /**
     * increments the array
     * 
     * @param heard
     *            adds a heard to the hobbys heard count
     */
    public void addHeardHobby(int heard) {
        hobbyHeard[heard] += 1;
    }

    /**
     * increments the array
     * 
     * @param heard
     *            adds a heard to the majors heard counnt
     */
    public void addHeardMajor(int heard) {
        majorHeard[heard] += 1;
    }

    /**
     * increments the array
     * 
     * @param heard
     *            adds a heard to the regions heard count
     */
    public void addHeardRegion(int heard) {
        regionHeard[heard] += 1;
    }

    /**
     * increments the array
     * 
     * @param like
     *            adds a like to the hobbys likes
     */
    public void addLikedHobby(int like) {
        hobbyLikes[like] += 1;
    }

    /**
     * increments the array
     * 
     * @param like
     *            adds a like to the majors likes
     */
    public void addLikedMajor(int like) {
        majorLikes[like] += 1;
    }

    /**
     * increments the array
     * 
     * @param like
     *            adds a like to the regions likes
     */
    public void addLikedRegion(int like) {
        regionLikes[like] += 1;
    }

}
