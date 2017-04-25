package prj5;
import student.TestCase;

/**
 * Test class for the songs class.
 * @author Zorian Thornton  zorian15
 * @author Ahmad Ayub aayub98
 * @author Harshitha Narayanan hnar
 * @version 2017.04.16
 *
 */
public class SongsTest extends TestCase {
    private Songs song;
    /**
     * sets up each test case
     */
    public void setUp() {
        song = new Songs("Title1", "artist1", "2016", "genre1");
    }
    /**
     * tests getArtist returns correct artist
     */
    public void testGetArtist()
    {
        assertEquals("artist1", song.getArtist());
    }
    /**
     * tests getTitle() returns the correct title
     */
    public void testGetTitle()
    {
        assertEquals("Title1", song.getTitle());
    }
    /**
     * tests getYear() returns the correct year
     */
    public void testGetYear()
    {
        assertEquals("2016", song.getYear());
    }
    /**
     * tests getGenre() returns the correct genre
     */
    public void testGetGenre()
    {
        assertEquals("genre1", song.getGenre());
    }
    /**
     * tests that getHobbyHeard returns correct number
     */
    public void testGetHobbyHeard()
    {
        assertEquals(0, song.getHobbyHeard(1));
    }
    /**
     * tests that getMajorHeard returns correct number
     */
    public void testGetMajorHeard()
    {
        assertEquals(0, song.getMajorHeard(3));
    }
    /**
     * tests that getRegionHeard returns correct number
     */
    public void testGetRegionHeard()
    {
        assertEquals(0, song.getRegionHeard(2));
    }
    /**
     * tests that getHobbyLikes returns correct number
     * 
     */
    public void testGetHobbyLiked()
    {
        assertEquals(0, song.getHobbyLiked(0));
    }
    /**
     * tests that getMajorLikes returns correct number
     * 
     */
    public void testGetMajorLiked()
    {
        assertEquals(0, song.getMajorLiked(0));
    }
    /**
     * tests that getRegionLikes returns correct number
     * 
     */
    public void testGetRegionLiked()
    {
        assertEquals(0, song.getRegionLiked(0));
    }
    /**
     * tests that the add heard count 
     * for hobby works
     */
    public void testaddHobbyHeard()
    {
        assertEquals(0, song.getHobbyHeard(0));
        song.addHeardHobby(0);
        assertEquals(1, song.getHobbyHeard(0));
    }
    /**
     * tests that the add heard count 
     * for major works
     */
    public void testAddHeardMajor()
    {
        assertEquals(0, song.getMajorHeard(3));
        song.addHeardMajor(3);
        assertEquals(1, song.getMajorHeard(3));
    }
    /**
     * tests that the add heard count 
     * for region works
     */
    public void testAddHeardRegion()
    {
        assertEquals(0, song.getRegionHeard(2));
        song.addHeardRegion(2);
        assertEquals(1, song.getRegionHeard(2));
    }
    /**
     * tests that the add like count 
     * for hobby works 
     */
    public void testAddLikedHobby()
    {
        assertEquals(0, song.getHobbyLiked(0));
        song.addLikedHobby(0);
        assertEquals(1, song.getHobbyLiked(0));
    }
    /**
     * tests that the add like count 
     * for major works
     */
    public void testAddLikeMajor()
    {
        assertEquals(0, song.getMajorLiked(1));
        song.addLikedMajor(1);
        assertEquals(1, song.getMajorLiked(1));
    }
    /**
     * tests that the add like count
     * for region works
     */
    public void testAddLikedRegion()
    {
        assertEquals(0, song.getRegionLiked(2));
        song.addLikedRegion(2);
        assertEquals(1, song.getRegionLiked(2));
    }
    /**
     * tests that the toString method correctly
     * prints out each attribute of the song
     * on a new line
     */
    public void testToString()
    {
        String string = "Song Title: Title1" + "\n" +
                "Song Artist: artist1" + "\n" +
                "Song Genre: genre1" + "\n" +
                    "Song Year: 2016" + "\n";
        assertEquals(string, song.toString());
    }
    /**
     * tests that the equals method returns true
     * when the songs are actually equal
     */
    public void testEquals()
    {
        Songs song1 = new Songs("Title1", "artist1",
                "2016", "genre1");
        Songs song2 = new Songs("Title2", "artist1",
                "2016", "genre1");
        Songs song3 = new Songs("Title1", "artist2",
                "2016", "genre1");
        Songs song4 = new Songs("Title1", "artist1",
                "2017", "genre1");
        Songs song5 = new Songs("Title1", "artist1",
                "2016", "genre2");
        Songs song6 = new Songs("Title2", "artist2",
                "2017", "genre2");
        assertTrue(song.equals(song));
        assertFalse(song.equals(null));
        assertFalse(song.equals(3));
        assertTrue(song.equals(song1));
        assertFalse(song.equals(song2));
        assertFalse(song.equals(song3));
        assertFalse(song.equals(song4));
        assertFalse(song.equals(song5));
        assertFalse(song.equals(song6));
        
    }
}