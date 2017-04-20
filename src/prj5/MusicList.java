package prj5;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MusicList extends LinkedList<Songs> implements Iterable<Songs>
{

    /**
<<<<<<< HEAD
     * Returns the total number of students that like reading.
     * 
     * @return the total number of students that like reading.
     */
    public int totalReading()
    {
        int num = 0;
        for (int i = 0; i < getSize(); i++)
        {
            num += getEntry(i).getHobbyHeard(0) + getEntry(i).getHobbyLiked(0);
        }
        if (num == 0)
        {
            return 1;
        }
        return num;
    }


    /**
     * Returns the total number of students that like art.
     * 
     * @return the total number of students that like art.
     */
    public int totalArt()
    {
        int num = 0;
        for (int i = 0; i < getSize(); i++)
        {
            num += getEntry(i).getHobbyHeard(1) + getEntry(i).getHobbyLiked(1);
        }
        if (num == 0)
        {
            return 1;
        }
        return num;
    }


    /**
     * Returns the total number of students that like sports.
     * 
     * @return the total number of students that like sports.
     */
    public int totalSports()
    {
        int num = 0;
        for (int i = 0; i < getSize(); i++)
        {
            num += getEntry(i).getHobbyHeard(2) + getEntry(i).getHobbyLiked(2);
        }
        if (num == 0)
        {
            return 1;
        }
        return num;
    }


    /**
     * Returns the total number of students that like music.
     * 
     * @return the total number of students that like music.
     */
    public int totalMusic()
    {
        int num = 0;
        for (int i = 0; i < getSize(); i++)
        {
            num += getEntry(i).getHobbyHeard(3) + getEntry(i).getHobbyLiked(3);
        }
        if (num == 0)
        {
            return 1;
        }
        return num;
    }


    /**
=======
>>>>>>> 90d440a90142c9df44832f465949395e745fd717
     * strings the song list together
     * 
     * @return string of what's in the list
     */
<<<<<<< HEAD
    public String toString()
    {
        int totalReading = 0;
        int totalArt = 0;
        int totalSports = 0;
        int totalMusic = 0;
        String ans = "";
        for (int i = 0; i < getSize(); i++)
        {
=======
    public String toString() {
        String ans = "";
        for (int i = 0; i < getSize(); i++) {
            int totalReading = 0;
            int totalArt = 0;
            int totalSports = 0;
            int totalMusic = 0;
>>>>>>> 90d440a90142c9df44832f465949395e745fd717
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
<<<<<<< HEAD
                / totalReading) * 100.0) + " art:" + ((getEntry(i)
                    .getHobbyHeard(1) / totalArt) * 100) + " sports:"
                + ((getEntry(i).getHobbyHeard(2) / totalSports) * 100)
                + " music" + ((getEntry(i).getHobbyHeard(3) / totalMusic)
                    * 100));
=======
                * 100) / totalReading) + " art:" + ((getEntry(i).getHobbyHeard(
                    1) * 100) / totalArt) + " sports:" + ((getEntry(i)
                        .getHobbyHeard(2) * 100) / totalSports) + " music"
                + ((getEntry(i).getHobbyHeard(3) * 100) / totalMusic));
>>>>>>> 90d440a90142c9df44832f465949395e745fd717
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
<<<<<<< HEAD
        public Songs next()
        {
            if (hasNext())
            {
                @SuppressWarnings("unchecked")
=======
        public Songs next() {
            if (hasNext()) {
>>>>>>> 90d440a90142c9df44832f465949395e745fd717
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


<<<<<<< HEAD
    public Iterator<Songs> iterator()
    {
        return new MusicListIterator();
=======
    public Iterator<Songs> iterator() {
        return new MusicListIterator<Songs>();
>>>>>>> 90d440a90142c9df44832f465949395e745fd717
    }

}
