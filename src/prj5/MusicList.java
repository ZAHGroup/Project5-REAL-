package prj5;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * A list for Songs objects.
 * 
 * @author Zorian Thornton zorian15
 * @author Ahmad Ayub aayub98
 * @author Harshitha Narayanan hnar
 * @version 2017.04.16
 *
 */
public class MusicList extends LinkedList<Songs> implements Iterable<Songs> 
{

    /**
     * strings the song list together
     * 
     * @return string of what's in the list
     */
    public String toString()
    {
        String ans = "";
        for (int i = 0; i < getSize(); i++)
        {
            int totalReading = 0;
            int totalArt = 0;
            int totalSports = 0;
            int totalMusic = 0;
            totalReading += getEntry(i).getHobbyHeard(0) + getEntry(i)
                .getHobbyLiked(0);
            totalArt += getEntry(i).getHobbyHeard(1) + getEntry(i)
                .getHobbyLiked(1);
            totalSports += getEntry(i).getHobbyHeard(2) + getEntry(i)
                .getHobbyLiked(2);
            totalMusic += getEntry(i).getHobbyHeard(3) + getEntry(i)
                .getHobbyLiked(3);
            if (totalReading == 0)
            {
                totalReading = 1;
            }
            if (totalArt == 0)
            {
                totalArt = 1;
            }
            if (totalSports == 0)
            {
                totalSports = 1;
            }
            if (totalMusic == 0)
            {
                totalMusic = 1;
            }

            ans += "";
            System.out.println("Song Title: " + getEntry(i).getTitle());
            ;
            System.out.println("Song Artist: " + getEntry(i).getArtist());
            System.out.println("Song Genre: " + getEntry(i).getGenre());
            System.out.println("Song Year: " + getEntry(i).getYear());
            System.out.println("Heard");
            System.out.println("reading:" + ((getEntry(i).getHobbyHeard(0)
                * 100) / totalReading) + " art:" + ((getEntry(i).getHobbyHeard(
                    1) * 100)  / totalArt) + " sports:" + ((getEntry(i)
                        .getHobbyHeard(2) * 100) / totalSports) + " music"
                + ((getEntry(i).getHobbyHeard(3) * 100) / totalMusic));
            System.out.println("Likes");
            System.out.println("reading:" + ((getEntry(i).getHobbyLiked(0)
                * 100) / totalReading) + " art:" + ((getEntry(i).getHobbyLiked(
                    1) * 100) / totalArt) + " sports:" + ((getEntry(i)
                        .getHobbyLiked(2) * 100) / totalSports) + " music"
                + ((getEntry(i).getHobbyLiked(3) * 100) / totalMusic));
            System.out.print("\n");
        }

        return ans;
    }


    /**
     * Inner iterator class for the MusicList.
     * 
     * @param <Songs>
     *            Iterates over song objects
     */
    @SuppressWarnings("hiding")
    public class MusicListIterator<Songs> implements Iterator<Songs>
    {
        // The index where the iterator is.
        private int index;


        /**
         * Creates a new MusicListIterator() object.
         * Sets the index at 0.
         */
        public MusicListIterator()
        {
            index = 0;
        }


        /**
         * To see if list has next
         * 
         * @return true if list has next
         */
        public boolean hasNext()
        {
            return index < getSize();
        }


        /**
         * iterates to the next song
         * 
         * @return next entry
         */
        public Songs next()
        {
            if (hasNext())
            {
                @SuppressWarnings("unchecked")
                Songs nextEntry = (Songs)getEntry(index++);
                return nextEntry;
            }
            else
            {
                throw new NoSuchElementException("Illegal call to next(); "
                    + "iterator is after end of list.");
            }
        }
    }


    public Iterator<Songs> iterator()
    {
        return new MusicListIterator<Songs>();
    }

}