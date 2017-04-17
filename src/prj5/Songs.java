package prj5;

import java.util.Comparator;

/**
 * Organizes the music in different ways.
 * @author Zorian Thornton  zorian15
 * @version 2017.04.17
 *
 */
public class Songs implements Comparator
{
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

}
